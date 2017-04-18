/**
 * Created by ccjjltx on 2017/4/18.
 * 使用文件锁可以有效得阻止多个进程并发修改同一个文件，所以现在的大部分操作系统都提供了文件锁的功能。
 * FileChannel中提供的lock()/tryLock()方法可以获得文件锁FileLock对象，从而锁定文件。lock()和tryLock()方法存在的区别：
 * lock()试图锁定某个文件时，如果无法得到文件锁，程序将一直堵塞；
 * 而tryLock()是尝试锁定文件，它将直接返回而不是堵塞，如果获得了文件锁，该方法则会返回该文件锁，否则返回null。
 * 只锁定部分内容，而不是锁定全部内容：
 * lock(long position,long size,boolean shared):对文件从position开始，长度为size的内容加锁，该方法是阻塞式的
 * tryLock(long position,long size,boolean shared):非阻塞式的加锁方法，shared为true时，表明该锁是一个共享锁，它将允许多个进程来读取该文件，
 * 但阻止其他进程获得该文件的排它锁。但shared为false时，表明该锁是一个排它锁，它将锁住对该文件的读写。程序可以通过调用FileLock的isShared来判断
 * 它获得的所是否是共享锁
 * <p>
 * 注意点：
 * 1.在某些平台上，文件锁仅仅是建议性的，并不是强制性的。这就意味着即使一个程序不能获得文件锁，他也可以对该文件进行读写
 * 2.在某些平台上，不能同步得锁定一个文件并把他映射到内存中
 * 3.文件锁是由Java虚拟机所持有的，如果两个Java程序使用同一个Java虚拟机运行，则他们不能对同一个文件进行加锁
 * 4.在某些平台上关闭FileChannel时，会释放Java虚拟机在该文件上的所有锁，因此应该避免对同一个锁定的文件打开多个FileChannel
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.nio.lock;