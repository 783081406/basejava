/**
 * Created by ccjjltx on 2017/3/11.
 * Deque接口提供了一个典型的实现类：ArrayDeque
 * 它是一个基于数组实现的双端队列，创建Deque时同样可以指定一个numElements参数，该参数用于指定Object[]数组的长度
 * 如果不指定numElements参数，Deque底层的长度为16
 * ArrayList和ArrayDeque两个集合类的实现机制基本相似，它们的底层都采用了一个动态的、可重分配的Object[]数组来存储集合元素，
 * 当集合元素超过了该数组的容量时，系统会在底层重新分配一个Object[]数组来存取集合元素
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.collection.queue.deque.arraydeque;