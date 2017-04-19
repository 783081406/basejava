package com.ccjjltx.io.nio.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * Created by ccjjltx on 2017/4/18.
 *
 * @author ccj
 * @version 1.0
 */
public class CharsetTransform {
    public static void main(String[] args) throws Exception {
//        Properties properties = System.getProperties();
//        for (Object key : properties.keySet()) {
//            String name = (String) key;
//            System.out.println(name + "------>" + properties.get(key));
//        }
        //file.encoding------>UTF-8
        // 创建简体中文对应的Charset
        Charset cn = Charset.forName("UTF-8");
        // 获取cn对象对应的编码器和解码器
        CharsetEncoder cnEncoder = cn.newEncoder();
        CharsetDecoder cnDecoder = cn.newDecoder();
        // 创建一个CharBuffer对象
        CharBuffer cbuff = CharBuffer.allocate(20);
        cbuff.put('随');
        cbuff.put('便');
        cbuff.flip();
        // 将CharBuffer中的字符序列转换成字节序列
        ByteBuffer bbuff = cnEncoder.encode(cbuff);
        // 循环访问ByteBuffer中的每个字节
        for (int i = 0; i < bbuff.limit(); i++) {
            System.out.print(bbuff.get(i) + " ");
        }
        // 将ByteBuffer的数据解码成字符序列
        System.out.println("\n" + cnDecoder.decode(bbuff));
//        bbuff.clear();
//        while (bbuff.hasRemaining()) {
//            System.out.print(bbuff.get() + " ");
//        }
    }
}
