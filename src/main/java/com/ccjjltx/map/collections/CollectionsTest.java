package com.ccjjltx.map.collections;

import java.util.*;

/**
 * Created by ccjjltx on 2017/3/14.
 *
 * @author ccj
 * @version 1.0
 */
public class CollectionsTest {
    public static void main(String[] args) {
        testSorted();
        testSearch();
        testSychronized();
        testUnmodifiable();
    }

    /**
     * 对List集合元素进行排序操作
     */
    private static void testSorted() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);//[2, -5, 3, 0]
        Collections.reverse(nums);//次序反转
        System.out.println(nums);//[0, 3, -5, 2]
        Collections.sort(nums);//按自然排序
        System.out.println(nums);//[-5, 0, 2, 3]
        Collections.shuffle(nums);//随机排序，
        System.out.println(nums);//[0, -5, 3, 2]，每次输出的次序不固定
    }

    /**
     * 查找替换
     */
    private static void testSearch() {
        System.out.println("=============================================");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(-5);
        nums.add(3);
        nums.add(0);
        System.out.println(nums);//[2, -5, 3, 0]
        System.out.println(Collections.max(nums));//3
        System.out.println(Collections.min(nums));//-5
        Collections.replaceAll(nums, 0, 1);
        System.out.println(nums);
        System.out.println(Collections.frequency(nums, -5));
        Collections.sort(nums);
        //二分法查找
        System.out.println(Collections.binarySearch(nums, 3));
    }

    private static void testSychronized() {
        System.out.println("=============================================");
        Collection<String> c = Collections.synchronizedCollection(new ArrayList<String>());
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        Set<String> s = Collections.synchronizedSet(new HashSet<String>());
        Map<String, Integer> map = Collections.synchronizedMap(new HashMap<>());
    }

    /**
     * 设置不可变集合
     */
    private static void testUnmodifiable() {
        //创建一个空的，不可改变的List对象
        List<String> unmodifiableList = Collections.emptyList();
        //创建一个只有一个元素，且不可改变的Set对象
        Set<String> unmodifiableSet = Collections.singleton("book1");
        //创建一个普通的Map对象
        Map<String, Integer> scores = new HashMap<>();
        scores.put("语文", 131);
        scores.put("Java", 96);
        //返回普通Map对象对应的不可变版本
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(scores);
        //下面的任意一行都将会引发UnsupportedOperationException异常
        //unmodifiableList.add("测试元素");
    }
}
