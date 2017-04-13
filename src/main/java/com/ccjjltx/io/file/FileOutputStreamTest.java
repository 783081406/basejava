package com.ccjjltx.io.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ccjjltx on 2017/4/13.
 *
 * @author ccj
 * @version 1.0
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        try (
                //创建字节输入流
                FileInputStream fileInputStream = new FileInputStream("src/main/java/com/ccjjltx/App.java");
                //创建字节输出流
                FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/com/ccjjltx/io/file/FileOutputStreamTest.txt");
        ) {
            byte[] bbuf = new byte[32];
            int hasRead = 0;
            //循环从输入流中取出数据
            while ((hasRead = fileInputStream.read(bbuf)) > 0) {
                //每读取一次，即写入文件输出流，读了多少，就写多少
                fileOutputStream.write(bbuf, 0, hasRead);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
