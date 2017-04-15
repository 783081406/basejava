package com.ccjjltx.io.randomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by ccjjltx on 2017/4/15.
 *
 * @author ccj
 * @version 1.0
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (
                RandomAccessFile raf = new RandomAccessFile("src/main/java/com/ccjjltx/io/randomaccessfile/RandomAccessFileTest.java", "r")) {
            //获取RandomAccessFile对象文件指针的位置，初始位置是0
            System.out.println("RandomAccessFile");
            //移动raf的文件记录指针的位置
            raf.seek(300);//从try(里的RandomAccessFile开始读取
            byte[] bbuf = new byte[1024];
            //用于保存实际读取的字节数
            int hasRead = 0;
            //使用循环来重复"取水"过程
            while ((hasRead = raf.read(bbuf)) > 0) {
                //取出"竹筒"中的水滴(字节),将字节数组转换成为字符串输入
                System.out.print(new String(bbuf, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
