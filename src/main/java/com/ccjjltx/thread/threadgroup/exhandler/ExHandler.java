package com.ccjjltx.thread.threadgroup.exhandler;

/**
 * Created by ccjjltx on 2017/4/22.
 *
 * @author ccj
 * @version 1.0
 */
public class ExHandler {
    public static void main(String[] args) {
        //设置主线程的异常处理器
        Thread.currentThread().setUncaughtExceptionHandler(new MyExHandler());
        int a = 5 / 0;
        System.out.println("程序正常结束!");
        //Thread[main,5,main]线程出现了异常:java.lang.ArithmeticException: / by zero
    }
}
