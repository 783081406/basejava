package com.ccjjltx.io.convertflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ccjjltx on 2017/4/14.
 * 字节流转换成字符流（节点流）
 * 把节点流转换成包装流
 * BufferedReader具有一个readLine()方法，可以非常方便地一次读取一行内容，所以经常把读取文本内容的输入流包装成BufferedReader,
 * 用于方便地读取输入流的文本内容
 *
 * @author ccj
 * @version 1.0
 */
public class InputStreamReaderTest {
    public static void main(String[] args) {
        try (
                //将System.in(InputStream)对象转换成Reader对象(节点流)
                InputStreamReader reader = new InputStreamReader(System.in);
                //将普通的Reader包装成BufferedReader(转换流)
                BufferedReader br = new BufferedReader(reader)) {
            String line = null;
            //采用循环方式来逐行地读取
            while ((line = br.readLine()) != null) {
                //如果读取的字符串为"exit",这程序退出
                if (line.equals("exit")) {
                    System.exit(1);
                }
                //打印读取的内容
                System.out.println("输入的内容为:" + line);
            }
        } catch (IOException e) {
            System.out.println(e.getCause());
        }
    }
}
