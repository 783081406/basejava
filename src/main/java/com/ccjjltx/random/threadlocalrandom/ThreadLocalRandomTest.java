package com.ccjjltx.random.threadlocalrandom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by ccjjltx on 2017/2/26.
 * 继承Random
 * @author ccj
 * @version 1.0
 */
public class ThreadLocalRandomTest {
    /**
     * 继承Random,所以Random api同样适用
     * @param args 输入
     */
    public static void main(String[] args) {
        ThreadLocalRandom rand=ThreadLocalRandom.current();
        //返回0（包含）和指定值（不包含）之间的伪随机，均匀分布的double值
        System.out.println("rand.nextDouble(2.0):"+rand.nextDouble(2.0));
        //返回在给定的最小值（包括）和bound（不包括）之间的伪随机，均匀分布的值
        System.out.println("rand.nextDouble(2.0,10.0):"+rand.nextDouble(2.0,10.0));
        //返回在给定的最小值（包括）和bound（不包括）之间的伪随机，均匀分布的值
        System.out.println("rand.nextInt(4,20):"+rand.nextInt(4,20));
        System.out.println("rand.nextLong(22L):"+rand.nextLong(22L));
        System.out.println("rand.nextLong(22L,100L):"+rand.nextLong(22L,100L));
    }
}
