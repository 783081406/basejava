/**
 * Created by ccjjltx on 2017/4/22.
 * 默认情况下子线程和创建它的父线程处于同一线程组内
 * 线程运行中途不能改变它所属线程组
 * <p>
 * Thread内提供了几个构造器来设置新创建的线程属于哪个线程组
 * Thread(ThreadGroup group,Runnable target):以target的run()方法作为线程执行体创建新的线程，属于group线程组
 * Thread(ThreadGroup group,Runnable target,String name):以target的run()方法作为线程执行体创建新线程，该线程属于group线程组，且线程名为name
 * Thread(ThreadGroup group,String name):创建新线程，新线程名为name，属于group线程组。
 * <p>
 * getThreadGroup()
 * <p>
 * ThreadGroup类提供两个构造器来创建实例
 * ThreadGroup(String name):以指定的线程组名字来创建新的线程组
 * ThreadGroup(ThreadGroup parent,String name);以指定的名字、指定的父线程组创建一个新线程组
 * <p>
 * 不可改变线程组的名字
 * <p>
 * getName()
 * <p>
 * 提供了几个常用的方法来操作整个线程组的所有线程：
 * int activeCount():返回此线程组中活动线程的数目
 * interrupt():中断此线程组中的所有线程
 * idDaemon():判断该线程组是否是后台线程组
 * setDaemon(boolean daemon):把该线程组设置成后台线程组，后台线程组有一个特征——当后台线程组的最后一个线程执行结束或最后一个线程被
 * 销毁后，后台线程将自动销毁
 * setMaxPriority(int pri):设置线程组的最高优先级。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.threadgroup;