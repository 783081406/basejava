package com.ccjjltx.objectoriented.autoboxing;

/**
 * Created by ccjjltx on 2017/3/10.
 * java5提供自动装箱（autoboxing）拆箱,自动拆箱
 * @author ccj
 * @version 1.0
 */
public class PrimitiveTest {
    public static void main(String[] args) {
        String intStr="123";
        int it1=Integer.parseInt(intStr);
        int it2=new Integer(12);
        System.out.println(it1+it2);
        String iStr1=String.valueOf(1234);
        System.out.println(iStr1);
    }
}
