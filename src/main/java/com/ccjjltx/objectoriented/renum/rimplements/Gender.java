package com.ccjjltx.objectoriented.renum.rimplements;

/**
 * Created by ccjjltx on 2017/3/21.
 * 如果需要每个枚举值在调用该方法时呈现出不同的行为方式，则可以让每个枚举值分别来实现该方法，这个枚举值提供不同的实现方式，从而
 * 让不同的枚举值调用该方法时具有不同的行为方式
 *
 * @author ccj
 * @version 1.0
 */
public enum Gender implements GenderDesc {
    MALE("男") {
        //花括号部分实际上是一个类体部分
        @Override
        public void info() {
            System.out.println("男性");
        }
    },
    FEMALE("女") {
        @Override
        public void info() {
            System.out.println("女性");
        }
    };

    private final String name;

    private Gender(String name) {
        this.name = name;
    }
}
