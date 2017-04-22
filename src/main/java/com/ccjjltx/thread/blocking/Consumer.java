package com.ccjjltx.thread.blocking;

import java.util.concurrent.BlockingQueue;

/**
 * Created by ccjjltx on 2017/4/22.
 *
 * @author ccj
 * @version 1.0
 */
public class Consumer extends Thread {
    private BlockingQueue<String> bq;

    public Consumer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    public void run() {
        while (true) {
            System.out.println(getName() + "消费者准备消费集合元素!");
            try {
                Thread.sleep(200);
                //尝试取出元素，如果队列已经空，则线程被阻塞
                bq.take();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "消费完成" + bq);
        }
    }
}
