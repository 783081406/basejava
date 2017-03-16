package com.ccjjltx.exception;

import java.io.*;

/**
 * Created by ccjjltx on 2017/3/16.
 * Java7开始允许在try关键字后紧跟一对圆括号，圆括号可以声明、初始化一个或多个资源，此处的资源指的是那些必须在程序结束时
 * 显式关闭的资源（比如数据库连接、网络连接等），try语句在该语句结束时自动关闭这些资源
 * 这些资源的实现类必须实现AutoCloseable或Closeable接口，实现着两个接口就必须实现close（）方法
 * Closeable是AutoCloseable的子接口，可以被自动关闭的资源类要么实现AutoCloseable接口，要么实现Closeable接口。Closeable接口
 * 里的close()方法声明抛出了IOException，因此他的实现类在实现close方法时只能声明抛出IOException或其子类。
 * AutoCloseable接口里的close()方法声明抛出了Exception，因此它的实现类在实现close()方法时可以申明抛出任何异常
 *
 * @author ccj
 * @version 1.0
 */
public class AutoCloseTest {
    public static void main(String[] args) {
        try (
                //声明、初始化两个可关闭的资源
                //try语句会自动关闭这两个资源
                BufferedReader br = new BufferedReader(new FileReader("./src/main/java/com/ccjjltx/App.java"));
                PrintStream ps = new PrintStream(new FileOutputStream("./src/main/java/com/ccjjltx/App.java"))) {
            //使用资源
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
