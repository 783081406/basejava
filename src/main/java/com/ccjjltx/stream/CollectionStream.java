package com.ccjjltx.stream;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by ccjjltx on 2017/2/28.
 * 第二种实例化方法：通过Collection接口的默认方法
 * @author ccj
 * @version 1.0
 */
public class CollectionStream {
    public static void main(String[] args) {
        //创建一个集合
        Collection<String> books = new HashSet<>();
        //增加元素
        books.add("书123456789123");
        books.add("书2");
        books.add("书3");
        books.add("书4567892456");
        //统计书名里面包含89子串的图书数量
        System.out.println(books.stream().filter(ele->ele.contains("89")).count());
        //统计书名里面字符串长度大于10的图书数量
        System.out.println(books.stream().filter(ele->ele.length()>10).count());
        books.stream().mapToInt(ele->ele.length()).forEach(System.out
                ::println);
    }
}
