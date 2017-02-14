package com.ccjjltx.object;

/**
 * Created by ccj on 2017/2/14.
 *
 * @author ccj
 * @version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        User u1=new User(29);
        //clone得到u1对象的副本
        User u2=u1.clone();
        //判断u1、u2是否相同
        System.out.println(u1==u2);
        //判断两个的address是否相同
        //引用，指向同一处，所以相同
        System.out.println(u1.getAddress()==u2.getAddress());
        //需要指出的是，Object类的clone()方法是一个浅克隆，他只是克隆该对象所有成员变量值，
        // 不会对应用类型的成员变量值所引用的对象进行克隆
    }
}
