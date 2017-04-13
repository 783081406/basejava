/**
 * Created by ccjjltx on 2017/4/13.
 * 输入/输出是所有程序都必备的部分——使用输入机制，允许程序读取外部数据（包括来自磁盘、光盘等存储设备的数据）、用户输入
 * 数据：使用输入机制，允许程序记录运行状态，将程序数据输入到磁盘、光盘等存储设备中
 * <p>
 * 输入流主要由InputStream和Reader作为基类，而输出流则主要由OutputStream和Writer作为基类。它们都是一些抽象类，无法直接创建实例
 * <p>
 * InputStream
 * int read():从输入流中读取单个字节，返回所读取的字节数据（字节数据可直接转换为int类型）
 * int read(byte[] b):从输入流中最多读取b.length个字节的数据，并将其存储在直接数组b中，返回实际返回的字节数。
 * int read(byte[] b,int off,int len):从输入流中最多读取len个字节的数据，并将其存储在数组b中，放入数组b中时，并不是从数组
 * 起点开始，而是从off位置开始，返回实际读取的字节数
 * Reader
 * int read():从输入流中读取单个字符，返回所读取的字符数据（字符数据可以直接转换为int类型）
 * int read(char[] cbuf):从输入流中最多读取cbuf.length个字符的数据，并将其存储的字符数组cbuf中返回实际读取的字符数
 * int read(char[] cbuf,int off,int len):从输入流中最多读取len个字符的数据，并将其存储在支付数组cbuf中，放入数组cbuf中时，并不是
 * 从数组起点开始，而是从off位置开始，返回实际读取的字符数
 * <p>
 * InputStream和Reader支持移动记录指针：
 * void mark(int readAheadLimit):在记录指针当前位置记录一个标记（mark）
 * boolean markSupported():判断此输入流是否
 * void reset():将此流的记录指针重新定位到上一次记录标记(mark)的位置
 * long skip(long n):记录指针向前移动n个字节/字符
 * <p>
 * OutputStream
 * void write(int c):将指定的字节/字符输入到输入流中，其中c既可以代表字节，也可以代表字符
 * void write(byte[]/char[] buf):将字节数组/字符数组中的数据输出到指定输出流中
 * void write(byte[]/char[] buf,int off,int len):将字节数组/字符数组中从off位置开始，长度为len的字节/字符输出到输出流中
 * <p>
 * Writer（因为字符流直接以字符作为操作单位，所以Writer可以用字符串来代替字符数组，即以String对象作为参数）
 * void writer(String str):将str字符串里包含的字符输入到指定输入流中
 * void writer(String str,int off,int len):将str字符串里从off位置开始，长度为len的字符串输出到制定输入流中
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io;