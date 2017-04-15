package com.ccjjltx.io.iotransient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by ccjjltx on 2017/4/15.
 * 提供了writeObject()和readObject()两个方法，其中writeObject()方法在保存Person对象时将其那么实例变量包装成StringBuffer,并将
 * 其字符串反转后写入；在readObject()方法中处理name的策略与此对应——先将读取的数据强制类型转换成StringBuffer，再将其反转后赋给
 * name实例变量
 *
 * @author ccj
 * @version 1.0
 */
public class Person1 implements java.io.Serializable {
    private String name;
    private int age;

    public Person1(String name, int age) {
        System.out.println("有参数的构造器");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        //将name实例变量反转后写入二进制流
        out.writeObject(new StringBuffer(name).reverse());
        out.write(age);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        //将读取的字符串反转后赋给name实例变量
        this.name = ((StringBuffer) in.readObject()).reverse().toString();
        this.age = (int) in.readObject();
    }
}
