/**
 * Created by ccjjltx on 2017/3/21.
 * 枚举类和普通类的简单区别：
 * 1.枚举类可以实现一个或多个接口，使用enum定义的枚举默认集成java.lang.Enum类，而不是Object类，因此枚举类不能显式继承其他父类。其中java.lang.Enum类实现了java.lang.Serializable和java.lang.Comparable两个接口
 * 2.使用enum定义、非抽象的枚举类默认会使用final修饰，因此枚举类不能派生子类
 * 3.枚举类的狗在其只能使用private访问控制符，如果忽略了构造器的访问控制符，则默认使用private修饰；如果强制指定访问控制符，则只能指定private修饰符
 * 4.枚举类的所有实例必须在枚举类的第一行显式列出，否则这个枚举类永远都不能产生实例，列出这些实例时，系统会自动添加public static final修饰，无需程序员显式添加。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.objectoriented.renum;