/**
 * Created by ccjjltx on 2017/3/6.
 * 模拟队列这种数据结构，常用方法：
 * void add(Object e):指定元素加入队列的尾部
 * Object element():获取队列头部的元素，但是不删除该元素
 * boolean offer(Object e):将指定元素加入此队列的尾部。当使用有容量限制的队列时，此方法通常比add好
 * Object peek():获取队列头部的元素，但是不删除该元素。如果此队列为空，则返回null
 * Object poll():获得队列头部的元素，并且删除该元素。如果此队列为空，则返回null
 * Object remove():获取队列头部的元素，并删除元素
 * 子接口Deque代表一个“双端队列”，双端队列可以同时从两段添加、删除元素，因此Deque的实现类既可以当成队列使用，也可以当成栈使用
 * Deque的两个实现类：ArrayDeque和LinkedList
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.collection.queue;