package com.ccjjltx.reflect;

/**
 * Created by ccjjltx on 2017/3/19.
 *
 * @author ccj
 * @version 1.0
 */
public class MyEat {
    public static void main(String[] args) {
        Fruit f = Factory.getInstance("com.ccjjltx.reflect.Apple");
        if (f != null) {
            f.eat();
        } else {
            System.out.println("实例化失败");
        }
    }
}
