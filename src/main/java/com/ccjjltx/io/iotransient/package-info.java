/**
 * Created by ccjjltx on 2017/4/15.
 * 不想被递归序列化，使用自定义序列化（关键字transient）
 * <p>
 * 使用transient关键字修饰实例变量虽然简单、方便，但被transient修饰的实例变量将被完全隔离在序列化之外，这样导致在反序列化恢复Java对象时无法取得该实例变量值。在序列化和反序列过程中需要特殊处理的类应该提供如下特殊签名的方法，这些特殊签名的方法用以实现自定义序列化
 * private  void  writeObject(java.io.ObjectOutputStream  out)  thorws   IOException
 * private  void  readObject(java.io.ObjecInputStream  in)  throws   IOException,ClassNotFoundException
 * private  void  readObjectNoData()  throws  ObjectStreamException
 * <p>
 * writeObject()方法负责写入特定类的实例状态，以便相应的readObject()可以恢复它。通过重写该方法，程序员可以完全获得对序列化机制的控制，可以完全自主决定哪些
 * 实例变量需要实例化，需要怎样序列化。默认情况下，该方法会调用out.defaultWriteObject来保存Java对象的各种实例变量，从而可以实现序列化Java对象状态的目的
 * <p>
 * readObject()方法负责从流中读取并恢复对象实例变量，通过重写该方法，程序员可以完全获得对象反序列化机制的控制，可以自主决定需要反序列化那些实例变量，
 * 以及如何进行反序列化。在默认情况下，该方法会调用in.defaultReadObject来恢复Java对象的非瞬态实例变量。在通常情况下，readObject()方法与writeObject()方法对应，
 * 如果writeObject()方法中对Java对象的实例变量进行了一些处理，则应该在readObject()方法中对其实例变量进行相应的反处理，以便正确回复该对象
 * <p>
 * 当序列化流不完整时，readObjectNoData()方法可以用来正确地初始化反序列的对象。例如，接收方使用的反序列化类的版本不同于发送方，或者接收方版本扩展的类不同发送方版本扩展的类，
 * 或者序列化流被篡改时，系统都会调用readObjectNoData()方法来初始化反序列的对象
 * <p>
 * 还有一种更加彻底的自定义机制，它甚至可以在序列化对象时将该对象替换成其他对象。如果需要实现序列化某个对象时替换该对象，则应为序列化类提供特殊方法：
 * ANY-ACCESS-MODIFIER     Object   writeReplace()   throws    ObjectStreamException;
 * 此writeReplace()方法将由序列化机制调用，只要该方法存在。因为该方法可以拥有是有(private)、受保护的(protected)和包是有(package-private)等访问权限，所以在其子类有可能获得该方法.
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.iotransient;