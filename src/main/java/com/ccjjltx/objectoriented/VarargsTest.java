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
}
