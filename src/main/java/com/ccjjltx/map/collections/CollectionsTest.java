package com.ccjjltx.map.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ccjjltx on 2017/3/14.
 *
 * @author ccj
 * @version 1.0
 */
public class CollectionsTest {
    public static void main(String[] args) {
        testSorted();
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
}
