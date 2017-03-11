package com.ccjjltx.objectoriented.single;

/**
 * Created by ccjjltx on 2017/3/11.
 * 单例类
 *
 * @author ccj
 * @version 1.0
 */
public class SimgleTonTest {
    public static void main(String[] args) {
        //创建Singleton对象不能通过构造器
        //只能通过getInstance方法得到实例
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
    }
}
