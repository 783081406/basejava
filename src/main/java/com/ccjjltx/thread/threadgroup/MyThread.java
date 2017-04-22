package com.ccjjltx.thread.threadgroup;

/**
 * Created by ccjjltx on 2017/4/22.
 *
 * @author ccj
 * @version 1.0
 */
public class MyThread extends Thread {
    //提供指定线程名的构造器
    public MyThread(String name) {
        super(name);
    }

    //提供指定线程名、线程组的构造器
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + "线程的i变量" + i);
        }
    }
}
