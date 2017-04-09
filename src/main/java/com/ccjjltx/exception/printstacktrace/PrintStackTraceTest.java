package com.ccjjltx.exception.printstacktrace;

/**
 * Created by ccjjltx on 2017/3/17.
 *
 * @author ccj
 * @version 1.0
 */
public class PrintStackTraceTest {
    public static void main(String[] args) {
        firstMethof();
    }

    private static void firstMethof() {
        secondMethod();
    }

    private static void secondMethod() {
        thirdMethod();
    }

    private static void thirdMethod() {
        throw new SalException("自定义异常信息");
    }

    /*
    跟踪栈总是最内部的被调用方法逐渐上传,直到最外部也不操作的起点,通常就是程序的入口main方法或Thread类run方法
     */

    /*
    Exception in thread "main" com.ccjjltx.exception.printstacktrace.SelfException: 自定义异常信息
	at com.ccjjltx.exception.printstacktrace.PrintStackTraceTest.thirdMethod(PrintStackTraceTest.java:23)
	at com.ccjjltx.exception.printstacktrace.PrintStackTraceTest.secondMethod(PrintStackTraceTest.java:19)
	at com.ccjjltx.exception.printstacktrace.PrintStackTraceTest.firstMethof(PrintStackTraceTest.java:15)
	at com.ccjjltx.exception.printstacktrace.PrintStackTraceTest.main(PrintStackTraceTest.java:11)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
     */
}
