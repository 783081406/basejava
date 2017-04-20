/**
 * Created by ccjjltx on 2017/4/20.
 * 有一种线程，后台运行，任务是为其他的线程提供服务，这种县城被称为"后台线程(Daemon Thread)",又称为"守护线程"或"精灵线程"
 * JVM的垃圾回收县城就是典型的后台线程
 * 后台线程有个特征：如果所有的前台县城都死亡，后台线程会自动死亡
 * setDaemon(true)：方法可见指定线程设置成后台线程。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.daemon;