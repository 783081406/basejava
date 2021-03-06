package com.ccjjltx.annotation.annotatedelement.repeatable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ccjjltx on 2017/4/12.
 * 默认还是不能作为重复注解使用，如果使用两个以上的该注解修饰同一个类，编译器会报错。
 * 需要一个提供一个“容器”
 *
 * @author ccj
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(FkTags.class)
public @interface FkTag {
    String name() default "ccj";

    int age();
}