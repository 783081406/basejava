package com.ccjjltx.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ccj on 2017/2/13.
 *
 * @author ccj
 * @version 1.0-SHAPSHOT
 */
public class ScannerKeyBoardTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("以next方法接收:");
        //默认是以空白(包括空格、Tab空白、回车)作为多个输入选项之间的分隔符
        if (sc.hasNext()) {
            System.out.println("接收到的数据为:" + sc.next());
        }
        /////////////////////////////////////
        Scanner sc2 = new Scanner(System.in);
        System.out.println("以nextLine方法接收:");
        if (sc2.hasNextLine()) {
            System.out.println("接收到的数据为:" + sc2.nextLine());
        }
        /////////////////////////////////////
        Scanner sc3 = new Scanner(System.in);
        System.out.println("以nextLong方法接收:");
        if (sc3.hasNextLong()) {
            System.out.println("键盘输入的内容是:" + sc3.nextLong());
        }
        /////////////////////////////////////
        try {
            Scanner sc4 = new Scanner(new File("src\\main\\java\\com\\ccjjltx\\App.java"));
            System.out.println("ScannerKeyBoardTest.java文件内容如下:");
            while (sc.hasNextLine()) {
                System.out.println(sc4.nextLine());
            }
        } catch (FileNotFoundException f) {
            System.out.println("文件没有发现");
        }
        ////////////////////////////////////
        Scanner sc5 = new Scanner("12 23 as as,qw qw,qw");
        sc5.useDelimiter("|,|\\.");
        while (sc5.hasNext()) {
            System.out.println("内容为:" + sc5.next());
        }
        /*
        next()和nextLine()
        next():
        1.一定要读取到有效字符后才能结束输入
        2.对输入有效字符之前遇到的空白，next（）方法会自动将其去掉
        3.只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符
        next()不能得到带有空格的字符串

        nextLine():
        1.以Enter为结束符，也就是说nextLine()方法返回的是输入回车之前的所有字符
        2.可以获得空白

         */
    }
}
