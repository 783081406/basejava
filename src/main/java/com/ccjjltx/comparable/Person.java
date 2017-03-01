package com.ccjjltx.comparable;

/**
 * Created by ccjjltx on 2017/3/1.
 *
 * @author ccj
 * @version 1.0
 */
public class Person implements Comparable<Person> {
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 比较两个Person是否相等，若他们的name,age都相等，则他们相等
     *
     * @param person 比较的Person对象
     * @return 比较结果
     */
    public boolean equals(Person person) {
        if (this == person)
            return true;
        if (person != null) {
            return (this.name.equals(person.name)) && (this.age == this.age);
        }
        return false;
    }

    /**
     * 实现 “Comparable<String>” 的接口，即重写compareTo<T t>函数
     *
     * @param o 比较的Person对象
     * @return 结果，整数，负数，0
     */
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
