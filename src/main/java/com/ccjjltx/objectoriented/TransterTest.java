package com.ccjjltx.objectoriented;

/**
 * Created by ccjjltx on 2017/3/5.
 * 形参数
 *
 * @author ccj
 * @version 1.0
 */
public class TransterTest {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swap(a, b);
        //交换结束后，变量a的值是6:变量b的值是9
        System.out.println("交换结束后，变量a的值是" + a + ":变量b的值是" + b);
        ////////
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        //交换结束后，a成员变量的值是9:b成员变量的值是6
        System.out.println("交换结束后，a成员变量的值是" + dw.a + ":b成员变量的值是" + dw.b);
    }

    /**
     * 非引用就直接复制副本，就是复制值
     *
     * @param a 交换数1
     * @param b 交换数2
     */
    private static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
        //swap方法里，a的值是9:b的值是6
        System.out.println("swap方法里，a的值是" + a + ":b的值是" + b);
    }

    /**
     * 传入的是引用（指针），保存了DataWrap对象的地址值，传的是本身不是复制品
     * @param dw 传入DataWrap引用
     */
    private static void swap(DataWrap dw) {
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        //swap方法里，a成员变量的值是9:b成员变量的值6
        System.out.println("swap方法里，a成员变量的值是" + dw.a + ":b成员变量的值" + dw.b);
    }

    private static class DataWrap {
        int a;
        int b;
    }

}
