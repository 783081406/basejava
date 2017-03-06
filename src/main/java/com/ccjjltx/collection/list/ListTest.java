package com.ccjjltx.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ccjjltx on 2017/3/6.
 *
 * @author ccj
 * @version 1.0
 */
public class ListTest {
    public static void main(String[] args) {
        //增删改查
        oldmethod();
        //删除误区
        remove();
        //java8新增加的方法
        newmethod();
    }

    /**
     * 增删改查
     */
    private static void oldmethod() {
        List<String> books = new ArrayList<>();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        books.add("book4");
        books.add("book5");
        //将新元素插入第二个位置
        books.add(1, "book6");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + "=>" + books.get(i));
        }
        //删除第三个元素
        books.remove(2);
        System.out.println(books);
        //判断指定位置
        System.out.println(books.indexOf("book6"));
        //将第二个位置的元素替换成新字符串对象
        books.set(1, "book2");
        System.out.println(books);
        //截取2到3（不包括）截取成子集合
        System.out.println(books.subList(1, 2));
    }

    /**
     * List判断两个对象相等只通过equals()方法比较返回true即可
     */
    private static void remove() {
        System.out.println("=========================================================");
        List<String> books = new ArrayList<>();
        books.add("book1");
        books.add("book2");
        books.add("book3");
        books.add("book4");
        books.add("book5");
        System.out.println(books);//[book1, book2, book3, book4, book5]
        //删除集合中的A元素对象，将会导致第一个元素被删除
        books.remove(new A());
        System.out.println(books);//[book2, book3, book4, book5]
        //删除集合中的A元素对象，将会导致第一个元素再被删除
        books.remove(new A());
        System.out.println(books);//[book3, book4, book5]
    }

    /**
     * java8新增加的方法
     */
    private static void newmethod(){
        System.out.println("=========================================================");
        List<String> books = new ArrayList<>();
        books.add("book4234");
        books.add("book323");
        books.add("book54344");
        books.add("book1");
        books.add("book2");
        System.out.println(books);
        //使用目标类型为Comparator的Lambda表达式来替换集合中所有元素
        books.sort((o1,o2)->o1.length()-o2.length());
        System.out.println(books);
        //控制使用每个字符串的长度作为新的集合元素
        books.replaceAll(ele->String.valueOf(ele.length()));
    }
}

class A {
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
