package com.ccjjltx.io.system;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ccjjltx on 2017/4/14.
 *
 * @author ccj
 * @version 1.0
 */
public class RedirctOut {
    public static void main(String[] args) {
        try (
                //一次性创建PrintStream输出流
                PrintStream ps = new PrintStream(new FileOutputStream("src/main/java/com/ccjjltx/io/system/out.txt"))) {
            //将标准输出重定向到ps输出流
            System.setOut(ps);
            //向标准输出输出一个字符串
            System.out.println("普通字符串");
            //向标准输出输出一个对象
            System.out.println(new RedirctOut());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
