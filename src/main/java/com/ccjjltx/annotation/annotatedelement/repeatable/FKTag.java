package com.ccjjltx.annotation.annotatedelement.repeatable;

import java.lang.annotation.*;

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
@Repeatable( FKTags.class)
@interface FKTag {
    String name() default "ccj";

    int age();
}
