package com.ccjjltx.objectoriented.polymorphic;

/**
 * Created by ccjjltx on 2017/3/9.
 * 多态测试，模拟父类
 *
 * @author ccj
 * @version 1.0
 */
public class SubClass extends BaseClass {
    public int bookPrice = 147;
    public String bookName = "book_sub";
    public int newField=11;

    @Override
    public void test() {
        System.out.println("子类覆盖父类的方法");
    }

    public void sub() {
        System.out.println("子类才有的方法");
    }

    public static void main(String[] args) {
        //编译时类型等号左边，运行时类型等号右边
        //下面编译时类型和运行时类型不一样，多态发生
        BaseClass bc = new SubClass();
        //查看各个成员变量的输出，浮现访问的父类对象的成员变量
        System.out.println(bc.bookPrice);//23
        System.out.println(bc.bookName);//book_name
        //下面调用执行从父类继承来的base()方法
        bc.base();//父类的普通方法
        //调用之类重写的test()方法
        bc.test();//子类覆盖父类的方法
        //因为编译时类型是BaseClass而BaseClass没有提供sub()方法，所以下面代码编译时会出现错误
        //bc.sub();
        //无法访问到父类没有的成员变量
       //System.out.println(bc.newField);
    }
}
