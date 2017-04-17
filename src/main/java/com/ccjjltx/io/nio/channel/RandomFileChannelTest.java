package com.ccjjltx.io.nio.channel;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by ccjjltx on 2017/4/17.
 *
 * @author ccj
 * @version 1.0
 */
public class RandomFileChannelTest {
    public static void main(String[] args) throws IOException {
        File f = new File("src/main/java/com/ccjjltx/io/nio/channel/a.txt");
        try (
                //创建一个RandomAccessFile对象
                RandomAccessFile randomAccessFile = new RandomAccessFile(f, "rw");
                //获取RandomAccessFile对应的Channel
                FileChannel randomChannel = randomAccessFile.getChannel()) {
            //将Channel中所有数据映射成ByteBuffer
            ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
            //把Channel的记录指针移动到最后
            randomChannel.position(f.length());
            //将buffer中的所有数据输出
            randomChannel.write(buffer);
            //每运行一个就会把a.txt文件的内容复制一份，并把全部内容追加到该文件的后面
        }
    }
}
