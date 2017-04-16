package com.ccjjltx.io.iotransient;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by ccjjltx on 2017/4/16.
 *
 * @author ccj
 * @version 1.0
 */
public class Person2Test {
    public static void main(String[] args) {
        try (
                //创建一个ObjectOutputStream输出流
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                        new FileOutputStream("src/main/java/com/ccjjltx/io/iotransient/transient.txt"));
                //创建一个ObjectOutputStream输入流
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(
                        "src/main/java/com/ccjjltx/io/iotransient/transient.txt"))) {
            Person2 person2 = new Person2("ccj", 22);
            //系统将per对象转换成字节序列并输出
            objectOutputStream.writeObject(person2);
            //反序列化读取得到的ArrayList
            ArrayList list = (ArrayList) objectInputStream.readObject();
            System.out.println(list);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
