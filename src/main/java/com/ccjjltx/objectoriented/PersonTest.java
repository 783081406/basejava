package com.ccjjltx.objectoriented;

/**
 * Created by ccjjltx on 2017/3/6.
 * 成员变量无需显式赋值
 *
 * @author ccj
 * @version 1.0
 */
public class PersonTest {
    /*
    成员变量无须显式初始化，只要为一个类定义了类变量或者实例变量，系统就会在这个类的准备阶段或创建该类的实例时进行
    默认初始化，成员变量默认初始化的赋值规则与数组动态初始化时数组元素的赋值规则完全相同。
     */
    public static void main(String[] args) {
        //第一次主动使用Person类，该类自动初始化，则eyeNum变量开始起作用，输出0
        System.out.println("Person的eyeNum类变量值:" + Person.getEyeNum());
        //创建Person对象
        Person p = new Person();
        //通过Person对象的引用p来访问Person对象name实例变量
        //通过实例访问eyeNum类变量
        System.out.println("p对象的name变量值是:" + p.getName() + "p对象的eyeNum变量值是:" + p.getEyeNum());
        p.setName("ccj");
        p.setEyeNum(2);
        System.out.println("p对象的name变量值是:" + p.getName() + "p对象的eyeNum变量值是:" + p.getEyeNum());
        System.out.println("Person的eyeNum类的变量值:" + p.getEyeNum());
        Person p2 = new Person();
        System.out.println("p2的eyeNum类的变量值:" + p2.getEyeNum());
    }
}

class Person {
    //定义一个实例变量
    private String name;
    //定义一个类变量
    private static int eyeNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getEyeNum() {
        return eyeNum;
    }

    public static void setEyeNum(int eyeNum) {
        Person.eyeNum = eyeNum;
    }
}