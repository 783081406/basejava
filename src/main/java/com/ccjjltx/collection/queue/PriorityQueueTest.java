package com.ccjjltx.collection.queue;

import java.util.PriorityQueue;

/**
 * Created by ccjjltx on 2017/3/6.
 * PriorityQueue比较标准的队列实现类。保存元素的顺序不是按加入队列的顺序决定而不是按加入队列元素的大小决定的
 * 使用peek()或者poll()取出队列元素时，取出队列元素最小的元素。所以违反了队列的原则
 *
 * @author ccj
 * @version 1.0
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(6);
        pq.offer(-3);
        pq.offer(20);
        pq.offer(18);
        System.out.println(pq);//[-3, 6, 20, 18]
        System.out.println(pq.poll());//-3
    }
}
