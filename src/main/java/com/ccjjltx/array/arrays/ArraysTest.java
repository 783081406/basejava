package com.ccjjltx.array.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

/**
 * Created by ccjjltx on 2017/3/5.
 *
 * @author ccj
 * @version 1.0
 */
public class ArraysTest {
    public static void main(String[] args) {
        //老方法
        oldmethod();
        //新增用cpu并行能力来提高性能
        newmethos();
        //asList(Object... a)
        testAsList();
    }

    /**
     * asList(Object... a)方法，返回一个Arrays的内部类Arrays.ArrayList，固定长度的List集合，程序
     * 只能遍历访问该集合里面的元素，不可增加、删除该集合里面的元素
     */
    private static void testAsList(){
        System.out.println("==========================================");
        List fixedList=Arrays.asList("book1","book2","book3");
        System.out.println(fixedList.getClass());//class java.util.Arrays$ArrayList
        //使用方法引用遍历集合元素
        fixedList.forEach(System.out::println);
        //如果试图增加，删除元素都会引发UnsupportedOperationException异常
    }

    /**
     * 老方法
     */
    private static void oldmethod() {
        // 定义一个a数组
        int[] a = new int[]{3, 4, 5, 6};
        // 定义一个a2数组
        int[] a2 = new int[]{3, 4, 5, 6};
        // a数组和a2数组的长度相等，每个元素依次相等，将输出true
        System.out.println("a数组和a2数组是否相等：" + Arrays.equals(a, a2));
        // 通过复制a数组，生成一个新的b数组
        int[] b = Arrays.copyOf(a, 6);
        System.out.println("a数组和b数组是否相等：" + Arrays.equals(a, b));//false
        // 输出b数组的元素，将输出[3, 4, 5, 6, 0, 0]
        System.out.println("b数组的元素为：" + Arrays.toString(b));//[3, 4, 5, 6, 0, 0]
        // 将b数组的第3个元素（包括）到第5个元素（不包括）赋为1
        Arrays.fill(b, 2, 4, 1);
        // 输出b数组的元素，将输出[3, 4, 1, 1, 0, 0]
        System.out.println("b数组的元素为：" + Arrays.toString(b));//[3, 4, 1, 1, 0, 0]
        // 对b数组进行排序
        Arrays.sort(b);
        // 输出b数组的元素，将输出[0, 0, 1, 1, 3, 4]
        System.out.println("b数组的元素为：" + Arrays.toString(b));
    }

    /**
     * 新增用cpu并行能力来提高性能
     */
    private static void newmethos() {
        int[] arr1 = new int[]{3, -4, 25, 16, 30, 18};
        //对数组arr1进行并发排序
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));//[-4, 3, 16, 18, 25, 30]
        int[] arr2 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
            // left代表数组中前一个所索引处的元素，计算第一个元素时，left为1
            // right代表数组中当前索引处的元素
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        });
        System.out.println(Arrays.toString(arr2));//[3, -12, -300, -4800, -144000, -2592000]
        int[] arr3 = new int[5];
        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            // operand代表正在计算的元素索引
            public int applyAsInt(int operand) {
                return operand * 5;
            }
        });
        System.out.println(Arrays.toString(arr3));//[0, 5, 10, 15, 20]
    }
}
