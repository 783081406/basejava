package com.ccjjltx.thread.wait;

/**
 * Created by ccjjltx on 2017/4/21.
 * 需求：
 * 要求每当存款者将钱存入指定账户后，取钱者就立即取出该笔钱。不允许存款连续两次存钱，也不允许取钱者连续两次取钱
 *
 * @author ccj
 * @version 1.0
 */
public class Account {
    //封装账户编号、账户余额的两个成员变量
    private String accountNo;
    private double balance;
    //标识账户中是否已有存款的旗标
    private boolean flag = false;

    public Account() {
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    //取钱操作
    public synchronized void draw(double drawAmount) {
        try {
            //如果flag为假，表明账户中还没有人存钱进去，取钱方法阻塞
            if (!flag) {
                wait();
            } else {
                //执行取钱操作
                System.out.println(Thread.currentThread().getName() + "取钱:" + drawAmount);
                balance -= drawAmount;
                System.out.println("账户余额为:" + balance);
                //将标识账户是否已有存款的表弃设置为false
                flag = false;
                //唤醒其他线程
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //存款
    public synchronized void deposit(double depositAmount) {
        try {
            //如果flag为真，表明账户中已有人存钱进入，存钱方法阻塞
            if (flag) {
                wait();
            } else {
                //执行存款操作
                System.out.println(Thread.currentThread().getName() + " 存款:" + depositAmount);
                balance += depositAmount;
                System.out.println("账户余额为:" + balance);
                //将表示账户是否已有存款的旗标设为true
                flag = true;
                //唤醒其他线程
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 下面两个方法根据accountNo来重写hashCode()和equals()方法
    public int hashCode() {
        return accountNo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj != null
                && obj.getClass() == Account.class) {
            Account target = (Account) obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }
}
