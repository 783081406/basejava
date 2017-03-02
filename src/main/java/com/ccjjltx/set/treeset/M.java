package com.ccjjltx.set.treeset;

/**
 * Created by ccjjltx on 2017/3/2.
 *
 * @author ccj
 * @version 1.0
 */
public class M {
    private int age;

    public M(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "M[age" + age + "]";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
