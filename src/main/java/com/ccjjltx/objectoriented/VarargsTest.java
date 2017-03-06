package com.ccjjltx.objectoriented;

/**
 * Created by ccjjltx on 2017/3/5.
 *
 * @author ccj
 * @version 1.0
 */
public class VarargsTest {
    public static void main(String[] args) {
        //两种一样的效果
        test(5, "12", "23", "34", "45");
        test1(5, new String[]{"12", "23", "34", "45"});
        /////////
        //可变参数
        test2();
        test2("a", "b");
        //不可变参数
        test2("c");
        /*
        如果只需要传入一个参数，系统会执行重载的test2(String msg)方法，但是如果需要调用test2(String... msg)而
        又只是传入一个参数，则可以采用传入字符串数组的形式
        */
        test2(new String[]{"c"});
    }

    /**
     * 定义形参个数可变的方法(建议这种)
     *
     * @param a     int值
     * @param books 可变的String
     */
    private static void test(int a, String... books) {
        for (String tmp : books) {
            System.out.println(tmp);
        }
        //输出整数变量a的值
        System.out.println(a);
    }

    /**
     * 与上面的方法异曲同工，效果完全一样
     *
     * @param a     int值
     * @param books 可变的String
     */
    private static void test1(int a, String[] books) {
        for (String tmp : books) {
            System.out.println(tmp);
        }
        //输出整数变量a的值
        System.out.println(a);
    }

    private static void test2(String msg) {
        System.out.println("只有一个字符串参数的test方法");
    }

    /**
     * 可变参数
     * 多数情况下不推荐重载个数可变的方法
     *
     * @param msg 可变字符串
     */
    private static void test2(String... msg) {
        System.out.println("形参个数可变的test方法");
    }
}
