package com.ccjjltx.collection.set.treeset;

import java.util.TreeSet;

/**
 * Created by ccjjltx on 2017/3/2.
 * TreeSet采用红黑树的数据结构来存储集合元素。TreeSet支持两种集合排序方法:自然排序和定制排序，
 * 默认情况下TreeSet采用自然排序
 * 自然排序:TreeSet会调用集合元素的compareTo(Object obj)方法来比较元素之间的大小关系，然后将集合元素升序排列，
 * 这种方式就是自然排序（放在存储的类，要实现Comparable)
 * 定制排序:如果要自定义排序，这可以通过Comparator接口（即存放的类要有专门的规则类去实现Comparator接口或者
 * 使用Lambda表达式调用Comparator接口的compara(Object obj1,Object obj2)
 * <p>
 * 如果向TreeSet中添加的对象是程序员自定义类的对象，则可以向TreeSet中添加多种类型的对象，前提是用户自定义类实现了Comparable接口
 * 且实现compareTo(Object obj)方法没有进行强制类型转换，但当试图去除TreeSet里面的集合元素时，不同类型的元素依然会发生ClassCastException
 * <p>
 * 如果两个对象通过compareTo(Object obj)方法比较相等，新对象无法添加到TreeSet集合中
 *
 * @author ccj
 * @version 1.0
 */
public class TreeSetTest {
    public static void main(String[] args) {
        //调用已经实现comparable接口来自然排序
        natureSort();
        //自定义排序，还是自然排序
        natureSort2();
        //定制排序
        customSort();
    }

    /**
     * 自然排序
     * 实现comparable接口的常用类：
     * BigDecimal、BigInteger以及所有的数字型对应的安装类：按他们对应的数字大小进行比较
     * Character:按字符的UNICODE值进行比较
     * Boolean:true对应的包装类实例大于false对应的包装类实例
     * String：按字符串中字符的UNICODE值进行比较
     * Date、Time:后面的时间、日期比前面的时间、日期大
     */
    private static void natureSort() {
        TreeSet<Integer> nums = new TreeSet<>();
        //向TreeSet中添加四个Integer对象
        //自动装箱成Integer对象，里面实现Comparable接口
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        //输出集合元素，看到集合元素已经处于排序状态
        System.out.println(nums);
        //输出集合里的第一个元素
        System.out.println(nums.first());
        //输出集合里的最后一个元素
        System.out.println(nums.last());
        //返回小于4的子集,不包含4
        System.out.println(nums.headSet(4));
        //返回大于5的子集，如果Set中包含5，子集中还包含5
        System.out.println(nums.tailSet(5));
        //返回大于等于-3,小于4的子集
        System.out.println(nums.subSet(-3, 4));
    }

    /**
     * 自定义实现Comparable接口
     */
    private static void natureSort2() {
        System.out.println("=======================================");
        TreeSet<R> ts = new TreeSet<>();
        ts.add(new R(5));
        ts.add(new R(-3));
        ts.add(new R(9));
        ts.add(new R(-2));
        //有序排列
        System.out.println(ts);//[R[count:-3], R[count:-2], R[count:5], R[count:9]]
        //取出第一个元素
        R first =  ts.last();
        //对最后一个元素的count赋值，与第二个元素的一样
        first.setCount(-2);
        //发现无序排列
        System.out.println(ts);//[R[count:-3], R[count:-2], R[count:5], R[count:-2]]
        //删除失败
        System.out.println(ts.remove(new R(-2)));//true
        System.out.println(ts);//[R[count:-3], R[count:5], R[count:-2]]
        //删除实例变量没有被改变的元素，删除成功
        System.out.println(ts.remove(new R(5)));//true
        System.out.println(ts);//[R[count:-3], R[count:-2]]
        System.out.println(ts.remove(new R(-2)));//true
        System.out.println(ts);//[R[count:-3]]
    }

    private static void customSort() {
        System.out.println("=======================================");
        //此处Lambda表达式的目标类型是Comparator
        TreeSet<M> ts = new TreeSet<>((o1, o2) -> {
            //根据M对象的age属性来决定大小，age越大，M对象反而越小
            return o1.getAge() > o2.getAge() ? -1 : o1.getAge() < o2.getAge() ? 1 : 0;
        });
        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);//[M[age9], M[age5], M[age-3]]
    }
}
