package com.ccjjltx.objectoriented.immutable;

/**
 * Created by ccjjltx on 2017/3/15.
 * Integer就是一个自带缓存实例的不可类
 *
 * @author ccj
 * @version 1.0
 */
public class IntegerTest {
    public static void main(String[] args) {
        //如果采用new构造器来创建Integer对象，则每次返回全新的Integer对象；如果采用valueOf()则会缓存
        //生成新对象
        Integer i1 = new Integer(6);
        //生成新对象并且缓存该对象
        Integer i2 = Integer.valueOf(6);
        Integer i3 = Integer.valueOf(6);
        System.out.println(i1 == i2);//false
        System.out.println(i2 == i3);//true
        //由于缓存池只能缓存-128~127之间的值
        //因此200没有被缓存
        Integer i4 = Integer.valueOf(200);
        Integer i5 = Integer.valueOf(200);
        System.out.println(i4 == i5);//false
    }
}
