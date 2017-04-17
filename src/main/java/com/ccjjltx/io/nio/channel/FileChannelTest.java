package com.ccjjltx.io.nio.channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/**
 * Created by ccjjltx on 2017/4/17.
 *
 * @author ccj
 * @version 1.0
 */
public class FileChannelTest {
    public static void main(String[] args) {
        File f = new File("src/main/java/com/ccjjltx/App.java");
        try (
                //创建一个FileInputStream,以该文件输入创建FileChannel
                FileChannel inChannel = new FileInputStream(f).getChannel();
                FileChannel outChannel = new FileOutputStream("src/main/java/com/ccjjltx/io/nio/channel/a.txt").getChannel()) {
            //将FileChannel里的全部数据映射成ByteBuffer
            MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
            //使用UTF-8来创建解码器
            Charset charset = Charset.forName("UTF-8");
            //直接将buffer里的数据全部输出
            outChannel.write(buffer);
            //再次调用buffer的clear()方法，复原limit.position的位置
            buffer.clear();
            //创建解码器(CharsetDecode)对象
            CharsetDecoder decoder = charset.newDecoder();
            //使用解码器将ByteBuffer转换成CharBuffer
            CharBuffer charBuffer = decoder.decode(buffer);
            //CharBuffer的toString方法可以获取对应的字符串
            System.out.println(charBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
