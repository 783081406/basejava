package com.ccjjltx.exception.predicate;

/**
 * Created by ccjjltx on 2017/4/9.
 *
 * @author ccj
 * @version 1.0
 */
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String string) {
        super(string);
    }

    public MyException(Throwable t) {
        super(t);
    }
}
