/**
 * Created by ccjjltx on 2017/4/14.
 * Java的标准输入/输出分别通过System.in和System.out来代表，在默认情况下分别代表键盘的和显示器
 * 当程序通过System.in来获取输入时，实际上是从键盘读取输入；但程序试图通过System.out执行输入时，程序总是输出到屏幕
 * 三个重定向标准输入/输出的方法
 * static void setErr(PrintStream err):重定向"标准"错误输出流
 * static void setIn(InputStream in):重定向"标准"输出流
 * static void setOut(PrintStream out):重定向"标准"输出流
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.system;