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
            System.out.print("键盘输入的内容是:" + sc3.nextLong());
        }
        /////////////////////////////////////
        try{
            Scanner sc4=new Scanner(new File(".\\main\\java\\com\\ccjjltx\\scanner\\ScannerKeyBoardTest.java"));
            System.out.println("ScannerKeyBoardTest.java文件内容如下:");
            while(sc.hasNextLine()){
                System.out.println(sc4.nextLine());
            }
        }catch(FileNotFoundException f){
            System.out.println("文件没有发现");
        }
        ////////////////////////////////////
        Scanner sc5=new Scanner("12 23 as as,qw qw,qw");
        sc5.useDelimiter("|,|\\.");
        while(sc5.hasNext()){
            System.out.println("内容为:"+sc5.next());
        }
    }
}
