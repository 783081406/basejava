package com.ccjjltx.io.nio2.filevisitor;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by ccjjltx on 2017/4/19.
 *
 * @author ccj
 * @version 1.0
 */
public class FileVisitorTest {
    public static void main(String[] args) throws Exception {
        //遍历.目录下的所有文件和子目录
        Files.walkFileTree(Paths.get("."), new SimpleFileVisitor<Path>() {
            //开始访问目录时触发该方法
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("正在访问:" + dir + "路径");
                return FileVisitResult.CONTINUE;
            }

            //访问文件时出发该方法
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("正在访问" + file + "文件");
                //找到了FileVisitorTest.java文件
                if (file.endsWith("FileVisitorTest.java")) {
                    System.out.println("--已经找到目标文件--");
                    return FileVisitResult.TERMINATE;
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }
}