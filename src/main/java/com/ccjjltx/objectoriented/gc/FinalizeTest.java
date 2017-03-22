package com.ccjjltx.objectoriented.gc;

/**
 * Created by ccjjltx on 2017/3/22.
 *
 * @author ccj
 * @version 1.0
 */
public class FinalizeTest {
    private static FinalizeTest ft = null;

    public void info() {
        System.out.println("测试资源清理的finalize方法");
    }

    public static void main(String[] args) {
        //创建FinalizeTest对象立即进入可恢复状态(由于是匿名对象，创建后没有赋值给任何引用所以立即进入了可恢复状态)
        new FinalizeTest();
        //通知系统立即进行垃圾回收
        System.gc();
        //强制系统立即调用可恢复对象的finalize()方法
        System.runFinalization();
        ft.info();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        ft = this;
    }
}
