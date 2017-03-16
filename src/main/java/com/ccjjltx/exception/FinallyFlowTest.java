package com.ccjjltx.exception;

/**
 * Created by ccjjltx on 2017/3/16.
 * 不要再finally快中使用如return或throw等导致方法终止的语句，一旦在finally块使用了return或throw语句，将会导致try块，catch
 * 块中的return、throw语句失效
 *
 * @author ccj
 * @version 1.0
 */
public class FinallyFlowTest {
    public static void main(String[] args) throws Exception {
        boolean a = test();
        //返回false
        System.out.println(a);
    }

    /**
     * 当Java程序执行try块、catch块时遇到了return或throw语句，这两个语句都会导致方法立即结束，但是系统执行这两个语句并不会结束这个方法，
     * 而是去寻找该异常处理流程中是否包含finally块，如果没有finally快，程序立即执行return或throw语句，方法终止；
     * 如果有finally块，系统立即开始执行finally块----只有当finally快执行完成后，系统才会再次跳回执行try、catch块里的return或throw语句；
     * 如果finally块里也使用了return或throw等导致方法终止的语句，finally块已经终止了方法，系统将不会跳回执行try、catch块里的任何代码
     *
     * @return false
     */
    public static boolean test() {
        try {
            //因为finally块中包含了return语句
            //所以下面的return失去作用
            return true;
        } finally {
            return false;
        }
    }
}
