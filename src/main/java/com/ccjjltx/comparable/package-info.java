/**
 * Created by ccjjltx on 2017/3/1.
 * @author ccj
 * @version 1.0
 * @deprecated "Comparator"和"Comparable"的比较程序
 * 1.Comparable
 * 他是一个排序接口，只包含一个函数compareTo()
 * 一个类实现了Comparable接口，就以为着"该类本身支持排序",他可以直接通过Arrays.sort()或Collection.sort()进行排序
 * 2.Comparator
 * 它是一个比较器接口，主要有两个函数:compare()和equals()
 * 一个类实现了Comparator接口，那么它就是一个"比较器".其他的类，可以根据该比较器去排序
 * 综上所述:Comparable是内部比较器，而Comparator是外部比较器
 * 一个类本身实现了Comparable比较器，就意味着它本身支持排序；若它本身没实现Comparable,也可以通过外部比较器Comparator进行排序
 */
package com.ccjjltx.comparable;