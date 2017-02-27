package com.ccjjltx.bigdecimal;

import java.math.BigDecimal;

/**
 * Created by ccjjltx on 2017/2/27.
 *
 * @author ccj
 * @version 1.0
 */
public class BigDecimalTest {
    public static void main(String[] args) {
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
}
