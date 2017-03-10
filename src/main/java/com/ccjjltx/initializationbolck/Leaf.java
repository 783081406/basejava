package com.ccjjltx.initializationbolck;

/**
 * Created by ccjjltx on 2017/3/10.
 * @author ccj
 * @version 1.0
 */
public class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf(){
        System.out.println("执行Leaf的构造函数");
    }
}
