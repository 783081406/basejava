package com.ccjjltx.object.objects;

import java.util.Objects;

/**
 * Created by ccj on 2017/2/14.
 * @author ccj
 * @version 1.0
 */
public class ObjectsTest {
    //定义一个obj变量，它的默认值是null
    private static ObjectsTest obj;
    public static void main(String[] args){
        //非空输出hash值，空输出0
        System.out.println(Objects.hashCode(obj));
        //非空输出字符串，空输出"null"
        System.out.println(Objects.toString(obj));
        //非空返回本身，空引发NullPointerException异常抛出message
        System.out.println(Objects.requireNonNull(obj,"obj参数不能是null"));
    }
}
