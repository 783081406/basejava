package com.ccjjltx.objectoriented.implement;

/**
 * Created by ccjjltx on 2017/3/15.
 *
 * @author ccj
 * @version 1.0
 */
public interface Output {
    //接口里面定义的成员变量只能是类常量
    //系统默认会自动加public static final
    int MAX_CACHE_LINE = 50;

    //接口定义的普通方法只能是public的抽象方法
    //系统默认会自动加public static
    void out();

    void getDate(String msg);

    //java8在接口中定义默认方法，默认使用default修饰
    default void print(String... msgs) {
        for (String msg : msgs) {
            System.out.println(msg);
        }
    }

    //默认方法不能使用static修饰
    //要由子实现类来调用
    default void test() {
        System.out.println("默认的test()方法");
    }

    //接口中定义类方法，需要使用static修饰
    static String staticTest() {
        return "接口里的类方法";
    }
}
