package com.ccjjltx.objectoriented.nestedclasses.usestaticinnerclass;

/**
 * Created by ccjjltx on 2017/3/18.
 *
 * @author ccj
 * @version 1.0
 */
public class StaticOut {
    static class StaticIn {
        public StaticIn() {
            System.out.println("静态内部类的构造器");
        }
    }
}
