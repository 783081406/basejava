package com.ccjjltx.thread.threadgroup;

/**
 * Created by ccjjltx on 2017/4/22.
 *
 * @author ccj
 * @version 1.0
 */
public class ThreadGroupTest {
    public static void main(String[] args) {
        //获取主线程所在的线程组，这就是线程默认的线程组
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        System.out.println("主线程的名字:" + mainGroup.getName());
        System.out.println("主线程后台线程组:" + mainGroup.isDaemon());
        new MyThread("主线程组的线程").start();
        ThreadGroup tg = new ThreadGroup("新线程组");
        tg.setDaemon(true);
        System.out.println("tg线程组是否是后台线程组:" + tg.isDaemon());
        MyThread tt = new MyThread(tg, "tg组和线程甲");
        tt.start();
        new MyThread(tg, "rg组的线程乙").start();
    }
}
