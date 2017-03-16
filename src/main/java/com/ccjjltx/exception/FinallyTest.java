package com.ccjjltx.exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by ccjjltx on 2017/3/16.
 * @author ccj
 * @version 1.0
 */
public class FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("a.txt");
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
            return ;
            //如果使用exit退出虚拟机，算真的立马退出，不会执行finally代码
            //System.exit(1);
        }finally {
            if(fis!=null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            System.out.println("执行垃圾回收!");
        }
        /*
        a.txt (系统找不到指定的文件。)
        执行垃圾回收!
         */
        //说明如果使用return;系统还是会想执行finally快里面的代码
    }
}
