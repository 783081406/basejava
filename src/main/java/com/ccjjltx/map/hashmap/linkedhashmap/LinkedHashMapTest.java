package com.ccjjltx.map.hashmap.linkedhashmap;

import java.util.LinkedHashMap;

/**
 * Created by ccjjltx on 2017/3/12.
 *
 * @author ccj
 * @version 1.0
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();
        scores.put("语文", 131);
        scores.put("数学", 141);
        scores.put("英语", 92);
        scores.forEach((key, value) -> System.out.println(key + "---->" + value));
        /*
        语文---->131
        数学---->141
        英语---->92
         */
    }
}
