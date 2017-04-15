package com.ccjjltx.io.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by ccjjltx on 2017/4/15.
 * 在末尾追加指定内容
 *
 * @author ccj
 * @version 1.0
 */
public class AppendContent {
    public static void main(String[] args) {
        try (//以读写方式打开一个RandomAccessFile对象)
             RandomAccessFile raf = new RandomAccessFile("src/main/java/com/ccjjltx/io/randomaccessfile/out.txt", "rw")) {
            //将记录指针移动到out.txt文件的最后
            raf.seek(raf.length());
            raf.write("追加的内容!\r\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
