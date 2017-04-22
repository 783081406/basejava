package com.ccjjltx.thread.blocking;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ccjjltx on 2017/4/22.
 *
 * @author ccj
 * @version 1.0
 */
public class BlockingQueueTest2 {
    public static void main(String[] args) {
        //创建一个容量为1的BlockingQueue
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(1);
        //启动3个生产者线程
        new Producer(bq).start();
        new Producer(bq).start();
        new Producer(bq).start();
        //启动一个消费者线程
        new Consumer(bq).start();
    }
}
