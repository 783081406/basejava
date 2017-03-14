package com.ccjjltx.map.identityhashmap;

import java.util.IdentityHashMap;

/**
 * Created by ccjjltx on 2017/3/14.
 *
 * @author ccj
 * @version 1.0
 */
public class IdentityHashMapTest {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>();
        ihm.put(new String("语文"), 131);
        ihm.put(new String("语文"), 141);
        ihm.put("java", 98);
        ihm.put("java", 99);
        System.out.println(ihm);//{java=99, 语文=131, 语文=141}
        /*
        后两个key-value对中的key都是字符串直接量，而且他们的字符序列完全相同，Java使用常量池来管理字符串直接量
        所以他们通过==比较返回true，IdentityHashMap会认为它们是同一个key,因此只有一次可以添加成功。
         */
    }
}
