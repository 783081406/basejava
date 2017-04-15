/**
 * Created by ccjjltx on 2017/4/15.
 * 序列化两个步骤：
 * 1.创建一个ObjectOutputStream，这个输出流是一个处理流（包装流），所以必须建立在其他节点流的基础之上
 * 2.调用ObjectOutputStream对象writeObject()方法输出可序列化对象
 * <p>
 * 反序列化两个步骤：
 * 1.创建一个ObjectOutputStream输入流，这个流是一个处理流（包装流），所以必须建立在其他节点流的基础之上
 * 2.调用ObjectOutputStream对象readObject()方法输出可序列化对象,该方法返回一个Object类型的Java对象，如果程序知道该Java对象类型，
 * 则可以将该对象强制类型转换成其真实的类型
 * <p>
 * 注意：
 * 1.反序列读取的仅仅是Java对象的数据，而不是Java类，因此采用反序列恢复Java对象时，必须提供该Java对象所属类的class文件
 * 否则将会引发ClassNotFoundException异常
 * 2.反序列化机制无需通过构造器来初始化Havana对象
 * 3.如果使用序列化机制向文件中写入多个Java对象，使用反序列化机制回复对象时必须按照实际写入的顺序读取。
 * 4.当一个序列化类有多个父类时（包括直接父类和间接父类），这些父类要么有无参数的构造器，要么也是可序列化的——否则反序列化时将
 * 抛出InvalidClassException异常。如果父类是不可序列化的，只是带有无参数的构造器，则该父类中定义的成员变量值不会序列化到二进制流中
 * 5.如果某个类的成员变量的类型不是基本类型或String类型，而是另一个引用类型，那么这个引用类型必须是可序列化的，否则拥有该类型成员
 * 变量的类也是不可序列化的
 *
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.objectstream;