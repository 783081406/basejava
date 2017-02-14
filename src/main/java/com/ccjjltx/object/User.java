package com.ccjjltx.object;

/**
 * Created by ccj on 2017/2/14.
 *
 * @author ccj
 * @version 1.0
 */
public class User implements Cloneable {
    private int age;
    private Address address;

    public User(int age) {
        this.age = age;
        address = new Address("广州从化");
    }

    /**
     * 实现"克隆"的步骤：
     * 1.自定义类实现Cloneable接口.这是一个标记性的接口，实现该接口的对象可以实现"自我克隆"
     * 接口里面没有定义任何方法
     * 2.自定义类实现自己的clone()方法
     * 3.实现clone()方法时通过super.clone();调用Object实现的clone()方法来得到该对象的副本，并且返回该副本
     *
     * @return 调用对象的副本
     * @throws CloneNotSupportedException
     */
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
