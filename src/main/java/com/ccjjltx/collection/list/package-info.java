/**
 * Created by ccjjltx on 2017/3/6.
 * List集合代表一个元素有序,可重复的集合,集合中每个元素都有其对应的顺序索引.
 * List元素允许使用重复元素,可以通过索引来访问指定位置的集合元素.List默认按元素添加顺序设置的元素的索引,例如第一次添加索引为0
 * void add(int index,Object element):将元素element插入到List集合的index处
 * boolean addAll(int index,Collection c):将集合所包含的所有元素都插入到List集合的index处
 * Object get(int index):返回集合index索引处的元素
 * int indexOf(Object o):返回对象o在List集合中第一次出现的位置索引
 * int lastIndexOf(Object o):返回对象o在List集合中最后一次出现的位置索引
 * Object remove(int index):删除并且返回index索引处的元素
 * Object set(int index,Object obj):将index索引处的元素替换成element对象，返回被替换的旧元素
 * List subList(int fromIndex,int lastIndex):返回从索引fromIndex(包含)到索引toIndex(不包含处所有集合元素组合的子集合)
 * <p>
 * 与Set集合相比，List增加了根据索引来插入、替换和删除集合元素的方法。
 * <p>
 * java8新增加两个默认方法
 * void replaceAll(UnaryOperator operator):根据operator指定的计算规则重新设置List集合的所有元素
 * void sort(Comparator c):根据Comparator参数对List集合的元素排序
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.collection.list;