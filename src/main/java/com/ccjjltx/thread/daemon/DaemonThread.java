package com.ccjjltx.thread.daemon;

/**
 * Created by ccjjltx on 2017/4/20.
 *
 * @author ccj
 * @version 1.0
 */
public class DaemonThread extends Thread {
    //定义后台线程的线程执行体与普通线程没有任何区别
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        DaemonThread t = new DaemonThread();
        //将此线程设置成后台线程
        t.setDaemon(true);
        //启动后台线程
        t.start();
        Thread.sleep(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        //前台线程main线程结束
        //后台县城也随之结束
    }
}
