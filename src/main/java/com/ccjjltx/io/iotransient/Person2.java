package com.ccjjltx.io.iotransient;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ccjjltx on 2017/4/16.
 *
 * @author ccj
 * @version 1.0
 */
public class Person2 implements Serializable {
    private String name;
    private int age;

    //此处没有提供无参数的构造器
    public Person2(String name, int age) {
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

    //重写writeReplace方法，程序在序列化该对象之前，调用该方法
    private Object writeReplace() throws ObjectStreamException {
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(name);
        list.add(age);
        return list;
    }
}
