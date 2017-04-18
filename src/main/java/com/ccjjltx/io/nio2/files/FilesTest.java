package com.ccjjltx.io.nio2.files;

import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ccjjltx on 2017/4/18.
 *
 * @author ccj
 * @version 1.0
 */
public class FilesTest {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/com/ccjjltx/App.java");
        //复制文件
        Files.copy(path, new FileOutputStream("src/main/java/com/ccjjltx/io/nio2/files/a.txt"));
        //判断FilesTest.java文件是否为隐藏文件
        System.out.println("App.java是否为隐藏文件" + Files.isHidden(path));
        //一次性读取FilesTest.java文件所在行
        List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
        System.out.println(lines);
        //判断指定文件的大小
        System.out.println("大小为:" + Files.size(path));
        List<String> poem = new ArrayList<>();
        poem.add("12345");
        poem.add("678910");
        //直接将多个字符串内容写入指定文件中
        Files.write(Paths.get("src/main/java/com/ccjjltx/io/nio2/files/b.txt"), poem, Charset.forName("UTF-8"));
        //使用Java8新增的Stream  API列出当前目录下所有文件和子目录
        Files.list(Paths.get(".")).forEach(line -> System.out.println(line));
        //使用Java8新增的Stream API读取文件内容
        Files.lines(path, Charset.forName("UTF-8")).forEach(line -> System.out.println(line));
        FileStore cStore = Files.getFileStore(Paths.get("c:"));
        //判断c盘的总空间、可用空间
        System.out.println("C:共有空间:" + cStore.getTotalSpace());
        System.out.println("C:可用空间:" + cStore.getUsableSpace());
    }
}
