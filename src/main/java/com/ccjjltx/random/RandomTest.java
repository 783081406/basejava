package com.ccjjltx.random;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by ccjjltx on 2017/2/26.
 *
 * @author ccj
 * @version 1.0
 */
public class RandomTest {
    public static void main(String[] args) {
        //无参
        nonParameter();
        //有参
        parametric();
    }

    /**
     * 无参构造函数
     */
    private static void nonParameter() {
        Random rand = new Random();
        //返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 boolean 值
        System.out.println("rand.nextBoolean():" + rand.nextBoolean());
        byte[] buffer = new byte[16];
        //生成随机字节并将其置于用户提供的 byte 数组中
        rand.nextBytes(buffer);
        System.out.println("buffer=" + Arrays.toString(buffer));
        //返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 double 值。
        System.out.println("rand.nextDouble():" + rand.nextDouble());
        //返回下一个伪随机数，它是取自此随机数生成器序列的、在 0.0 和 1.0 之间均匀分布的 float 值
        System.out.println("rand.nextFloat():" + rand.nextFloat());
        //返回下一个伪随机数，它是取自此随机数生成器序列的、呈高斯（“正态”）分布的double值，其平均值是 0.0，标准差是1.0
        System.out.println("rand.nextGaussian():" + rand.nextGaussian());
        //返回下一个伪随机数，它是此随机数生成器的序列中均匀分布的 int 值
        System.out.println("rand.nextInt():" + rand.nextInt());
        //返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的int值
        System.out.println("rand.nextInt(25):" + rand.nextInt(25));
        //返回下一个伪随机数，它是取自此随机数生成器序列的均匀分布的 long 值
        System.out.println("rand.nextLong():" + rand.nextLong());
    }

    /**
     * 有参构造函数
     * Random使用一个48位的种子，如果这个类的两个实例使用同一个种子创建的
     * 对他们以同样的顺序调用方法，则他们都会产生相同的数字序列
     */
    private static void parametric() {
        Random r1 = new Random(50);
        System.out.println("第一个种子为50的Random对象");
        System.out.println("r1.nextBoolean():\t" + r1.nextBoolean());//true
        System.out.println("r1.nextInt():\t" + r1.nextInt());//-1727040520
        System.out.println("r1.nextDouble():\t" + r1.nextDouble());//0.6141579720626675
        System.out.println("r1.nextGaussian():\t" + r1.nextGaussian());//2.377650302287946
        System.out.println("--------------------------------------");
        Random r2 = new Random(50);
        System.out.println("第二个种子为50的Random对象");
        System.out.println("r2.nextBoolean():\t" + r2.nextBoolean());//true
        System.out.println("r2.nextInt():\t" + r2.nextInt());//-1727040520
        System.out.println("r2.nextDouble():\t" + r2.nextDouble());//0.6141579720626675
        System.out.println("r2.nextGaussian():\t" + r2.nextGaussian());//2.377650302287946
        System.out.println("--------------------------------------");
        Random r3 = new Random(100);
        System.out.println("第三个种子为100的Random对象");
        System.out.println("r3.nextBoolean():\t" + r3.nextBoolean());//true
        System.out.println("r3.nextInt():\t" + r3.nextInt());//-1139614796
        System.out.println("r3.nextDouble():\t" + r3.nextDouble());//0.19497605734770518
        System.out.println("r3.nextGaussian():\t" + r3.nextGaussian());//0.6762208162903859
    }
}
