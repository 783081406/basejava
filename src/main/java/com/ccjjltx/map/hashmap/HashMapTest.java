package com.ccjjltx.map.hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by ccjjltx on 2017/3/12.
 * 判读两个key相等的标准是：两个key通过equals()方法比较返回true，两个key的hashCode值也相等
 * 判断两个value相等的标准是：只要两个对象通过equals()方法比较返回true即可
 *
 * @author ccj
 * @version 1.0
 */
public class HashMapTest {
    public static void main(String[] args) {
        testHashtable();
        testHashMap();
    }

    private static void testHashtable() {
        Hashtable<A, Object> ht = new Hashtable<>();
        ht.put(new A(60000), "book1");
        ht.put(new A(87563), "book2");
        ht.put(new A(1234), new B());
        //{60000=book1, 87563=book2, 1234=com.ccjjltx.map.hashmap.HashMapTest$B@1b6d3586}
        System.out.println(ht);
        //只要两个对象返回equals()方法比较返回true
        //Hashtable就会认为他们都是相等的vaue
        //由于Hashtable中有一个B对象
        //它与任何对象通过equals()方法比较都是相等，所以下面输出true
        System.out.println(ht.containsValue("测试字符串"));//true
        //只要两个A对象的count相等，他们通过equals()方法比较返回true，且hashCode值相等
        //Hashtable即认为他们都是相当的key，所以下面输出true
        System.out.println(ht.containsKey(new A(87563)));//true
        //删除最后一个key-value对
        ht.remove(new A(1234));
        System.out.println(ht);//{60000=book1, 87563=book2}
    }

    //与HashSet类似的是，如果使用可变对象作为HashMap、Hashtable的key，并且程序修改了作为key的可变对象，则也可能出现HashSet
    //类似的情形：程序再也不能准确访问Map中修改的key
    private static void testHashMap() {
        System.out.println("======================================");
        HashMap<A, String> ht = new HashMap<>();
        ht.put(new A(6000), "book1");
        ht.put(new A(1234), "book2");
        //获得HashMap的keySet集合对应的Iterator迭代器
        Iterator it = ht.keySet().iterator();
        //取出A的第一个key，（6000）并且修改它的count值
        A first = (A) it.next();
        first.count = 1234;
        System.out.println(ht);//{1234=book1, 1234=book2}
        //只能删除没有被修改过的key说对应的key-value
        ht.remove(new A(1234));
        System.out.println(ht);
        //无法获取剩下的value，下面两行代码都输出null
        System.out.println(ht.get(new A(1234)));//null
        System.out.println(ht.get(new A(6000)));//null
    }

    private static class A {
        int count;

        public A(int count) {
            this.count = count;
        }

        //根据count的值来判断两个对象是否相同
        @Override
        public boolean equals(Object obj) {
            if (obj == this)
                return true;
            if (obj != null && obj.getClass() == A.class) {
                A a = (A) obj;
                return a.count == this.count;
            }
            return false;
        }

        //根据count来计算hashCode值
        @Override
        public int hashCode() {
            return this.count;
        }

        @Override
        public String toString() {
            return String.valueOf(this.count);
        }

    }

    private static class B {
        //重写equals()方法，B对象与任何对象通过equals()方法都返回true
        public boolean equals(Object obj) {
            return true;
        }
    }
}
