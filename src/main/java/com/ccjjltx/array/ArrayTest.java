package com.ccjjltx.array;

/**
 * Created by ccjjltx on 2017/3/5.
 *
 * @author ccj
 * @version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        //静态初始化
        int[] array1 = new int[]{5, 6, 8, 20};
        int[] array2 = {1, 2, 3};
        System.out.println(array1.toString());
        System.out.println(array2.toString());
        //动态初始化
        int[] array3 = new int[4];
        array3[0] = 0;
        array3[1] = 1;
        array3[2] = 2;
        array3[3] = 3;
        //foreach中的循环变量相当于一个临时变量，系统会把数组元素依次赋给这个临时变量
        for (int array : array3) {
            array = 1;
            System.out.println(array3);
        }
        System.out.println(array3[0]);//0
    }
}
