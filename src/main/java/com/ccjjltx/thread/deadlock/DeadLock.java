package com.ccjjltx.thread.deadlock;

/**
 * Created by ccjjltx on 2017/4/21.
 * 原因:
 * 1.一个线程的线程执行体是run()方法，另一个是init()方法
 * 2.结果是init()先执行，调用了A对象的foo()方法，进入foo()方法之前，该对象对A对象加锁
 * 3.主线程暂停200ms
 * 4.cpu切换到执行另一个线程，让B对象执行bear()方法，所以看到副线程开始执行B实例的bar(),执行bar()方法之前，该线程对B对象加锁
 * 5.副线程暂停200ms,主线程先醒来，继续向下执行，希望调用B对象的last()方法——执行该方法之前相对B对象加锁
 * 6.但此时副线程正保持B对象的锁，所以线程堵塞
 * 7.副线程醒来，继续向下执行，希望调用last()方法——执行该方法之前必须先对A对象加锁，但此时主线程没有释放对A对象的锁
 * 8.主线程保留着A对象的锁，等待对B对象加锁，两个线程互相等待对象先释放，所以就出现了死锁。
 *
 * @author ccj
 * @version 1.0
 */
public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();

    public void init() {
        Thread.currentThread().setName("主线程");
        // 调用a对象的foo方法
        a.foo(b);
        System.out.println("进入了主线程之后");
    }

    public void run() {
        Thread.currentThread().setName("副线程");
        // 调用b对象的bar方法
        b.bar(a);
        System.out.println("进入了副线程之后");
    }

    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        // 以dl为target启动新线程
        new Thread(dl).start();
        // 调用init()方法
        dl.init();
        /*
        当前线程名:主线程进入了A实例的foo()方法
        当前线程名:副线程进入了B实例的bar()方法
        当前线程名:主线程企图调用B实例的last()方法
        当前线程名:副线程企图调用A实例化的last()方法
         */
    }
}
