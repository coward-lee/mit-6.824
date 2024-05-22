package org.lee.rpc;


import org.lee.common.Context;
import org.lee.common.GlobalConfig;
import org.lee.common.utils.ThreadUtil;
import org.lee.rpc.common.RpcUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadPoolExecutor;

import static org.lee.rpc.common.RpcUtil.readToString;

/**
 * The class listen command from client(or other server),and response result
 */
public abstract class Server implements AutoCloseable {


    private final Logger log = LoggerFactory.getLogger(Server.class);

    private GlobalConfig globalConfig;
    private Context context;
    private final Dispatcher dispatcher = new Dispatcher();

    public Server(int listenPort) {
        GlobalConfig config = new GlobalConfig();
        config.setCurrentPort(listenPort);
        init(config);
    }

    public Server(GlobalConfig globalConfig, Context context) {
        init(globalConfig);
        this.context = context;
    }

    public void init(GlobalConfig globalConfig) {
            this.globalConfig = globalConfig;
            int listenPort = globalConfig.getCurrentPort();
            globalConfig.setCurrentPort(listenPort);
    }

    public CompletableFuture<Void> start(){
        return listen();
    }

    public abstract CompletableFuture<Void> listen();


    public void register(String path, Handler handler) {
        log.info("register:{}", path);
        dispatcher.register(path, handler);
    }


    public GlobalConfig getGlobalConfig() {
        return globalConfig;
    }

    public Context getContext() {
        return context;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }
}
