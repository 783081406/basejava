package com.ccjjltx.collection.set.hashset;

import java.util.HashSet;

/**
 * Created by ccjjltx on 2017/2/28.
 * api基本和Set<T>一致
 * @author ccj
 * @version 1;0
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Object> books=new HashSet<>();
        //分别向books集合中添加两个A对象，两个B对象，两个C对象
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        //只有五个结果，下面两个实际上会在相同位置用链式结构保存多个对象；而HashSet访问集合元素时也是根据元素的hashCode值来快速定位
        //如果HashSet中两个以上的元素具有相同的hashCode值，将会导致性能下降
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }

    private static class A{
        @Override
        public boolean equals(Object obj){
            return true;
        }
    }

    private static class B{
        @Override
        public int hashCode(){
            return 1;
        }
    }

    private static class C{
        @Override
        public int hashCode(){
            return 2;
        }
        @Override
        public boolean equals(Object obj){
            return true;
        }
    }
}
