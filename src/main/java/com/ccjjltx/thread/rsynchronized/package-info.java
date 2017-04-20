/**
 * Created by ccjjltx on 2017/4/20.
 * synchronized(obj){
 * ....
 * //此处的代码就是同步代码块
 * }
 * 上面语法格式中synchronized后的括号的obj就是同步监视器，线程开始执行同步代码块之前，必须先获得对同步监视器的锁定。
 * <p>
 * 任何时刻只能有一个线程可以获得对同步监视器的锁定，但同步代码块执行完后，该线程会释放对该同步监视器的锁定。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.rsynchronized;