/**
 * Created by ccjjltx on 2017/4/18.
 * GBK:简单中文字符集
 * BIG5：繁体中文字符集
 * ISO-8859-1：ISO拉丁字母表No.1,也就是ISO-LATIN-1
 * UTF-8:8位USC转换格式
 * UTF-16BE:16位UCS转换格式，Big-endian(最低地址存放高位字节）字节顺序
 * UTF-16LE:16位UCS转换格式，Little-endian(最高地址存放低位字节）字节顺序
 * UTF-16:16位UCS转换格式，字节顺序由可选的字节顺序标记来标识
 * <p>
 * 1.知道字符集的别名之后程序就可调用Charset的forName()方法来创建对应的Charset对象
 * 2.得到Charset对象之后，通过对象的newDecode(),new Encoder()两个方法分别返回CharsetDecode和CharsetEncoder对象，代表该Charset的解码器和编码器
 * 3.调用CharsetDecode的decode()方法就可以将ByteBuffer(字节序列）转换成CharBuffer（字符序列）
 * 3.调用CharsetEncoder的encode()方法可以将CharBuffer或String(字符序列)转换成ByteBuffer(字节序列）
 * <p>
 * 如果只是简单的编解码，Charset类也提供了三个方法：
 * CharBuffer decode(ByteBuffer bb):将ByteBuffer中的字节序列转换成字符序列的便捷方法
 * ByteBuffer encode(CharBuffer cv):将CharBuffer中的字符序列转换成字节序列的便捷方法
 * ByteBuffer encode(String str):将String中的字符序列转换成字节序列的便捷方法
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.nio.charset;