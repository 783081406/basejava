package com.ccjjltx.collection;

import java.util.*;

/**
 * Created by ccjjltx on 2017/2/27.
 * 集合里面不能放基本类型的值，但Java支持自动装箱
 *
 * @author ccj
 * @version 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
        allAPIs();
        foreachMethod1();
        foreachMethod2();
        foreachMethod3();
        foreachMethod4();
    }

    /**
     * 除了遍历的所有api
     */
    private static void allAPIs() {
        Collection<String> collection1 = new ArrayList<>();
        Collection<String> collection2 = new ArrayList<>();
        //添加元素
        collection1.add("1号元素");
        collection1.add("2号元素");
        collection2.add("3号元素");
        collection1.addAll(collection2);
        System.out.println("collection1集合的元素个数为:" + collection1.size());
        //删除元素
        collection1.remove("2号元素");
        collection1.removeAll(collection2);
        System.out.println("collection1集合的元素个数为:" + collection1.size());
        //判断是否包含指定字符串
        System.out.println("是否包含1号元素" + collection1.contains("1号元素"));
        System.out.println("是否包含collection2" + collection1.containsAll(collection2));
        collection1.add("3号元素");
        //控制collection1中只剩下collection2也包含的元素
        collection1.retainAll(collection2);
        System.out.println("collection2:" + collection2);
        //删除
        collection2.clear();
        System.out.println("清空之后的collection2大小:" + collection2.size());
        System.out.println("是否collection2为空" + collection2.isEmpty());
    }

    /**
     * 遍历
     */
    private static void foreachMethod1() {
        System.out.println("================================================================================");
        //创建一个集合
        Collection<String> books = new HashSet<>();
        //增加元素
        books.add("书1");
        books.add("书2");
        books.add("书3");
        books.add("书4");
        //===================使用Lambda表达式遍历集合===================
        /*
        java8为Iterable接口新增加了一个forEach(Consumer action)默认方法，该方法所需要参数的类型是一个函数式接口
        而Iterable接口是Collection接口的父接口，所以Collection也可以直接调用该方法
        1.但程序调用Iterable的forEach(Consumer action）遍历集合元素时
        2.程序会依次将集合元素传给Consumer的accept(T t)（该接口中唯一的抽象方法）
        3.正因为Consumer是函数式接口，因此可以使用Lambda表达式来遍历集合元素
        */
        //调用forEach()方法遍历集合
        books.forEach(obj -> System.out.println("迭代集合元素:" + obj));
    }

    private static void foreachMethod2() {
        System.out.println("================================================================================");
        //创建一个集合
        Collection<String> books = new HashSet<>();
        //增加元素
        books.add("书1");
        books.add("书2");
        books.add("书3");
        books.add("书4");
        //===================使用Iterator===================
        /*
        Iterator定义了4个方法
        boolean hasNext():如果被迭代的集合元素还没有被遍历完，则返回true
        Object next():返回集合里的下一个元素
        void remove():删除集合里面上一个next方法返回的元素
        void forEachRemaining(Consumer action):这是java8为Iterator新增加的默认方法，该方法可以使用Lambda表达式遍历集合元素
        但使用迭代时，Collection集合元素不能修改，只能通过Iterator的remove()才行，不然会java.util.ConcurrentModificationException
         */
        Iterator<String> it = books.iterator();
        while (it.hasNext()) {
            String book = it.next();
            System.out.println(book);
            if (book.equals("书3")) {
                //从集合中删除上一次next()方法返回的元素
                it.remove();
            }
            //对book变量赋值，不会改变集合元素本身
            //但使用Iterator对集合元素进行迭代时，Iterator并不是把集合元素本身传个迭代变量，而是把集合元素的值传给迭代变量
            //所以修改迭代变量的字对集合元素本身没有任何影响
            //book="测试字符串";
        }
        System.out.println(books);
    }

    private static void foreachMethod3() {
        System.out.println("================================================================================");
        //创建一个集合
        Collection<String> books = new HashSet<>();
        //增加元素
        books.add("书1");
        books.add("书2");
        books.add("书3");
        books.add("书4");
        Iterator<String> it = books.iterator();
        //===================使用Lambda表达式遍历Iterator===================
        /*
        java8为Iterator新增一个forEachRemaining(Consumer action)方法
         */
        it.forEachRemaining(obj -> System.out.println("迭代元素:" + obj));
    }

    private static void foreachMethod4() {
        System.out.println("================================================================================");
        //创建一个集合
        Collection<String> books = new HashSet<>();
        //增加元素
        books.add("书1");
        books.add("书2");
        books.add("书3");
        books.add("书4");
        //===================使用foreach遍历===================
        for (String book : books) {
            System.out.println(book);
            if (book.equals(("书2"))) {
                //下面代码回引发ConcurrentModificationException异常
                try {
                    books.remove(book);
                } catch (ConcurrentModificationException e) {
                    System.out.println("修改异常");
                }
            }
        }
    }
}
