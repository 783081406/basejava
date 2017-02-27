package com.ccjjltx.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * Created by ccjjltx on 2017/2/27.
 * Java8为Collection集合新增一个removeIf(Predicate filter)方法该方法将会批量删除符合filter条件的所有元素。
 * 该方法需要一个Predicate（谓词）对象作为参数，Predicate也是函数式接口
 * @author ccj
 * @version 1.0
 */
public class PredicateTest {
    public static void main(String[] args) {
        //创建一个集合
        Collection<String> books = new HashSet<>();
        //增加元素
        books.add("书123456789123");
        books.add("书2");
        books.add("书3");
        books.add("书4567892456");
        //统计书名包含"89"子串的图书数量
        System.out.println(calAll(books,ele->((String)ele).contains("89")));
        //统计字符长度大于10
        System.out.println(calAll(books,ele->((String)ele).length()>10));
        //过滤
        books.removeIf(ele->ele.length()<10);
        System.out.println(books);
    }
    private static int calAll(Collection<String> books,Predicate p){
        int total=0;
        for(String obj:books){
            //使用Predicate的test()方法判断该对象是否满足Predicate指定的条件
            if(p.test(obj)){
                total++;
            }
        }
        return total;
    }
}
