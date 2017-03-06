/**
 * Created by ccjjltx on 2017/3/2.
 * 与HashSet集合相比，TreeSet还提供了如下几个额外的方法：
 * Comparator comparator():如果TreeSet采用了定制排序，则该方法返回定制排序所使用的Comparator;
 * 如果TreeSet采用了自然排序，这返回null
 * Object first():返回集合中的第一个元素
 * Object last():返回集合中的最后一个元素
 * Object lower(Object e):返回集合中位于指定元素之前的元素（即小于指定元素的最大元素，参考元素不需要是TreeSet集合里面的元素)
 * Object higher(Object e):返回集合中位于指定元素之后的元素（即大于制定元素的最小元素，参考元素不需要是TreeSet集合里面的元素)
 * SortedSet subSet(Object fromElement,Object toElement):返回此Set的子集合，范围从fromElement(包含)到toElement(不包含)
 * SortedSet headSet(Object toElement):返回此Set的子集，由小于toElement的元素组成
 * SortedSet tailSet(Object fromElement):返回此Set的子集，由大于或等于fromElement的元素组成
 * 表面看起来这些方法很多，其实他们很简单：因为TreeSet中的元素是有序的，所有增加了访问第一个、前一个、后一个、最后一个元素
 * 的方法，并提供了三个从TreeSet中截取子TreeSet的方法
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.collection.set.treeset;