/**
 * Created by ccjjltx on 2017/4/20.
 * 并进入阻塞状态，则可以通过调用Thread类的静态sleep()方法来实行。sleep()方法有两种重载方式
 * static void sleep(long millis):让当前正在执行的线程暂停millis毫秒，并进入阻塞，该方法受到系统计时器和线程调度器的精度与准确度的影响
 * static void sleep(long millis,int nanos):让当前正在执行线程暂停millis毫秒加nanos毫微秒，并进入堵塞状态，该方法收到系统计时器和线程
 * 调度器的进度与准确度的影响
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.sleep;