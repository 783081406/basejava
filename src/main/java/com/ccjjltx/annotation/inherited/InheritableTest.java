package com.ccjjltx.annotation.inherited;

/**
 * Created by ccjjltx on 2017/4/12.
 * 验证继承性能
 *
 * @author ccj
 * @version 1.0
 */
public class InheritableTest extends Base {
    public static void main(String[] args) {
        //打印InheritableTest类是否具有@Inheritable修饰
        System.out.println(InheritableTest.class.isAnnotationPresent(Inheritable.class));//true
    }
}

@Inheritable
class Base {
}