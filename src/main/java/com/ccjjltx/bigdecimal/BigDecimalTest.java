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
        testDivide();
        testSetScale();
        testXxxValue();
        testOther();
    }

    /**
     * 基本加减乘除
     */
    private static void test1() {
        System.out.println("====================================================================================");
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
        System.out.println("====================================================================================");
        BigDecimal a = new BigDecimal("1.22");
        System.out.println("construct with a String value: " + a);//1.22
        BigDecimal b = new BigDecimal("2.22");
        BigDecimal c = a.add(b);
        //因为是不可变（immutable）类，所以每一步运算都会产生一个新的对象
        System.out.println("a plus b is : " + a);//1.22
        System.out.println(c);//3.44

    }

    /**
     * equals()
     */
    private static void testEquals() {
        System.out.println("====================================================================================");
        //标度需相同
        System.out.println(new BigDecimal("0.0").equals(new BigDecimal("0.00")));//false
        System.out.println(new BigDecimal("0.0").hashCode() == (new BigDecimal("0.00")).hashCode());//false
        System.out.println(new BigDecimal("0.0").compareTo(new BigDecimal("0.00")));//0
    }

    /**
     * BigDecimal对象的精度没有限制。如果结果不能终止，divide方法将会抛出ArithmeticException, 如1 / 3 = 0.33333...。
     * 所以强烈推荐使用重载方法divide(BigDecimal d, int scale, int roundMode)指定标度和舍入模式来避免以上异常。
     */
    private static void testDivide() {
        System.out.println("====================================================================================");
        try {
            System.out.println(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(3)));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        //ROUND_HALF_UP:向“最接近的”数字舍入，如果与两个相邻数字的距离相等，则为向上舍入的舍入模式
        System.out.println(BigDecimal.valueOf(1).divide(BigDecimal.valueOf(3), 2, BigDecimal.ROUND_HALF_UP));
    }

    /**
     * setScale
     * scale指的是你小数点后的位数
     */
    private static void testSetScale() {
        System.out.println("====================================================================================");
        //直接删除多余的小数位，如2.35会变成2.3
        System.out.println(BigDecimal.valueOf(2.35).setScale(1, BigDecimal.ROUND_DOWN));
        //进位处理，2.35变成2.4
        System.out.println(BigDecimal.valueOf(2.35).setScale(1, BigDecimal.ROUND_UP));
        //四舍五入，2.35变成2.4
        System.out.println(BigDecimal.valueOf(2.35).setScale(1, BigDecimal.ROUND_HALF_UP));
        //四舍五入，2.35变成2.3
        System.out.println(BigDecimal.valueOf(2.35).setScale(1, BigDecimal.ROUND_HALF_DOWN));
    }

    /**
     * XXXValue()
     */
    private static void testXxxValue() {
        System.out.println("====================================================================================");
        double d = BigDecimal.valueOf(2.33).doubleValue();
        float f = new BigDecimal(123.123f).floatValue();
        int i = new BigDecimal(11).intValue();
        long l = BigDecimal.valueOf(123L).longValue();
        System.out.println(d + "......" + f + "......" + i + "......" + l);
    }

    /**
     * other api
     */
    private static void testOther() {
        System.out.println("====================================================================================");
        System.out.println("-1绝对值:" + new BigDecimal("-1").abs());//1
        //返回此 BigDecimal 和 val 的最大值
        System.out.println("max:" + new BigDecimal("45").max(new BigDecimal("54")));//54,依旧返回一个新BigDecimal
        //返回此 BigDecimal 和 val 的最小值
        System.out.println("min:" + new BigDecimal("45").min(new BigDecimal("54")));
        //返回一个 BigDecimal，它等效于将该值的小数点向左移动 n 位
        System.out.println("movePointLeft(3):" + new BigDecimal("123123").movePointLeft(3));//123.123
        //返回一个 BigDecimal，它等效于将该值的小数点向右移动 n 位
        System.out.println("movePointRight(3):" + new BigDecimal("123.123").movePointRight(3));
        //多少次幂
        System.out.println("pow(2):" + new BigDecimal(2).pow(2));
        //返回使用的精度
        System.out.println("precision():" + new BigDecimal("2.33").precision());
        //求余//1
        System.out.println("new BigDecimal(\"10\").remainder(new BigDecimal(2):" + new BigDecimal("10").remainder(new BigDecimal(3)));
    }
}
