package com.ccjjltx.map.weakhashMap;

import java.util.WeakHashMap;

/**
 * Created by ccjjltx on 2017/3/14.
 * 如果需要使用WeakHashMap的key来保留对象的弱引用，则不要让key说引用的对象具有任何强引用，否则将会失去使用WeakHashMap的意义
 *
 * @author ccj
 * @version 1.0
 */
public class WeakHashMapTest {
    public static void main(String[] args) {
        WeakHashMap<String, String> whm = new WeakHashMap<>();
        whm.put(new String("语文"), new String("良好"));
        whm.put(new String("数学"), new String("及格"));
        whm.put(new String("英文"), new String("中等"));
        //该key是一个系统缓存的字符串对象
        whm.put("java", new String("中等"));
        System.out.println(whm);//{英文=中等, java=中等, 数学=及格, 语文=良好}
        //通知系统立即进行垃圾回收
        System.gc();
        System.runFinalization();
        //通常情况下只看到一个key-value对
        System.out.println(whm);//{java=中等}
        /*
        添加前三个key-value对时，这三个key都是匿名的字符串对象，WeakHashMap只保留了对他们的弱引用，这样垃圾回收时会自动
        删除这三个key-value对。
        第四组key-value对的key是一个字符串直接量，（系统会自动保留对字符串对象的强引用），所以垃圾回收时不会回收它
         */
    }
}
