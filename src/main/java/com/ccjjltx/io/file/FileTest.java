package com.ccjjltx.io.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by ccjjltx on 2017/4/13.
 *
 * @author ccj
 * @version 1.0
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        //以当前路径来创建一个File对象
        File file = new File(".");
        //直接过去文件名，输出一个点
        System.out.println(file.getName());
        //获取相对路径的父路径可能出错，下面代码输出null
        System.out.println(file.getParent());
        //获取绝对路径//E:\code\ideaCode\basejava\basejava\.
        System.out.println(file.getAbsoluteFile());
        //获取上一级路径//E:\code\ideaCode\basejava\basejava
        System.out.println(file.getAbsoluteFile().getParent());
        //在当前路径下创建一个临时文件
        File tmpFile = File.createTempFile("aaa", ".txt", file);
        //指定但JVM退出时删除该文件
        tmpFile.deleteOnExit();
        //以系统当前时间作为新文件名来创建新文件
        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile对象是否存在:" + newFile.exists());//newFile对象是否存在:false
        //以指定newFile对象来创建一个文件
        newFile.createNewFile();
        //以newFile对象来创建一个目录，因为newFile已经存在
        //所以下面方法返回false，即无法创建该目录
        newFile.mkdir();
        //使用list()方法列出当前路径下的所有文件和路径
        String[] fileList = file.list();
        System.out.println("===当前路径下所有文件和路径如下===");
        for (String fileName : fileList) {
            System.out.println(fileName);
        }
        /*
        ===当前路径下所有文件和路径如下===
        .git
        .idea
        1492082745427
        aaa3452568016240237555.txt
        basejava.iml
        pom.xml
        src
        target
         */
        //listRoots()静态方法列出所有的硬盘根路径
        File[] roots = File.listRoots();
        System.out.println("===系统所有根路径如下===");
        for (File root : roots) {
            System.out.println(root);
        }
        /*
        C:\
        D:\
        E:\
        F:\
        G:\
         */
    }
}
