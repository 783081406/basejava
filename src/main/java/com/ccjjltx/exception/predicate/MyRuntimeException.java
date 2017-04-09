package com.ccjjltx.exception.predicate;

/**
 * Created by ccjjltx on 2017/4/9.
 *
 * @author ccj
 * @version 1.0
 */
public class MyRuntimeException extends RuntimeException {
    public MyRuntimeException() {
    }

    public MyRuntimeException(String str) {
        super(str);
    }

    public MyRuntimeException(Throwable t) {
        super(t);
    }
}
