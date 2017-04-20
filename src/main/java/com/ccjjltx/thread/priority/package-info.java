/**
 * Created by ccjjltx on 2017/4/20.
 * 优先级高的线程获取较多的执行机会，而优先级低的线程则获取较少的执行机会
 * 每个线程默认的优先级都与创建它的父线程的优先级相同，在默认情况下，main县城具有普通优先级，由main线程创建的子线程也具有普通优先级
 * setPriority(int newPriority):
 * getPriority():
 * <p>
 * MAX_PRIORITY:其值是10
 * Min_PRIORITY:其值是1
 * NORM_PRIORITY:其值是5
 * 也可以是一个整数1~10
 * <p>
 * 不同操作系统上的优先级并不相同，而且也不能很好地和Java的10个优先级对象，例如Windows2000仅提供了7个优先级。因此应该尽量避免直接为
 * 线程指定优先级，而应该使用MAX_PRIORITY,MIN_PRIORITY和NORM_PRIORITY三个静态常量设置优先级，这样才可以保证程序具有最后的可移植性。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.priority;