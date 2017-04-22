package com.ccjjltx.thread.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ccjjltx on 2017/4/22.
 *
 * @author ccj
 * @version 1.0
 */
public class Account {
    //显式定义Lock对象
    private final Lock lock = new ReentrantLock();
    //获取指定Lock对象相应的Condition
    private final Condition cond = lock.newCondition();
    //封装账户编号、账户余额的两个成员变量
    private String accountNo;
    private double balance;
    //标识账户中是否已有存款的旗标
    private boolean flag = false;

    public Account() {
    }

    //构造器
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

    public void draw(double drawAmount) {
        //加锁
        lock.lock();
        try {
            //如果flag为假，表明在账户中还没有人存钱进去，取钱方法阻塞
            if (!flag) {
                cond.await();
            } else {
                //执行取钱操作
                System.out.println(Thread.currentThread().getName() + "取钱:" + drawAmount);
                balance -= drawAmount;
                System.out.println("账户余额为" + balance);
                //将标识账户是否已有存款的旗标为false
                flag = false;
                //唤醒其他线程
                cond.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //使用finally释放锁
            lock.unlock();
        }
    }

    public void deposit(double depositAmount) {
        lock.lock();
        try {
            //如果flag为真，表明账户中已有人存钱进去，存钱方法阻塞
            if (flag) {
                cond.await();
            } else {
                //执行存款操作
                System.out.println(Thread.currentThread().getName() + "存款:" + depositAmount);
                balance += depositAmount;
                System.out.println("账户余额为:" + balance);
                //将表示账户时候已有存款的旗标设置为true
                flag = true;
                //唤醒其他线程
                cond.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            //使用finally块来释放锁
            lock.unlock();
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
