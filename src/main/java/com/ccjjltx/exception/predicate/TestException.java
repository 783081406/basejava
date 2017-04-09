package com.ccjjltx.exception.predicate;

/**
 * Created by ccjjltx on 2017/4/9.
 *
 * @author ccj
 * @version 1.0
 */
public class TestException {
    public static void main(String[] args) {
        try {
            testException();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("执行了异常");
        }
    }

    private static void testException() throws MyException {
        throw new MyException("MyException");
    }
}