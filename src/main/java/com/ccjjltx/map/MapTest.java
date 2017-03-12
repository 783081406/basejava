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
        //java8新增的方法
        testjava8();
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

    /**
     * java8新增的方法
     */
    private static void testjava8() {
        System.out.println("================================================");
        Map<String, Integer> map = new HashMap<>();
        //成对放入多个key-value对
        map.put("语文", 131);
        map.put("数学", 141);
        map.put("英语", 91);
        //尝试替换key为“物理"的value，由于原Map中没有对应的key
        //因此Map没有改变，不会添加新的key-value对
        map.replace("物理", 97);
        System.out.println(map);//{数学=141, 语文=131, 英语=91}
        //使用原来value与传入参数计算出来的结果覆盖原来的value
        map.merge("语文", 10, (oldVal, newVal) -> oldVal + newVal);
        System.out.println(map);//{数学=141, 语文=141, 英语=91}
        map.computeIfAbsent("Java", (key) -> (key.length() * 24));
        System.out.println(map);//{Java=96, 数学=141, 语文=141, 英语=91}
        map.computeIfPresent("Java", (key, value) -> (value * value / value + 2));
        System.out.println(map);//{Java=98, 数学=141, 语文=141, 英语=91}
    }
}
