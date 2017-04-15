package com.ccjjltx.io.iotransient;

import java.io.*;

/**
 * Created by ccjjltx on 2017/4/15.
 *
 * @author ccj
 * @version 1.0
 */
public class TransientTest {
    public static void main(String[] args) {
        try (
                //创建一个ObjectOutputStream输出流
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                        new FileOutputStream("src/main/java/com/ccjjltx/io/iotransient/transient.txt"));
                //创建一个ObjectOutputStream输入流
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(
                        "src/main/java/com/ccjjltx/io/iotransient/transient.txt"))) {
            Person person1 = new Person("ccj", 22);
            objectOutputStream.writeObject(person1);
            Person person2 = (Person) objectInputStream.readObject();
            System.out.println(person2.getName());
            System.out.println(person2.getAge());
            /*
            有参数的构造器
            ccj
            0
             */
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
