package com.ccjjltx.objectoriented.nestedclasses.anonymous;

/**
 * Created by ccjjltx on 2017/3/18.
 *
 * @author ccj
 * @version 1.0
 */
public class ATest {
    public static void main(String[] args) {
        int age = 8;
        A a = new A() {
            public void test() {
                //从Java8以前下面的语句错误，age必须使用final修饰
                //在Java8开始，匿名内部类、局部内部类允许访问非final的局部变量
                System.out.println(age);
                //下面语句错误，将导致无法自动使用final修饰age局部变量
                //age=2;
                //必须按有final修饰的方式来使用,也就是一次赋值后,以后不能重新赋值
            }
        };
    }
}

interface A {
    void test();
}