package com.ccjjltx.thread.deadlock;

/**
 * Created by ccjjltx on 2017/4/21.
 *
 * @author ccj
 * @version 1.0
 */
public class A {
    public synchronized void foo(B b) {
        System.out.println("当前线程名:" + Thread.currentThread().getName() + "进入了A实例的foo()方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("当前线程名:" + Thread.currentThread().getName() + "企图调用B实例的last()方法");
        b.last();
    }

    public synchronized void last() {
        System.out.println("进入A类的last()方法");
    }
}
