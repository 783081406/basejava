package com.ccjjltx.objectoriented.renum;

/**
 * Created by ccjjltx on 2017/3/21.
 * 枚举类的匿名内部子类
 * 枚举类里定义抽象方法时不能使用abstract关键字将枚举类定义成抽象类（因为系统自动会为它添加abstract关键字），但因为枚举类需要
 * 显式创建枚举值，而不是作为父类，所以定义每个枚举值时必须为抽象提供实现，否则将出现编译错误
 *
 * @author ccj
 * @version 1.0
 */
public enum Operation {
    PLUS {
        @Override
        public double eval(double x, double y) {
            return x + y;
        }
    }, MINUS {
        @Override
        public double eval(double x, double y) {
            return x - y;
        }
    }, TIMES {
        @Override
        public double eval(double x, double y) {
            return x * y;
        }
    }, DIVIDE {
        @Override
        public double eval(double x, double y) {
            return x / y;
        }
    };

    //为枚举类定义一个抽象方法
    //这个抽象方法由不同的枚举值提供不同的实现
    public abstract double eval(double x, double y);

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(3, 4));
        System.out.println(Operation.MINUS.eval(5, 4));
        System.out.println(Operation.TIMES.eval(5, 4));
        System.out.println(Operation.DIVIDE.eval(5, 4));
        /*
        7.0
        1.0
        20.0
        1.25
         */
    }
}
