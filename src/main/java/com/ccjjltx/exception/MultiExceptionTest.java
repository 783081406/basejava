package com.ccjjltx.exception;

/**
 * Created by ccjjltx on 2017/3/22.
 * 1.捕获多种类型的异常时，多种异常类型之间用竖线（|）隔开
 * 2.捕获多种类型的异常时，异常变量有隐式的final修饰，因此程序不能对异常变量重新赋值。
 *
 * @author ccj
 * @version 1.0
 */
public class MultiExceptionTest {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie) {
            System.out.println("异常");
            //捕获多异常时，异常变量默认有final修饰
            //下面代码错误
            //ie=new ArithmeticException("text");
        } catch (Exception e) {
            System.out.println("未知异常");
            //捕获一种类型的异常时，异常变量没有final修饰
            //下面代码正确
            e = new RuntimeException("test");
        }
    }
}
