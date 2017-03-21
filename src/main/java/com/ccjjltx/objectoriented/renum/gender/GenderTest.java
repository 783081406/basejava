package com.ccjjltx.objectoriented.renum.gender;

/**
 * Created by ccjjltx on 2017/3/21.
 *
 * @author ccj
 * @version 1.0
 */
public class GenderTest {
    public static void main(String[] args) {
        /*
        使用Gender枚举类时与使用一个普通类没有太大的差别
        差别只是产生Gender对象的方式不同，枚举类的实例只能是只能是枚举值，同时不能随意通过new来创建枚举对象
         */
        Gender1 g = Enum.valueOf(Gender1.class, "MALE");
        g.setName("男");
        Gender1 g2 = Gender1.valueOf("MALE");
        //报错
        g2.setName("女");
        System.out.println(g == g2);//true
        System.out.println(g.equals(g2));//true
        /*
        说明是同一个对象，引用同一个地址，如果g2,setName("女");能够插入成功那么调用g.getName():将会得到女
        可惜Genera1已经做了限制，所以只能插入男，所以，下面结果只能得到男
         */
        System.out.println(g.getName());
    }
}
