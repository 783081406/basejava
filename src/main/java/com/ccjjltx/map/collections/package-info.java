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
 *
 * Collections提供的用于查找、替换集合元素的类方法：
 * int binarySearch(List list,Object key):使用二分搜索法指定的List集合，以获得指定对象在List集合中的索引。如果要使用该方法可以
 * 正常工作，则必须保证List中元素已经处于有序状态。
 * Object max(Collection coll):根据元素的自然顺序，返回给定集合中的最大元素
 * Object max(Collection coll,Comparator comp):根据Comparator指定的顺序，返回给定集合中的最大元素
 * Object min(Collection coll):根据元素的自然排序，返回给定集合中的最小元素
 * Object min(Collection coll,Comparator comp):根据Comparator指定的顺序，返回给定集合中的最小元素
 * void fill(List list,Object obj):使用指定元素obj替换指定List集合中的所有元素
 * int frequency(Collection c,Object 0):返回指定集合中指定元素的出现次数
 * int indexOfSubList(List source,List target):返回子List对象在父List对象中第一次出现的位置索引：如果父List中没有出现这样的子List,返回-1
 * int lastIndexOfSubList(List source,List target):返回子List对象在父List对象中最后一个出现的位置索引；如果父List中没有出现这样的子List，则
 * 返回-1
 * boolean replaceAll(List list,Object oldVal,Object newVal):使用一个新值newVal替换List对象的所有旧值oldVal.
 *
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.collections;