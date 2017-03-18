package com.ccjjltx.objectoriented.nestedclasses.useinnerclass;

/**
 * Created by ccjjltx on 2017/3/18.
 * 继承内部类Out里的In
 *
 * @author ccj
 * @version 1.0
 */
public class SubClass extends Out.In {
    public SubClass(Out out) {
        out.super("test");
    }
}
