package com.ccjjltx.annotation.annotatedelement.practice1;

/**
 * Created by ccjjltx on 2017/4/12.
 *
 * @author ccj
 * @version 1.0
 */
public class RunTests {
    public static void main(String[] args) throws Exception {
        //处理MyTest类
        ProcessorTest.process("com.ccjjltx.annotation.annotatedelement.practice1.MyTest");
        /*
        方法m3,运行失败，异常:java.lang.IllegalArgumentException: 参数出错!
        方法m7,运行失败，异常:java.lang.RuntimeException: 程序业务出现异常!
        共运行了:4个方法，其中:
        失败了:2个,
        成功了:2个;
         */
    }
}
