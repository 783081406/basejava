package com.ccjjltx.genericity;

/**
 * Created by ccjjltx on 2017/4/9.
 *
 * @author ccj
 * @version 1.0
 */
public class InferenceTest {
    public static void main(String[] args) {
        //可通过方法赋值的目标参数来推断类型参数为String
        MyUtil<String> ls = MyUtil.nil();
        //无需使用下面语句在调用nil()方法时指定类型参数的类型
        MyUtil<String> mu = MyUtil.<String>nil();
        //可调用cons()方法所需要的参数类型来判断类型参数为Integer
        MyUtil.cons(42, MyUtil.nil());
        //无需使用下面语句在调用nil()方法时指定类型参数的类型
        MyUtil.cons(42, MyUtil.<Integer>nil());
        //下面代码报错
        //String s=MyUtil.nil().head();
        //可以将上面代码改成
        String s = MyUtil.<String>nil().head();
    }
}

class MyUtil<E> {
    public static <Z> MyUtil<Z> nil() {
        return null;
    }

    public static <Z> MyUtil<Z> cons(Z head, MyUtil<Z> tail) {
        return null;
    }

    E head() {
        return null;
    }
}