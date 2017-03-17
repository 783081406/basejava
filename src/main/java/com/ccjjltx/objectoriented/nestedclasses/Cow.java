package com.ccjjltx.objectoriented.nestedclasses;

/**
 * Created by ccjjltx on 2017/3/17.
 *
 * @author ccj
 * @version 1.0
 */
public class Cow {
    private double weight;

    //外部类的两个重载的构造器
    public Cow() {
    }

    public Cow(double weight) {
        this.weight = weight;
    }

    public void test() {
        CowLeg c1 = new CowLeg(1.12, "黑白相间");
        c1.info();
    }

    public static void main(String[] args) {
        Cow cow = new Cow(378.9);
        cow.test();
        ////////////////错误/////////////////
        /*Cow.CowLeg cow1=new Cow.CowLeg(1.12,"黑白相间");
        cow1.info();*/
        //可以看到路径生成两个类文件
        //一个是Cow.class，一个是Cow$CowLeg.class
    }

    //定义一个非静态内部类
    private class CowLeg {
        //非静态内部类的两个实例变量
        private double length;
        private String color;

        //非静态内部类的两个重载的构造器
        public CowLeg() {
        }

        public CowLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }

        public void info() {
            System.out.println("当前牛腿颜色是:" + color + ",高:" + length);
            //直接访问外部类的private修饰的成员变量
            System.out.println("本牛腿所在奶牛中:" + weight);
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    }
}
