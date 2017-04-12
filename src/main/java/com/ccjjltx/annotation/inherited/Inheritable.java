package com.ccjjltx.annotation.inherited;

import java.lang.annotation.*;

/**
 * Created by ccjjltx on 2017/4/12.
 *
 * @author ccj
 * @version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Inheritable {
}
