package com.ccjjltx.io.iotransient;

import java.io.Serializable;

/**
 * Created by ccjjltx on 2017/4/15.
 * 关键字transient表示序列化时无需理会该实例变量
 *
 * @author ccj
 * @version 1.0
 */
public class Person implements Serializable {
    private String name;
    private transient int age;

    public Person(String name, int age) {
        System.out.println("有参数的构造器");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
