package com.ccjjltx.io.file;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by ccjjltx on 2017/4/13.
 *
 * @author ccj
 * @version 1.0
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        try (
                //创建字节输入流
                FileInputStream fileInputStream = new FileInputStream("src/main/java/com/ccjjltx/App.java");
        ) {
            //创建一个长度为1024的"竹筒"
            byte[] bbuf = new byte[1024];
            //用于保存实际读取的字节数
            int hasRead = 0;
            //使用循环来重复"取水"过程
            while ((hasRead = fileInputStream.read(bbuf)) > 0) {
                //取出"竹筒"中的水滴(字节),将字节数组转换成字符串输入
                System.out.println(new String(bbuf, 0, hasRead));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        /*
        如果采用GBK编码方式，在这种方式下，每个中文字符占2字节，如果read()方法读取时只读取到单个中文字符，将导致乱码
         */
    }
}
