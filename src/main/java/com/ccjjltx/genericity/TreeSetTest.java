package com.ccjjltx.genericity;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by ccjjltx on 2017/4/9.
 * 通过带下限的通配符的语法，可以创建TreeSet对象时灵活地选择合适的Comparator。假定需要创建一个TreeSet<String>集合，并传入
 * 一个可以比较String大小的Comparator，这个Comparator既可以是Comparator<String>，也可以是Comparator<Object>——只是尖括号里
 * 传入的类型是String的父类型（或它本身）即可。
 *
 * @author ccj
 * @version 1.0
 */
public class TreeSetTest {
    public static void main(String[] args) {
        //Comparator的实际类型是TreeSet的元素类型的父类
        TreeSet<String> ts1 = new TreeSet<>(
                new Comparator<Object>() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        return o1.hashCode() > o2.hashCode() ? 1 : o1.hashCode() < o2.hashCode() ? -1 : 0;
                    }
                });
        ts1.add("hello");
        ts1.add("wa");
        //Comparator的实际类型是TreeSet元素的类型，满足要求
        TreeSet<String> ts2 = new TreeSet<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length() > o2.length() ? -1 : o1.length() < o2.length() ? 1 : 0;
                    }
                });
        ts2.add("hello");
        ts2.add("wa");
        System.out.println(ts1);//[wa, hello]
        System.out.println(ts2);//[hello, wa]
    }
}
