/**
 * Created by ccjjltx on 2017/2/27.
 * Collection接口List、Set和Queue接口的父接口
 * boolean add(Object o):该方法用于向集合里面添加一个元素。如果集合对象被添加操作改变了，这返回true
 * boolean addAll(Collection c):该方法把集合c里的所有元素添加到指定集合厘米里，如果集合对象被操作改变了，则返回true
 * void clear():清除集合里的所有元素，将集合长度变成0
 * boolean contains(Object o):如果此 collection 包含指定的元素，则返回 true
 * boolean containsAll(Collection<?> c):如果此 collection 包含指定 collection 中的所有元素，则返回 true
 * boolean equals(Object o):比较此 collection 与指定对象是否相等
 * int hashCode():返回此 collection 的哈希码值
 * boolean isEmpty():如果此 collection 不包含元素，则返回 true
 * Iterator<E> iterator(): 返回在此 collection 的元素上进行迭代的迭代器
 * boolean remove(Object o):删除集合中指定元素o,当集合中包含了一个或多个元素o时，该方法之删除第一个符合条件的元素，该方法返回true
 * boolean removeAll(Collection c):从集合中删除集合c里面包含的所有元素（相当于用调用该方法的集合减去集合c),
 * 如果删除了一个或一个以上的元素这返回true
 * boolean retainAll(Collection c):从集合中删除集合c里不包含的元素(相当于把调用该方法的集合变成集合c的交集),
 * 如果该操作改变了调用该方法的集合，这该方法返回true
 * int size():该方法返回集合元素的个数
 * Object[] toArray():该方法把集合转换成一个数组，所有的集合元素变成对应的数组元素
 * @author cjj
 * @version 1.0
 */
package com.ccjjltx.collection;