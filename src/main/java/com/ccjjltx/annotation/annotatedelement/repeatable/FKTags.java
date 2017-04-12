package com.ccjjltx.annotation.annotatedelement.repeatable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ccjjltx on 2017/4/12.
 * 作为FKTag的容器
 *
 * @author ccj
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FKTags {
    //定义value成员变量，该成员变量可以接受多个@FkTag注解
    FKTag value();
}
