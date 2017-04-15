package com.ccjjltx.io.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by ccjjltx on 2017/4/15.
 *
 * @author ccj
 * @version 1.0
 */
public class WriteObject {
    public static void main(String[] args) {
        try (
                //创建一个ObjectOutputStream输出流
                //序列化对象第一步
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/java/com/ccjjltx/io/objectstream/object.txt"))) {
            Person person = new Person("孙悟空", 500);
            //将per对象写入输出流
            //序列化对象第二步
            objectOutputStream.writeObject(person);
            //生成的Object.txt文件，该文件的内容是Person对象。
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
