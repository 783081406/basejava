/**
 * Created by ccjjltx on 2017/2/28.
 * Set接口的典型实现，大多数时候使用Set集合时就是使用这个实现类
 * HashSet按Hash算法来存储集合中的元素，因此具有很好的存储和查找性能
 * 特点：
 * 不能保证元素和排序顺序，顺序可能与添加顺序不同，顺序也有可能发生变化
 * HashSet不能同步的，如果多个线程同时访问一个HashSet修改了HashSet集合时，必须通过代码来保证其同步
 * 集合元素可以为null
 * HashSet会调用该对象的hashCode()方法来得到该对象的hashCode值，然后根据该hashCode值决定该对象在HashSet中的存储位置。
 * 如果有两个元素通过equals()方法比较返回true,但他们的hashCode()方法返回值不相等，HashSet将会把他们存储在不同位置，依旧可添加成功
 * 也就是说，HashSet集合判断两个元素相当的标准是两个对象通过equals()方法比较相等，并且每个对象的hashCode()方法返回值也相等
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.set.hashset;