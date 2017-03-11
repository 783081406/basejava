package com.ccjjltx.collection.queue.deque.linkedlist;

import java.util.LinkedList;

/**
 * Created by ccjjltx on 2017/3/11.
 *
 * @author ccj
 * @version 1.0
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<>();
        //将字符串元素加入队列的尾部
        books.offer("book1");
        //将一个字符串加入栈的顶部
        books.push("book2");
        //将一个字符串加入队列的头部（相当于堆栈的顶部）
        books.offerFirst("book3");
        //以List的方式（按索引访问的方式）来遍历集合元素
        for (int i = 0; i < books.size(); i++) {
            System.out.println("遍历中:" + books.get(i));
        }
        /*
        遍历中:book3
        遍历中:book2
        遍历中:book1
         */
        //访问并不删除栈顶的元素
        System.out.println(books.peekFirst());//book3
        //访问并不删除队列的最后一个元素
        System.out.println(books.peekLast());//book1
        //将栈顶的元素弹出"栈"
        System.out.println(books.pop());//book3
        System.out.println(books);//[book2, book1]
        //访问并且删除最后一个元素
        System.out.println(books.pollLast());//book1
        System.out.println(books);//[book2]
    }
}
