package com.ccjjltx.initializationbolck;

/**
 * Created by ccjjltx on 2017/3/10.
 *
 * @author ccj
 * @version 1.0
 */
public class Root {
    static {
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的普通初始化块");
    }

    public Root() {
        System.out.println("Root的无参构造器");
    }
}
