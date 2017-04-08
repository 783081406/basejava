/**
 * Created by ccjjltx on 2017/2/28.
 * Set集合和Collection基本相同，Set集合不允许包含相同的元素，如果试图把两个相同的元素加入同一个Set集合中
 * 则添加操作失败，add()方法返回false，切新元素不会被加入
 * <p>
 * HashSet的性能总是比TreeSet好（特别是最常用的添加、查询元素等操作），因为TreeSet需要额外的红黑树算法来维护集合元素的次序。
 * 只有当需要一个保持排序的Set时，才应该使用TreeSet，否则应该使用HashSet
 * LinkedHashSet对于普通的插入、删除操作，LinkedHashSet比HashSet要稍微慢一点，这是由维护链表说带来的额外开销造成的，但由于有了链表，
 * 遍历LinkedHashSet会更快
 * EnumSet是所有Set实现类中性能最好的，但它只能保存同一个枚举类作为集合元素。
 * HashSet,TreeSet和EnumSet都是线程不安全的
 * 可以通过Collections工具类的synchronizedSortedSet方法来“包装”该Set集合。此操作最好在创建时进行，以防止对Set集合的意外非同步访问
 * 如：SortedSet s=Collections.synchronizedSortedSet(new TreeSet(...));
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.collection.set;