package com.ccjjltx.set.linkedhashset;

import java.util.LinkedHashSet;

/**
 * Created by ccjjltx on 2017/2/28.
 * 虽然LinkedHashSet使用了链表记录集合元素的添加顺序，但LinkedHashSet依然是HashSet,
 * 因此他依然不允许集合元素重复
 * 与HashSet没加入新api
 * @author ccj
 * @version 1.0
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> books=new LinkedHashSet<>();
        books.add("123456");
        books.add("7891011");
        //[123456, 7891011]
        System.out.println(books);
        //删除123456
        books.remove("123456");
        //重新添加123456
        books.add("123456");
        //[7891011, 123456]
        System.out.println(books);
    }
}
