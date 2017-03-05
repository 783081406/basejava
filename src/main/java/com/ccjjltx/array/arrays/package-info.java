/**
 * Created by ccjjltx on 2017/3/5.
 * static int binarySearch(type[] a,type key):使用二分法查询key元素值在a数组中出现的索引；如果a数组不包含key元素值，则返回负数。
 * 调用该方法时要求数组中元素已经按升序排列，这样才能得到正确结果
 * int binarySearch(type[] a,int fromIndex,int toIndex,type key):只搜索a数组中fromIndex到toIndex索引的元素。
 * type[] copyOf(type[] original,int length):这个方法将会把original数组复制成一个新数组，其中length是新数组的长度。
 * 如果length小于original数组的长度，这新数组就是原数组的前面length个元素：如果length小于original数组的长度，
 * 则新数组的前面元素就是原数组的所有元素，后面补充0（数值类型）、false（布尔类型）或者null（引用类型）
 * type[] copyOfRange(type[] original,int from int to):这个方法与前面方法相似，但这个只复制original数组的from索引到to索引的元素
 * boolean equals(type[] a,type[] a2):如果a数组和a2数组的长度相等，而且a数组和a2数组的数组元素也一一相同，该方法将返回true
 * void fill(type[] a,type val):该方法将会把a数组的所有元素都赋值为val
 * void fill(type[] a,int fromIndex,int toIndex,type val):该方法与前一个方法的作用相同，
 * 区别该方法仅仅将a数组的fromIndex到toIndex索引的数组元素赋值为val
 * void sort(type[] a):该方法对a数组的元素进行排序
 * void sort(type[] a,int fromIndex,int toIndex):该方法与前一个方法相似，区别是该方法仅仅对fromIndex到toIndex索引的元素进行排序
 * String toString(type[] a):该方法将一个数组转换成一个字符串。该方法按顺序
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.array.arrays;