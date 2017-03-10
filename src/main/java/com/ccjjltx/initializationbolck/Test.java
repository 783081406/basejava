package com.ccjjltx.initializationbolck;

/**
 * Created by ccjjltx on 2017/3/10.
 *
 * @author ccj
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
        /*
        Root的静态初始化块
        Mid的静态初始化块
        Leaf的静态初始化块
        Root的普通初始化块
        Root的无参构造器
        Mid的普通初始化块
        Mid的无参构造函数
        Leaf的普通初始化块
        执行Leaf的构造函数
        Root的普通初始化块
        Root的无参构造器
        Mid的普通初始化块
        Mid的无参构造函数
        Leaf的普通初始化块
        执行Leaf的构造函数
         */
    }
}
