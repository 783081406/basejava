package com.ccjjltx.objectoriented.immutable;

import sun.misc.Cache;

/**
 * Created by ccjjltx on 2017/3/15.
 * 测试缓存实例的不可变类
 *
 * @author ccj
 * @version 1.0
 */
public class CacheImmutableTest {
    public static void main(String[] args) {
        CacheImmutable c1 = CacheImmutable.valueOf("hello");
        CacheImmutable c2 = CacheImmutable.valueOf("hello");
        System.out.println(c1 == c2);//true//说明是同一个对象
    }
}
