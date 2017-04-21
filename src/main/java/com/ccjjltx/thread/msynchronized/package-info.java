/**
 * Created by ccjjltx on 2017/4/21.
 * Java的多线程安全支持还提供了同步方法，同步方法就是使用synchronized关键字来修饰某个方法，则该方法称为同步方法。
 * 对于synchronized修饰的实例方法（非static方法）而言，无需显式制定同步监视器，同步方法的同步监视器是this,也就是调用该方法的对象。
 * <p>
 * 线程安全的类特征：
 * 1.该类的对象可以被多个线程安全地访问
 * 2.每个线程调用该对象的任意方法之后都将得到正确结果
 * 3.每个线程调用该对象的任意方法之后，该对象状态依然保持合理状态
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.msynchronized;