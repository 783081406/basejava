/**
 * Created by ccjjltx on 2017/3/19.
 * 反射
 * 几个重点的类：
 * Class<?>
 * Constructor<?>
 * Method
 * Field
 * 用法:
 * 反射中最常规的获取对象实例：
 * Class c=Class.forName("className");
 * Object obj=c.newInstance();//创建对象的实例
 * <p>
 * 获取构造器的方法：
 * Constructor getConstructor(Class[] params);根据指定参数获得public构造器
 * Constructor[] getConstructors();获得public的所有构造器
 * Constructor getDeclaredConstructor(Class[] params):根据指定参数获得public和非public的构造器
 * Constructor[] getDeclaredConstructors();获得public和非public的所有构造器
 * <p>
 * 获得类里的方法
 * Method getMethod(String name,Class[] params):根据方法名，参数类型获得方法
 * Method[] getMethods():获得所有public方法
 * Method getDeclaredMethod(String name,Class[] params):根据方法名和参数类型，获得public和非public的方法
 * Method[] getDeclaredMethods():获得所有的public和非public方法
 * <p>
 * 获得类中属性的方法
 * Field getField(String name):根据变量名得到相应的pubic变量
 * Field[] getFields():获得类中所有public的方法
 * Field getDeclaredField(String name):根据方法名获得public和非public变量
 * Field[] getDeclaredFields():获得类中所有的public和非public方法
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.reflect;