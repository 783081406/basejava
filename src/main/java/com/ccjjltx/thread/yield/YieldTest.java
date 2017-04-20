package com.ccjjltx.thread.yield;

/**
 * Created by ccjjltx on 2017/4/20.
 *
 * @author ccj
 * @version 1.4
 */
public class YieldTest extends Thread {
    public YieldTest(String name) {
        super(name);
    }

    //定义run()方法作为线程执行体
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + " " + i);
            //当i等于20时，使用yield()方法让当前线程让步
            if (i == 2) {
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //启动两个并发线程
        YieldTest yt1 = new YieldTest("高级");
        //将yt1线程设置成最高优先级
        yt1.setPriority(Thread.MAX_PRIORITY);
        yt1.start();
        YieldTest yt2 = new YieldTest("低级");
        yt2.setPriority(Thread.MIN_PRIORITY);
        yt2.start();
        /*
        高级 0
        高级 1
        高级 2
        高级 3
        高级 4
        高级 5
        高级 6
        高级 7
        高级 8
        高级 9
        高级 10
        高级 11
        高级 12
        高级 13
        高级 14
        高级 15
        高级 16
        高级 17
        高级 18
        高级 19
        高级 20
        高级 21
        高级 22
        高级 23
        高级 24
        高级 25
        高级 26
        高级 27
        高级 28
        高级 29
        高级 30
        高级 31
        高级 32
        高级 33
        高级 34
        高级 35
        高级 36
        高级 37
        高级 38
        高级 39
        高级 40
        高级 41
        高级 42
        高级 43
        高级 44
        高级 45
        高级 46
        高级 47
        高级 48
        高级 49
        低级 0
        低级 1
        低级 2
        低级 3
        低级 4
        低级 5
        低级 6
        低级 7
        低级 8
        低级 9
        低级 10
        低级 11
        低级 12
        低级 13
        低级 14
        低级 15
        低级 16
        低级 17
        低级 18
        低级 19
        低级 20
        低级 21
        低级 22
        低级 23
        低级 24
        低级 25
        低级 26
        低级 27
        低级 28
        低级 29
        低级 30
        低级 31
        低级 32
        低级 33
        低级 34
        低级 35
        低级 36
        低级 37
        低级 38
        低级 39
        低级 40
        低级 41
        低级 42
        低级 43
        低级 44
        低级 45
        低级 46
        低级 47
        低级 48
        低级 49
         */
    }
}
