package com.ccjjltx.objectoriented.nestedclasses.useinnerclass;

/**
 * Created by ccjjltx on 2017/3/18.
 * 调用Out的内部类In
 *
 * @author ccj
 * @version 1.0
 */
public class CreateInnerInstance {
    public static void main(String[] args) {
        Out.In in = new Out().new In("测试信息");
        /*
        可以改成：
        Out.In in;
        Out out=new Out();
        in=out.new In("测试信息");
         */
    }
}
