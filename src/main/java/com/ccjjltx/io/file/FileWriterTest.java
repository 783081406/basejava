package com.ccjjltx.io.file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ccjjltx on 2017/4/13.
 *
 * @author ccj
 * @version 1.0
 */
public class FileWriterTest {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("src/main/java/com/ccjjltx/io/file/FileWriterTest.txt")) {
            fileWriter.write("只要还有明天\r\n");
            fileWriter.write("今天就永远是起跑线\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
