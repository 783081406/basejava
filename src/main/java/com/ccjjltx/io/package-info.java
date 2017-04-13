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
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io;