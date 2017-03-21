package com.ccjjltx.objectoriented.gc;

/**
 * Created by ccjjltx on 2017/3/21.
 * 通知回收，是否回收不确定
 * 系统完全有可能并不立即进行垃圾回收，垃圾回收机制也不会对程序的建议完全置之不理；垃圾回收机制会在收到通知后，尽快进行垃圾回收
 *
 * @author ccj
 * @version 1.0
 */
public class GcTest {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            new GcTest();
            System.gc();
        }
        /*
        系统正在清理GcTest对象的资源
        系统正在清理GcTest对象的资源
        系统正在清理GcTest对象的资源
        系统正在清理GcTest对象的资源
         */
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("系统正在清理GcTest对象的资源");
    }
}
