/**
 * Created by ccjjltx on 2017/4/22.
 * 如果程序不使用synchronized关键字来保证同步，而直接使用Lock对象来保证同步，而系统中不存在隐式的同步监视器，也就不能使用wait(),
 * notify(),notifyAll()方法进行线程通信了
 * <p>
 * 当使用Lock对象来保证同步时，Java提供了一个Condition类来保持协调，使用Condition可以让已经得到Lock对象却无法继续执行的线程释放Lock对象，
 * Condition对象也可以唤醒其他处于等待的线程
 * <p>
 * Condition将同步监视器方法(wait()、notify()和notifyAll())分解成截然不同的对象，以便通过将这些对象与Lock对象组合使用，为每个
 * 对象提供多个等待集(wait-set)。在这种情况下，Lock代替了同步方法或同步代码块，Condition代替了同步监视器的功能。
 * <p>
 * Condition实例被绑定在一个Lock对象上。要获得指定Lock实例的Condition实例，调用Lock对象newCondition()方法即可。Condition提供三个方法：
 * <p>
 * await():类似于隐式同步监视器上的wait()方法，导致当前线程等待，直到其他线程调用该Condition的signal()方法或signalAll()方法来唤醒
 * 该线程。该await()方法有更多变体，如long awaitNanos(long nanosTimeout)、void awaitUninterruptibly()、awaitUntil(Date deadline)等，
 * 可以完成更加丰富的等待操作
 * signal():唤醒在此Lock对象上等待的单个线程。如果所有线程都在该Lock对象上等待，则会唤醒其中一个线程。选择是任意性的。只有当前线程放弃对该
 * Lock对象的锁定后（使用await()方法），才可以执行被唤醒的线程
 * signalAll():唤醒在此Lock对象上等待的所有线程。只有当前线程放弃对该Lock对象的锁定后，才可以执行被唤醒的线程。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.thread.condition;