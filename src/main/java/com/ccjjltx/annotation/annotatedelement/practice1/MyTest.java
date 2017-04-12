package com.ccjjltx.annotation.annotatedelement.practice1;

/**
 * Created by ccjjltx on 2017/4/12.
 * 调用注解，测试方法
 *
 * @author ccj
 * @version 1.0
 */
public class MyTest {
    //使用@Testable注解指定该方法是可测试的
    @Testable
    public static void m1() {
    }

    public static void m2() {
    }

    @Testable
    public static void m3() {
        throw new IllegalArgumentException("参数出错!");
    }

    public static void m4() {
    }

    @Testable
    public static void m5() {
    }

    public static void m6() {
    }

    @Testable
    public static void m7() {
        throw new RuntimeException("程序业务出现异常!");
    }

    public static void m8() {

    }
}
