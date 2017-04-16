package com.ccjjltx.io.ioexternalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by ccjjltx on 2017/4/16.
 * 当使用Externalizable机制返序列化对象时，程序回先使用public的无参数构造器创建实例，然后才执行readExternal()方法进行反序列化，
 * 因此实现Externalizable的序列化类必须提供的public的无参数构造器
 *
 * @author ccj
 * @version 1.0
 */
public class Person implements Externalizable {
    private String name;
    private int age;

    //必须提供无参数的构造器，否则反序列化时会失败
    public Person() {
    }

    public Person(String name, int age) {
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //将name实例变量反转后写入二进制流
        out.writeObject(new StringBuffer(name).reverse());
        out.write(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = ((StringBuffer) in.readObject()).reverse().toString();
        this.age = (int) in.readObject();
    }
}
