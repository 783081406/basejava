/**
 * Created by ccj on 2017/2/13.
 * Scanner是一个基于正则表达式的文本扫描器，可以从文件、输入流、字符串中解析出比本类型的值或者字符串
 * 提供多个构造器，不同的构造器可以接收文件、输入流、字符串作为数据源，用于从文件、输入流、字符串中解析数据
 * 主要提供两种方法：
 * hasNextXxx():是否还有下一个输入项，其中Xxx可以是Int、Long等代表基本数据类型的字符串。如果只是判断是否包含下一个字符串，则直接使用hasNext()
 * nextXxx():获取下一个输入项。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.scanner;