package com.ccjjltx.comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ccjjltx on 2017/3/1.
 * @author ccj
 * @version 1.0
 */
public class ComparableComparatorTest {
    public static void main(String[] args) {
        //建立ArrayList(动态数组)
        ArrayList<Person> list=new ArrayList<>();
        //添加对象到ArrayList中
        list.add(new Person("ccc",20));
        list.add(new Person("AAA",30));
        list.add(new Person("bbb",10));
        list.add(new Person("ddd",40));
        //打印list的原始序列
        System.out.println("Original sort,list:"+list);
        ///对list进行排序
        //这里根据Person实现的comparable<Person p>接口进行排序，根据name排序
        Collections.sort(list);
        System.out.println("Name sort,list:"+list);
        //通过比较器AscAgeComparator对list进行排序
        list.sort(new AscAgeComparator());
        System.out.println("Asc(age) sort,list:"+list);
        //通过比较器DescAgeComparator对list进行排序
        list.sort(new DescAgeComparator());
        System.out.println("Desc(age) sort,list:"+list);
        System.out.println("判断两个Person是否相等:"+new Person("a",1).equals(new Person("a",1)));
    }
}
