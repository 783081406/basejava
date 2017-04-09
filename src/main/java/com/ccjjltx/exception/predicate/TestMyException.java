package com.ccjjltx.exception.predicate;

/**
 * Created by ccjjltx on 2017/4/9.
 *
 * @author ccj
 * @version 1.0
 */
public class TestMyException {
    public static void main(String[] args) {
        try {
            testMyRuntimeException();
        } catch (MyRuntimeException e) {
            e.printStackTrace();
            System.out.println("执行时异常");
        }
    }

    private static void testMyRuntimeException() {
        throw new MyRuntimeException("MyRuntimeException");
    }
}