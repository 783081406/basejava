/**
 * Created by ccjjltx on 2017/3/12.
 * Properties是Hashtable的子类
 * Properties类可以把Map对象和属性文件关联起来，从而可以把Map对象中的key-value对写入属性文件中的"属性名=属性值"加载到Map对象中。
 * 由于属性文件里面的属性名字、属性值只能字符串类型，所以Properties里面的key、value都是字符串类型。
 * 提供三个方法修改Properties里的key、value的值
 * Properties相当于是一个key、value都是String的Map
 * String getProperty(String key):获取Properties中指定属性名对应的属性值，类似于Map的get(Object key)
 * String getProperty(String key,String defaultValue):该方法与前一个方法基本相似。该方法多一个功能，如果Properties中不存在
 * 指定的key时，则该方法指定默认值
 * Object setProperty(String key,String value):设置属性值，类似于Hashtable的put()方法
 * 还提供了两个读写属性文件的方法：
 * void load(InputStream inStream):从属性文件（以输入流表示）中加载key-value对，把加载到的key-value对追加到Properties里(Properties
 * 是Hashtable的子类，它不保证key-value对之间的次序
 * void store(OutputStream out,String comments):将Properties中的key-value对输出到指定的属性文件(以输出流表示)中
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.properties;