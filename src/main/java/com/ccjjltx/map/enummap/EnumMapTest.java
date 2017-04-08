package com.ccjjltx.map.enummap;

import java.util.EnumMap;

/**
 * Created by ccjjltx on 2017/4/8.
 *
 * @author ccj
 * @version 1.0
 */
public class EnumMapTest {
    public static void main(String[] args) {
        //创建EnumMap对象，该EnumMap的所有key都是Season枚举类的枚举值
        EnumMap<Season, String> enumMap = new EnumMap<>(Season.class);
        enumMap.put(Season.SUMMER, "夏日炎炎");
        enumMap.put(Season.SPRING, "春暖花开");
        System.out.println(enumMap);//{SPRING=春暖花开, SUMMER=夏日炎炎}
    }
}

enum Season {
    SPRING, SUMMER, FALL, WINTER;
}