package com.ccjjltx.genericity;

/**
 * Created by ccjjltx on 2017/3/13.
 *
 * @author ccj
 * @version 1.0
 */
public class Apple<T> {
    //使用T类型形参定义实例变量
    private T info;

    public Apple() {
    }

    //为Apple<T>类声明构造器，其构造器名字依然是Apple，而不是Apple<T>！调用该构造器却可以使用Apple<T>的形式，
    //当然应该为T形参传入实际的类型参数，java7提供了棱形语法，允许省略<>中的类型实参
    public Apple(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public static void main(String[] args) {
        Apple<String> a1=new Apple<>("苹果");
        System.out.println(a1.getInfo());
        Apple<Double> a2=new Apple<>(2.2);
        System.out.println(a2.getInfo());
    }
}
