package com.ccjjltx.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by ccjjltx on 2017/3/6.
 * ListIterator继承Iterator，下面方法是在Iterator基础上新增加方法
 * void add(E e):在指定位置插入一个元素
 * boolean hasPrevious():返回该迭代器的上一个元素
 * Object previous():返回该迭代器的上一个元素
 * void set(E e):取代过去元素
 *
 * @author ccj
 * @version 1.0
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        books.add("book4");
        books.add("book5");
        ListIterator<String> list = books.listIterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }
        //数据的游标到了最后一个了，如果再有hasNext()和next()是没有一点作用的
        System.out.println("=======================下面开始反向迭代==================");
        while (list.hasPrevious()) {
            System.out.println(list.previous());
        }
    }
}
