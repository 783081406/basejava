package com.ccjjltx.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by ccjjltx on 2017/3/16.
 * @author ccj
 * @version 1.0
 */
public class AccessExceptionMsg {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            /*
            a.txt (系统找不到指定的文件。)
            at java.io.FileInputStream.open0(Native Method)
            at java.io.FileInputStream.open(FileInputStream.java:195)
             */
            System.out.println(e.getMessage());
            System.out.println("========================");
            /*
            at java.io.FileInputStream.<init>(FileInputStream.java:138)
            at java.io.FileInputStream.<init>(FileInputStream.java:93)
            at com.ccjjltx.exception.AccessExceptionMsg.main(AccessExceptionMsg.java:14)
            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
            at java.lang.reflect.Method.invoke(Method.java:498)
            at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
             */
            e.printStackTrace();
        }
    }
}
