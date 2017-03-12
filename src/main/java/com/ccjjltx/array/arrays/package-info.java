/**
 * Created by ccjjltx on 2017/3/5.
 * static int binarySearch(type[] a,type key):使用二分法查询key元素值在a数组中出现的索引；如果a数组不包含key元素值，则返回负数。
 * 调用该方法时要求数组中元素已经按升序排列，这样才能得到正确结果
 * int binarySearch(type[] a,int fromIndex,int toIndex,type key):只搜索a数组中fromIndex到toIndex索引的元素。
 * static int binarySearch(type[] a,int fromIndex,int toIndex,type key,Comparator<? super T> c)
 * static int binarySearch(type[] a,Comparator<? super t> c)
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
 * void sort(type[] a,Comparator<? super T>
 * void sort(type[] a,int fromIndex,int toIndex,Comparator<? super T>
 * String toString(type[] a):该方法将一个数组转换成一个字符串。该方法按顺序
 * <p>
 * void parallelPrefix(xxx[] array,XxxBinaryOperator op):该方法使用op参数指定的计算公式计算得到的结果作为新的元素。op计算公式包括
 * 当计算left、right两个形参，其中left代表数组中前一个索引处的元素，right代表数组中当前索引处的元素，当第一个新数组元素时，
 * left的值默认为1
 * void parallelPrefix(xxx[] array,int fromIndex,int toIndex,XxxBinaryOperator op):该方法与上一个方法相似，区别是该方法仅重新
 * 计算fromIndex到toIndex索引的元素
 * void setAll(xxx[] array,IntToXxxFunction generator):该方法使用指定的生成器（generator）为所有数组元素设置值，
 * 该生成器控制数组元素的值的生成算法
 * void parallelSetAll(xxx[] array,IntToXxxFunction generator):该方法的功能和上一个相同，只是该方法增加了并行能力，
 * 可以利用多CPU并行来提供性能
 * void parallelSort(xxx[] a):该方法的功能与Arrays类以前就有的sort()方法相似，区别是该方法仅对fromIndex到toIndex索引的元素进行排序
 * Spliterator.OfXxx spliterator(xxx[] array):将该数组的所有元素转换成对应的Spliterator对象
 * Spliterator.OfXxx spliterator(xxx[] array,int startInclusive,int endExclusive):该方法与上一个方法显示，区别是该方法仅转换
 * startInclusive到endExclusive索引的元素
 * XxxStream stream(xxx[] array):该方法将数组转换成Stream
 * XxxStream stream(xxx[] array,int startInclusive,int endExclusive):该方法与上一个相似，区别是该方法仅将formIndex到toIndex索引的
 * 元素转换成Stream
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.array.arrays;