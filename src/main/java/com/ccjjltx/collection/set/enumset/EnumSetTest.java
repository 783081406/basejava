package com.ccjjltx.collection.set.enumset;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

import static java.util.EnumSet.complementOf;

/**
 * Created by ccjjltx on 2017/4/8.
 *
 * @author ccj
 * @version 1.0
 */
public class EnumSetTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        //创建一个EnumSet集合，集合元素就是Season枚举类的全部枚举值
        EnumSet<Season> es1 = EnumSet.allOf(Season.class);
        System.out.println(es1);//[SPRING, SUMMER, FALL, WINTER]
        //创建一个EnumSet空集合，指定其集合元素是Season类的枚举值
        EnumSet<Season> es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);//[]
        //手动添加两个元素
        es2.add(Season.WINTER);
        es2.add(Season.SPRING);
        System.out.println(es2);//[SPRING, WINTER]
        //以指定枚举值创建EnumSet集合
        EnumSet es3 = EnumSet.of(Season.SUMMER, Season.WINTER);
        System.out.println(es3);//[SUMMER, WINTER]
        EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
        System.out.println(es4);//[SUMMER, FALL, WINTER]
        //新创建的EnumSet集合元素和es4集合元素有相同的类型
        //es5集合元素+es4集合元素=Season枚举类的全部枚举值
        EnumSet es5 = EnumSet.complementOf(es4);
        System.out.println(es5);//[SPRING]
    }

    private static void test2() {
        System.out.println("======================================");
        Collection<Season> c = new HashSet<>();
        c.clear();
        c.add(Season.FALL);
        c.add(Season.SPRING);
        //复制Collection集合中的所有元素来创建EnumSet集合
        EnumSet<Season> enumSet = EnumSet.copyOf(c);
        System.out.println(enumSet);//[SPRING, FALL]
    }
}

enum Season {
    SPRING, SUMMER, FALL, WINTER
}