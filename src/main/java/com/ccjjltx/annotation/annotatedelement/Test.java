package com.ccjjltx.annotation.annotatedelement;

import java.lang.annotation.Annotation;

/**
 * Created by ccjjltx on 2017/4/12.
 * AnnotatedElement使用
 *
 * @author ccj
 * @version 1.0
 */
public class Test {
    @MyTag
    public void info() {
        System.out.println("--------info()--------");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Test test = new Test();
        //获取test对象的info方法里面包含的所有注解
        Annotation[] annotation = test.getClass().getMethod("info").getAnnotations();
        //遍历每个对象
        for (Annotation tag : annotation) {
            System.out.println("Tag is:" + tag);
            //将tag强制类型转换为MyTag
            if (tag instanceof MyTag) {
                System.out.println("tag.name():" + ((MyTag) tag).name());
                System.out.println("tag.age():" + ((MyTag) tag).age());
            }
        }
    }
}
