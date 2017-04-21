package com.ccjjltx.thread.rsynchronized;

/**
 * Created by ccjjltx on 2017/4/21.
 * 任何线程在修改指定资源之前，首先会该资源加锁，在加锁期间其他线程无法修改该资源，当该县城修改完成后，该线程释放对该资源的锁定。
 * 通过这种方式就可以保证并发线程在任一时刻只有一个线程可以进入修改共享资源的代码区(也被称为临界区),所以同一时刻最多只有一个线程处于临界区内，
 * 从而保证了县城的安全性。
 *
 * @author ccj
 * @version 1.0
 */
public class DrawTest {
    public static void main(String[] args) {
        //创建一个账户
        Account account = new Account("1234567", 1000);
        //模拟两个线程对同一个账户取钱
        new DrawThread("甲", account, 800).start();
        new DrawThread("乙", account, 800).start();
        /*
        甲取钱成功！吐出钞票:800.0
            余额为:200.0
        乙取钱失败!余额不足
         */
    }
}
