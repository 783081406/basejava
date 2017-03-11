package com.ccjjltx.collection.queue.deque.arraydeque;

import java.util.ArrayDeque;

/**
 * Created by ccjjltx on 2017/3/11.
 *
 * @author ccj
 * @version 1.0
 */
public class ArrayDequeTest {
    public static void main(String[] args) {
        testStack();
        testQueue();
    }

    /**
     * ArrayDeque当成栈来使用，
     * 同时尽量避免Stack-因为Stack是古老的集合，性能较差
     */
    private static void testStack() {
        ArrayDeque<String> stack = new ArrayDeque<>();
        //依次将三个元素push入栈
        stack.push("book1");
        stack.push("book2");
        stack.push("book3");
        //[book3, book2, book1]
        System.out.println(stack);
        //访问第一个元素，但并不是pop出栈
        System.out.println(stack.peek());//book3
        //[book3, book2, book1]
        System.out.println(stack);
        //访问第一个元素，并且删除
        System.out.println(stack.pop());//book3
        System.out.println(stack);//[book2, book1]
    }

    /**
     * 把ArrayDeque当成队列使用，按照先进先出
     */
    private static void testQueue() {
        System.out.println("=============================================");
        ArrayDeque<String> queue = new ArrayDeque<>();
        //依次将三个元素加入队列
        queue.offer("book1");
        queue.offer("book2");
        queue.offer("book3");
        System.out.println(queue);//[book1, book2, book3]
        //访问队列头部的元素，但不是poll出队列“栈”
        System.out.println(queue.peek());//book1
        System.out.println(queue);//[book1, book2, book3]
        //poll出第一个元素并且删除
        System.out.println(queue.poll());//book1
        System.out.println(queue);//[book2, book3]
    }
}
