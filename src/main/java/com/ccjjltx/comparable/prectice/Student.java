package com.ccjjltx.comparable.prectice;

/**
 * Created by ccjjltx on 2017/3/1.
 *
 * @author ccj
 * @version 1.0
 */
public class Student {
    private String name;
    private char sex;
    private int age;

    Student(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "_" + sex + "_" + age;
    }
}
