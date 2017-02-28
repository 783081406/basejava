package com.ccjjltx.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by ccjjltx on 2017/2/28.
 * 重写hashCode()方法的基本规则
 * 1.在程序运行过程中，同一个对象多次调用hashCode()方法应该返回相同的值
 * 2.当两个对象通过equals()方法比较返回true时，这个两个对象的hashCode()方法应返回相同的值
 * 3.对象中用作equals()方法比较标准的实例变量，都应该用于计算hashCode值
 */
public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet<R> hashSet = new HashSet<>();
        hashSet.add(new R(5));
        hashSet.add(new R(-3));
        hashSet.add(new R(9));
        hashSet.add(new R(-2));
        //打印HashSet集合，集合元素没有重复
        //[R[count:-2], R[count:-3], R[count:5], R[count:9]]
        System.out.println(hashSet);
        //取第一个元素
        Iterator<R> it = hashSet.iterator();
        R first = it.next();
        //为第一个元素的count实力变量赋值
        first.count = -3;
        //再次输出HashSet集合，集合元素有重复元素
        //[R[count:-3], R[count:-3], R[count:5], R[count:9]]
        System.out.println(hashSet);
        //删除count为-3的R对象
        hashSet.remove(new R(-3));
        //[R[count:-3], R[count:5], R[count:9]]
        System.out.println(hashSet);
        System.out.println("hs是否包含count为-3的R对象?" + hashSet.contains(new R(-3)));//false
        System.out.println("hs是否包含count为-2的R对象?" + hashSet.contains(new R(-2)));//false
        /*
        第一个元素实际上保存在count为-2的R对象对应的位置，之后改变了count为-3，所以使用equals()方法拿它和count为-2的R对象
        比较时返回false---这将导致HashSet比可能准确访问该元素
         */

    }

    private static class R {
        int count;

        public R(int count) {
            this.count = count;
        }

        @Override
        public String toString() {
            return "R[count:" + count + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj != null && obj.getClass() == R.class) {
                R r = (R) obj;
                return this.count == r.count;
            }
            return false;
        }

        public int hashCode() {
            return this.count;
        }
    }
}
