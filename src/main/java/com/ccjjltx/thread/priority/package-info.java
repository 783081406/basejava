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
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.priority;