package com.ccjjltx.io.objectstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by ccjjltx on 2017/4/15.
 *
 * @author ccj
 * @version 1.0
 */
public class ReadObject {
    public static void main(String[] args) {
        try (
                //创建一个ObjectInputStream输入流
                ObjectInputStream objectInputStream = new ObjectInputStream(
                        new FileInputStream("src/main/java/com/ccjjltx/io/objectstream/object.txt"))) {
            //从输入流中读取一个Java对象，并将其强制类型转换为Person类
            Person p = (Person) objectInputStream.readObject();
            System.out.println("名字为:" + p.getName() + "\n年龄为:" + p.getAge());
            /*
            名字为:孙悟空
            年龄为:500
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
