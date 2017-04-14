/**
 * Created by ccjjltx on 2017/4/14.
 * 推回输入流：
 * PushbackInputStream:
 * PushbackReader:
 * 提供了三个方法：
 * void unread(byte[]/char[] buf):将一个字节/字符数组内容推回到推回缓冲流里，从而允许重复读取公共读取的内容。
 * void unread(byte[]/char[] b,int off,int len):将一个字节/字符数组里从off开始，长度为len字节/字符的内容推回到推回缓冲区里，
 * 从而允许重复读取公共的内容
 * void unread(int b):将一个字节/字符推回到推回缓冲区里，从而允许重复读取刚刚读取的内容。
 * <p>
 * 这三个方法与InputStream和Reader中的三个read()方法一一对应，
 * <p>
 * 这两个推流输入流都带有一个推回缓冲区，当程序调用这两个推回输入流的unread()方法时，系统将会把制定数组的内容推回到该缓冲区，
 * 而推回输入流每次调用read()方法时总是先从推回缓冲流读取，只有完全读取了推回缓冲区的内容后，但还没有装满read()说需的数组时才会
 * 从原来输入流中读取。
 * <p>
 * 当程序创建一个PushbackInputStream和PushbackReader时需要制定推回缓冲区的大小，默认的推回缓冲区的长度为1.如果程序中推回到
 * 推回缓冲区的内容超过了推回缓冲区的大小，将会引发Pushback buffer overflow的IOException异常
 * <p>
 * 推回缓冲区的长度与read()方法的数组参数的长度没有任何关系，完全可以更大
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.pushback;