package com.ccjjltx.annotation.annotatedelement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ccjjltx on 2017/4/12.
 * 注解
 *
 * @author ccj
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyTag {
    String name() default "ccj";

    int age() default 32;
}
