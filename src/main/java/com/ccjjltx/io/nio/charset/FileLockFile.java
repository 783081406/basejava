package com.ccjjltx.io.nio.charset;

import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * Created by ccjjltx on 2017/4/18.
 *
 * @author ccj
 * @version 1.0
 */
public class FileLockFile {
    public static void main(String[] args) throws Exception {
        try (
                //使用FileOutputStream获取FileChannel
                FileChannel channel = new FileOutputStream("src/main/java/com/ccjjltx/io/nio/channel/a.txt").getChannel();
        ) {
            //使用非阻塞方式对指定文件加锁
            FileLock lock = channel.tryLock();
            //程序暂停10s
            Thread.sleep(10000);
            //释放锁
            lock.release();
        }
    }
}
