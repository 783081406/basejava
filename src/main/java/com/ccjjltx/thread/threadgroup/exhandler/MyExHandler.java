package com.ccjjltx.thread.threadgroup.exhandler;

/**
 * Created by ccjjltx on 2017/4/22.
 *
 * @author ccj
 * @version 1.0
 */
public class MyExHandler implements Thread.UncaughtExceptionHandler {
    //实现uncaughtException()方法，该方法将处理线程的未处理异常
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(t + "线程出现了异常:" + e);
    }
}
