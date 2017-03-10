package com.ccjjltx.initializationbolck;

/**
 * Created by ccjjltx on 2017/3/10.
 * @author ccj
 * @version 1.0
 */
public class Mid extends Root{
    static{
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参构造函数");
    }
}
