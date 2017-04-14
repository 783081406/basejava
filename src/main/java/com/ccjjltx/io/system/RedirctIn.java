package com.ccjjltx.io.system;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ccjjltx on 2017/4/14.
 *
 * @author ccj
 * @version 1.0
 */
public class RedirctIn {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("src/main/java/com/ccjjltx/io/system/RedirctOut.java")) {
            //将标准输入重定向到fis输入流
            System.setIn(fis);
            //使用System.in创建Scanner对象，用于获取标准输入
            Scanner sc = new Scanner(System.in);
            //只把回车作为分隔符
            sc.useDelimiter("\n");
            //判断是否还有下一个输入项
            while (sc.hasNext()) {
                //输出输入项
                System.out.println("键盘输入的内容是:" + sc.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
