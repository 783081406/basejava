package com.ccjjltx.objectoriented.lambda;

/**
 * Created by ccjjltx on 2017/3/21.
 *
 * @author ccj
 * @version 1.0
 */
public class LambdaAndInner {
    private int age = 12;
    private static String name = "ccj";

    public void test() {
        //与匿名内部类一样，这个局部变量相当于使用了隐式的final修饰，因此不允许对book局部变量重新赋值
        String book = "book";
        Displayable dis = () -> {
            System.out.println("book的局部变量:" + book);
            System.out.println("普通成员变量的age实例变量为:" + age);
            System.out.println("类成员变量的name实例变量为:" + name);
        };
        dis.display();
        //调用接口中的默认方法
        System.out.println(dis.add(3, 5));
        age = 23;
        System.out.println(age);
    }

    public static void main(String[] args) {
        new LambdaAndInner().test();
    }
}

@FunctionalInterface
interface Displayable {
    //定义一个抽象方法和默认方法
    void display();

    default int add(int a, int b) {
        return a + b;
    }
}