package com.ccjjltx.thread.condition;

/**
 * Created by ccjjltx on 2017/4/22.
 *
 * @author ccj
 * @version 1.0
 */
public class DrawTest {
    public static void main(String[] args) {
        // 创建一个账户
        Account acct = new Account("789456123", 0);
        new DrawThread("取钱者", acct, 800).start();
        new DepositThread("存款者甲", acct, 800).start();
        new DepositThread("存款者乙", acct, 800).start();
        new DepositThread("存款者丙", acct, 800).start();
    }
}
