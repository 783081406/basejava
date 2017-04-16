/**
 * Created by ccjjltx on 2017/4/16.
 * 另一种序列化机制  Externalizable接口
 * 定义两个方法：
 * void readExternal(ObjectInput in):需要序列化的类实现readExternal()方法来实现序列化。该方法调用DataInput(它是ObjectInput的父接口）
 * 的方法来恢复基本类型的实例变量值，调用ObjectInput的readObject()方法来恢复引用类型的实例变量值。
 * void writeExternal(ObjectOutput out):需要序列化的类实现writeExternal()方法来保存对象的状态。该方法调用DataOutput(它是ObjectOutput的
 * 父接口）的方法来保存基本类型的实例变量值，调用ObjectOutput的writeObject()方法来保存引用类型的实例变量值
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.ioexternalizable;