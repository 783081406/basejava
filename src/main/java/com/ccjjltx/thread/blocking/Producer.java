package com.ccjjltx.thread.blocking;

import java.util.concurrent.BlockingQueue;

/**
 * Created by ccjjltx on 2017/4/22.
 *
 * @author ccj
 * @version 1.0
 */
public class Producer extends Thread {
    private BlockingQueue<String> bq;

    public Producer(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        String[] strArr = new String[]{"Java", "Struts", "Spring"};
        for (int i = 0; i < 99999; i++) {
            System.out.println(getName() + "生产者准备生产集合元素!");
            try {
                Thread.sleep(200);
                //尝试放入元素，如果队列已满，则线程被阻塞
                bq.put(strArr[i % 3]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "生产完成:" + bq);
        }
    }
}
