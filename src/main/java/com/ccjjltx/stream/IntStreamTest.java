package com.ccjjltx.stream;

import java.util.stream.IntStream;

/**
 * Created by ccjjltx on 2017/2/28.
 * 第一种方法：通过Stream接口的静态工厂方法（注意：Java8里接口可以带静态方法）
 *
 * @author ccj
 * @version 1.0
 */
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream is = IntStream.builder().add(20).add(13).add(-2).add(18).build();
        //下面调用聚集方法的方法每次只能执行一行
/*        System.out.println("is所有元素的最大值:"+is.max().getAsInt());
        System.out.println("is所有元素的最小值:"+is.min().getAsInt());
        System.out.println("is所有元素的总和:"+is.sum());
        System.out.println("is所有元素的总数:"+is.count());
        System.out.println("is所有元素的平均值:"+is.average());
        System.out.println("is所有元素的平方是否都大于20:"+is.anyMatch(ele->ele*ele>20));*/
        //将is映射成一个新stream，新stream的每个元素是原stream元素的2倍+1
        IntStream newIs = is.map(ele -> ele * 2 + 1);
        //使用方法引用的方式遍历集合元素
        newIs.forEach(System.out::println);
    }
}
