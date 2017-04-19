/**
 * Created by ccjjltx on 2017/4/19.
 * Path提供了一个方法来监听文件系统的变化：
 * register(WatchService watcher,WatchEvent.Kind<?>... events);用watcher监听该path代表的目录下的文件变化。events参数指定要监听哪些类型的时间
 * 一旦使用register()方法完成注册之后，接下来就可以调用WatchService的如下三个方法来获取被监听目录的文件变化事件。
 * WatchKey poll():获取下一个WatchKey,如果没有Watchkey发生就立即返回null
 * WatchKey poll(long timeout,TimeUnit unit):尝试等待timeout时间去获取下一个WatchKey.
 * WatchKey take():获取下一个WatchKey,如果没有WatchKey发生就一直等待
 * <p>
 * 如果程序需要一直监控，则应该使用take()方法，如果程序只需要监控指定时间，则可考录使用poll()方法
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.nio2.watchservice;