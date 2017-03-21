package com.ccjjltx.objectoriented.lambda;

/**
 * Created by ccjjltx on 2017/3/21.
 * 方法引用，构造器引用
 *
 * @author ccj
 * @version 1.0
 */
public class MethodRefer {
    public static void main(String[] args) {
        //使用普通lambda表达式
        Converter converter1 = from -> Integer.valueOf(from);
        System.out.println(converter1.conver("12"));
        //使用引用类方法的lambda表达式
        Converter converter2 = Integer::valueOf;
        System.out.println(converter2.conver("34"));
        //普通
        MyTest myTest1 = (a, b, c) -> a.substring(b, c);
        String cc = "my name is ccj and i like programming";
        System.out.println(myTest1.test(cc, 3, 6));//nam
        //引用某类对象的实例方法的Lambda表达式
        MyTest myTest2 = String::substring;
        System.out.println(myTest1.test(cc, 3, 6));//nam

    }
}

@FunctionalInterface
interface Converter {
    Integer conver(String from);
}

@FunctionalInterface
interface MyTest {
    String test(String a, int b, int c);
}