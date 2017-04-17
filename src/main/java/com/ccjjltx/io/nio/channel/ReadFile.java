package com.ccjjltx.io.nio.channel;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * Created by ccjjltx on 2017/4/17.
 * 如果习惯了传统IO的用竹筒多次重复取水的过程，或者担心Channel对应的文件过大，使用map()方法一次将所有的文件内容映射到内存中
 * 引起性能下降，也可以用Channel和Buffer传统的“用竹筒多次重复取水”的方式
 *
 * @author ccj
 * @version 1.0
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        try (
                //创建文件输入流
                FileInputStream fileInputStream = new FileInputStream("src/main/java/com/ccjjltx/io/nio/channel/a.txt");
                //创建一个FileChannel
                FileChannel fileChannel = fileInputStream.getChannel()) {
            //定义一个ByteBuffer对象，用于重复取水
            ByteBuffer byteBuffer = ByteBuffer.allocate(256);
            //将FileChannel中的数据放入ByteBuffer中
            while (fileChannel.read(byteBuffer) != -1) {
                //锁定Buffer的空白区
                byteBuffer.flip();
                //创建Charset对象
                Charset charset = Charset.forName("UTF8");
                //创建解码器
                CharsetDecoder decoder = charset.newDecoder();
                //将ByteBuffer的内容转码
                CharBuffer charBuffer = decoder.decode(byteBuffer);
                System.out.println(charBuffer);
                //将Buffer初始化，为下一次读取数据做准备
                byteBuffer.clear();
            }
        }
    }
}
