/**
 * Created by ccjjltx on 2017/4/20.
 * Thread提供了一个线程等待另一个线程完成的方法——join()方法
 * 当在某个程序执行流中调用其他线程的join()方法时，调用线程将被阻塞，直到被join()方法加入的join线程执行完为止
 * <p>
 * join()方法有如下三种重载形式
 * join():等待被join的线程执行完成
 * join(long millis):等待被join的线程的时间最长为millis毫秒。如果在millis毫秒内被join的线程还没有执行结束，则不在等待
 * join(long millis,int nanos):等待被join的线程的时间最长为millis毫秒加nanos毫微秒
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.join;