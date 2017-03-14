/**
 * Created by ccjjltx on 2017/3/14.
 * 提供了艺哥操作Set、List和Map等集合的工具类；
 * 该工具类里提供了大量方法对集合元素进行排序、查询和修改等操作，还提供了将集合对象设置为不可变、对集合对象实现同步控制等方法
 * 对List集合进行排序操作：
 * void reverse(List list):反转指定List集合中元素的顺序
 * void shuffle(List list):对List集合元素进行随机排序（shuffle方法模拟了"洗牌"动作)
 * void sort(List list):根据元素的自然顺序对指定List集合的元素按升序进行排序
 * void sort(List list,Comparator c):根据制定Comparator产生的顺序对List集合元素进行排序
 * void swap(List list,int i,int j);将指定List集合中的i处元素和j处元素进行交换
 * void rotate(List list,int distance):但distance为正数时，将list集合的后distance个元素"整体"移到前面；当distance为负数时，
 * 将list集合的前distance个元素"整体"移到后面。该方法不会改变集合的长度
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.collections;