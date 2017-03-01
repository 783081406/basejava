package com.ccjjltx.comparable.prectice;

import java.util.Arrays;

/**
 * Created by ccjjltx on 2017/3/1.
 *
 * @author ccj
 * @version 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("ccj", '男', 22),
                new Student("dd", '男', 23),
                new Student("dd", '女', 23),
                new Student("dd", '女', 20)
        };
        System.out.println("排序前:");
        for (Student student : students) {
            System.out.println(student);
        }
        //排序
        Arrays.sort(students, Comparators.getComparator());
        System.out.println("排序后:");
        System.out.println("排序前:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
