package com.ccjjltx.bigdecimal;

import java.math.BigDecimal;

/**
 * Created by ccjjltx on 2017/2/27.
 * 不可变类
 *
 * @author ccj
 * @version 1.0
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        test1();
        test2();
        testEquals();
    }

    /**
     * 基本加减乘除
     */
    private static void test1() {
        BigDecimal f1 = new BigDecimal("0.05");
        BigDecimal f2 = BigDecimal.valueOf(0.01);
        BigDecimal f3 = new BigDecimal(0.05);
        System.out.println("使用String作为BigDecimal构造参数");
        System.out.println("0.05+0.01=" + f1.add(f2));//0.06
        System.out.println("0.05-0.01=" + f1.subtract(f2));//0.04
        System.out.println("0.05*0.01=" + f1.multiply(f2));//0.0005
        System.out.println("0.05/0.01=" + f1.divide(f2));//5
        System.out.println("使用double作为BigDecimal构造参数");
        System.out.println("0.05+0.01=" + f3.add(f2));//0.06000000000000000277555756156289135105907917022705078125
        System.out.println("0.05-0.01=" + f3.subtract(f2));//0.04000000000000000277555756156289135105907917022705078125
        System.out.println("0.05*0.01=" + f3.multiply(f2));//0.0005000000000000000277555756156289135105907917022705078125
        System.out.println("0.05/0.01=" + f3.divide(f2));//5.000000000000000277555756156289135105907917022705078125
    }

    /**
     * 误区
     */
    private static void test2() {
        BigDecimal a = new BigDecimal("1.22");
        System.out.println("construct with a String value: " + a);
        BigDecimal b = new BigDecimal("2.22");
        BigDecimal c=a.add(b);
        //因为是不可变（immutable）类，所以每一步运算都会产生一个新的对象
        System.out.println("a plus b is : " + a);
        System.out.println(c);

    }

    /**
     * equals()
     */
    private static void testEquals(){
        //标度需相同
        System.out.println(new BigDecimal("0.0").equals(new BigDecimal("0.00")));//false
        System.out.println(new BigDecimal("0.0").hashCode()==(new BigDecimal("0.00")).hashCode());//false
        System.out.println(new BigDecimal("0.0").compareTo(new BigDecimal("0.00")));//0
    }

}
