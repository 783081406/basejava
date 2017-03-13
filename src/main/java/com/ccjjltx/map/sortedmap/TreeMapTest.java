package com.ccjjltx.map.sortedmap;

import java.util.TreeMap;

/**
 * Created by ccjjltx on 2017/3/13.
 *
 * @author ccj
 * @version 1.0
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<R, String> tm = new TreeMap<>();
        tm.put(new R(3), "book1");
        tm.put(new R(-5), "book2");
        tm.put(new R(9), "book3");
        System.out.println(tm);//{R[count:-5}=book2, R[count:3}=book1, R[count:9}=book3}
        //返回该TreeMap的第一个Entry对象
        System.out.println(tm.firstEntry());//R[count:-5}=book2
        //返回该TreeMap的最后一个key值
        System.out.println(tm.lastKey());//R[count:9}
        //返回该TreeMap的比new R(2)大的最小key值
        System.out.println(tm.higherKey(new R(2)));//R[count:3}
        //返回该TreeMap的比new R(2)小的最大的key-value对
        System.out.println(tm.lowerEntry(new R(2)));//R[count:-5}=book2
        //返回该TreeMap的子TreeMap
        System.out.println(tm.subMap(new R(-1), new R(4)));//{R[count:3}=book1}
    }
}
