package com.ccjjltx.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ccjjltx on 2017/3/11.
 *
 * @author ccj
 * @version 1.0
 */
public class MapTest {
    public static void main(String[] args) {
        //一些基本操作
        testOrdinary();
    }

    /**
     * 一些基本的操作
     */
    private static void testOrdinary() {
        Map<String, Integer> map = new HashMap<>();
        map.put("语文", 129);
        map.put("数学", 141);
        map.put("英语", 90);
        map.put("物理", 97);
        //放入重复的key时，新的value会覆盖原有的value
        //如果新的value覆盖了原来的value，该方法返回被覆盖的value
        System.out.println(map.put("语文", 133));//129
        System.out.println(map);//{物理=97, 数学=141, 语文=133, 英语=90}
        //判断是否包含指定key
        System.out.println("是否包含值为语文的key:" + map.containsKey("语文"));//true
        //判断是否包含指定value
        System.out.println("是否包含值为141的value:" + map.containsValue(141));//true
        //获取Map集合的所有key组合的集合，通过便利key来实现遍历所有的key-value对
        for (String key : map.keySet()) {
            //map.get(key)方法获取指定key对应的value
            System.out.println(key + "--->" + map.get(key));
        }
        /*
        物理--->97
        数学--->141
        语文--->133
        英语--->90
         */
        map.remove("物理");//根据key来删除key-value对
        System.out.println(map);//{数学=141, 语文=133, 英语=90}
    }
}
