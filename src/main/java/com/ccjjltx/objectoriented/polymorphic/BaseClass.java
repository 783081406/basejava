package com.ccjjltx.objectoriented.polymorphic;

/**
 * Created by ccjjltx on 2017/3/9.
 * 多态测试，模拟父类
 *
 * @author ccj
 * @version 1.0
 */
public class BaseClass {
    public int bookPrice = 23;
    public String bookName = "book_name";

    public void base() {
        System.out.println("父类的普通方法");
    }

    public void test() {
        System.out.println("父类的被覆盖的方法");
    }
}
