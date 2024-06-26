package org.lee.heartbeat;

import org.lee.common.Constant;
import org.lee.heartbeat.handler.HeartBeatHandler;
import org.lee.rpc.Server;

public class HeartBeatReceiver {

    private final Server listener;

    public HeartBeatReceiver(Server listener) {
        this.listener = listener;
    }

    public void startListenHeartBeat(){
        listener.register(Constant.HEART_BEAT_PATH,new HeartBeatHandler(listener.getContext()));
    }
    public void startListenHeartBeat(HeartBeatHandler heartBeatHandler){
        listener.register(Constant.HEART_BEAT_PATH,heartBeatHandler);
    }
}
