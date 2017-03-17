package com.ccjjltx.exception.printstacktrace;

/**
 * Created by ccjjltx on 2017/3/17.
 *
 * @author ccj
 * @version 1.0
 */
public class SelfException extends RuntimeException {
    public SelfException() {
    }

    public SelfException(String msg) {
        super(msg);
    }
}
