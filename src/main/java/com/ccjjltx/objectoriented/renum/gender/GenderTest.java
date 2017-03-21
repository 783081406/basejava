package com.ccjjltx.objectoriented.renum.gender;

/**
 * Created by ccjjltx on 2017/3/21.
 * @author ccj
 * @version 1.0
 */
public class GenderTest {
    public static void main(String[] args) {
        /*
        使用Gender枚举类时与使用一个普通类没有太大的差别
        差别只是产生Gender对象的方式不同，枚举类的实例只能是只能是枚举值，同时不能随意通过new来创建枚举对象
         */
        Gender1 g= Enum.valueOf(Gender1.class,"MALE");
        g.setName("男");
        Gender1 g2=Gender1.valueOf("MALE");
        //报错
        g2.setName("女");
    }
}
