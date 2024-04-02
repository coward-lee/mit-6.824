package org.lee.log.domain;

import org.lee.election.Endpoint;

public record FailAnalyze(Endpoint endpoint, SyncResult fromResult, int occurEpoch, int occurIndexOfEpoch) {
}

//java -Dconfig.file=C:\Users\oo\Desktop\code\java\mit-6.824\raft\src\main\resources\server1.properties -Dlog.dir=server1 -cp C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\classes\java\test;C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\resources\test;C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\classes\java\main;C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\resources\main;C:\Users\oo\Desktop\code\java\mit-6.824\build\libs\mit-6.824-1.0-SNAPSHOT.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.jctools\jctools-core\4.0.1\e12d5984d45aee3976249400dae1bbcafcf5ff0a\jctools-core-4.0.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-classic\1.4.5\28e7dc0b208d6c3f15beefd73976e064b4ecfa9b\logback-classic-1.4.5.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.slf4j\slf4j-api\2.0.5\3a759df277e854f7c4ca951e5899bcec0dbdca73\slf4j-api-2.0.5.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-core\1.4.5\e9bb2ea70f84401314da4300343b0a246c8954da\logback-core-1.4.5.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.16.2\dfcd11c847ea7276aa073c25f5fe8ee361748d7f\jackson-annotations-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.16.2\b4f588bf070f77b604c645a7d60b71eae2e6ea09\jackson-core-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.datatype\jackson-datatype-jsr310\2.16.2\58e86108e4b1b1e893e7a69b1bbca880acfca143\jackson-datatype-jsr310-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.16.2\7fda67535b54d74eebf6157682b835c847410932\jackson-databind-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.mockito\mockito-all\1.10.19\539df70269cc254a58cccc5d8e43286b4a73bf30\mockito-all-1.10.19.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter\5.9.1\9274d3757e224bc02eae367bd481062a263c150b\junit-jupiter-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter-engine\5.9.1\1bf771097bde296c3ab174861954e8aafaaf2e94\junit-jupiter-engine-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.platform\junit-platform-engine\1.9.1\83591e5089d6cea5f324aa3ecca9b19d5a275803\junit-platform-engine-1.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.platform\junit-platform-commons\1.9.1\3145f821b5cd10abcdc5f925baa5fffa6f1b628f\junit-platform-commons-1.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter-params\5.9.1\ffcd1013edaeee112be11fcddeb38882d79238de\junit-jupiter-params-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter-api\5.9.1\7bb53fbc0173e9f6a9d21d58297af94b1f2f9ce1\junit-jupiter-api-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.opentest4j\opentest4j\1.2.0\28c11eb91f9b6d8e200631d46e20a7f407f2a046\opentest4j-1.2.0.jar org.lee.boot.Bootstrap
//java -Dconfig.file=C:\Users\oo\Desktop\code\java\mit-6.824\raft\src\main\resources\server2.properties -Dlog.dir=server2 -cp C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\classes\java\test;C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\resources\test;C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\classes\java\main;C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\resources\main;C:\Users\oo\Desktop\code\java\mit-6.824\build\libs\mit-6.824-1.0-SNAPSHOT.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.jctools\jctools-core\4.0.1\e12d5984d45aee3976249400dae1bbcafcf5ff0a\jctools-core-4.0.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-classic\1.4.5\28e7dc0b208d6c3f15beefd73976e064b4ecfa9b\logback-classic-1.4.5.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.slf4j\slf4j-api\2.0.5\3a759df277e854f7c4ca951e5899bcec0dbdca73\slf4j-api-2.0.5.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-core\1.4.5\e9bb2ea70f84401314da4300343b0a246c8954da\logback-core-1.4.5.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.16.2\dfcd11c847ea7276aa073c25f5fe8ee361748d7f\jackson-annotations-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.16.2\b4f588bf070f77b604c645a7d60b71eae2e6ea09\jackson-core-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.datatype\jackson-datatype-jsr310\2.16.2\58e86108e4b1b1e893e7a69b1bbca880acfca143\jackson-datatype-jsr310-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.16.2\7fda67535b54d74eebf6157682b835c847410932\jackson-databind-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.mockito\mockito-all\1.10.19\539df70269cc254a58cccc5d8e43286b4a73bf30\mockito-all-1.10.19.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter\5.9.1\9274d3757e224bc02eae367bd481062a263c150b\junit-jupiter-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter-engine\5.9.1\1bf771097bde296c3ab174861954e8aafaaf2e94\junit-jupiter-engine-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.platform\junit-platform-engine\1.9.1\83591e5089d6cea5f324aa3ecca9b19d5a275803\junit-platform-engine-1.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.platform\junit-platform-commons\1.9.1\3145f821b5cd10abcdc5f925baa5fffa6f1b628f\junit-platform-commons-1.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter-params\5.9.1\ffcd1013edaeee112be11fcddeb38882d79238de\junit-jupiter-params-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter-api\5.9.1\7bb53fbc0173e9f6a9d21d58297af94b1f2f9ce1\junit-jupiter-api-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.opentest4j\opentest4j\1.2.0\28c11eb91f9b6d8e200631d46e20a7f407f2a046\opentest4j-1.2.0.jar org.lee.boot.Bootstrap
//java -Dconfig.file=C:\Users\oo\Desktop\code\java\mit-6.824\raft\src\main\resources\server3.properties -Dlog.dir=server3 -cp C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\classes\java\test;C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\resources\test;C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\classes\java\main;C:\Users\oo\Desktop\code\java\mit-6.824\raft\build\resources\main;C:\Users\oo\Desktop\code\java\mit-6.824\build\libs\mit-6.824-1.0-SNAPSHOT.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.jctools\jctools-core\4.0.1\e12d5984d45aee3976249400dae1bbcafcf5ff0a\jctools-core-4.0.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-classic\1.4.5\28e7dc0b208d6c3f15beefd73976e064b4ecfa9b\logback-classic-1.4.5.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.slf4j\slf4j-api\2.0.5\3a759df277e854f7c4ca951e5899bcec0dbdca73\slf4j-api-2.0.5.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-core\1.4.5\e9bb2ea70f84401314da4300343b0a246c8954da\logback-core-1.4.5.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.16.2\dfcd11c847ea7276aa073c25f5fe8ee361748d7f\jackson-annotations-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.16.2\b4f588bf070f77b604c645a7d60b71eae2e6ea09\jackson-core-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.datatype\jackson-datatype-jsr310\2.16.2\58e86108e4b1b1e893e7a69b1bbca880acfca143\jackson-datatype-jsr310-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.16.2\7fda67535b54d74eebf6157682b835c847410932\jackson-databind-2.16.2.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.mockito\mockito-all\1.10.19\539df70269cc254a58cccc5d8e43286b4a73bf30\mockito-all-1.10.19.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter\5.9.1\9274d3757e224bc02eae367bd481062a263c150b\junit-jupiter-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter-engine\5.9.1\1bf771097bde296c3ab174861954e8aafaaf2e94\junit-jupiter-engine-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.platform\junit-platform-engine\1.9.1\83591e5089d6cea5f324aa3ecca9b19d5a275803\junit-platform-engine-1.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.platform\junit-platform-commons\1.9.1\3145f821b5cd10abcdc5f925baa5fffa6f1b628f\junit-platform-commons-1.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter-params\5.9.1\ffcd1013edaeee112be11fcddeb38882d79238de\junit-jupiter-params-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.junit.jupiter\junit-jupiter-api\5.9.1\7bb53fbc0173e9f6a9d21d58297af94b1f2f9ce1\junit-jupiter-api-5.9.1.jar;C:\Users\oo\.gradle\caches\modules-2\files-2.1\org.opentest4j\opentest4j\1.2.0\28c11eb91f9b6d8e200631d46e20a7f407f2a046\opentest4j-1.2.0.jar org.lee.boot.Bootstrap
//