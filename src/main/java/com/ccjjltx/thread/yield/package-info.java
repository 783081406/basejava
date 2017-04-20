/**
 * Created by ccjjltx on 2017/4/20.
 * yield()方法是一个和sleep()方法有点显示的方法，静态，可以让当前正在执行的县城暂停，但它不会阻塞该线程，它只是将该线程转入就绪状态。
 * yield()只是让当前线程暂停一下，让系统的线程调度器重新调度一次，完全可能的情况是：当某个线程调用了yield()方法暂停之后，
 * 线程调度器又将其调度出来重新执行
 * 实际上，但某个线程调用了yield()方法暂停之后，只有优先级与当前线程相同，或者优先级比当前线程更高的处于就绪状态的线程才会获得执行的机会。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.yield;