package com.ccjjltx.io.process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ccjjltx on 2017/4/15.
 *
 * @author ccj
 * @version 1.0
 */
public class ReadFromProcess {
    public static void main(String[] args) throws IOException {
        //运行javac命令，返回运行该命令的子进程
        Process p = Runtime.getRuntime().exec("javac");
        try (
                //以p进程的错误流创建BufferedReader对象
                //这个错误流对本程序是输入流，对p进程则是输出流
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        ) {
            String buff = null;
            while ((buff = bufferedReader.readLine()) != null) {
                System.out.println(new String(buff.getBytes("UTF-8")));
            }
        }
    }
}
