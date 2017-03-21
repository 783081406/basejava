/**
 * Created by ccjjltx on 2017/3/21.
 * 枚举类和普通类的简单区别：
 * 1.枚举类可以实现一个或多个接口，使用enum定义的枚举默认集成java.lang.Enum类，而不是Object类，因此枚举类不能显式继承其他父类。
 * 其中java.lang.Enum类实现了java.lang.Serializable和java.lang.Comparable两个接口
 * 2.使用enum定义、非抽象的枚举类默认会使用final修饰，因此枚举类不能派生子类
 * 3.枚举类的狗在其只能使用private访问控制符，如果忽略了构造器的访问控制符，则默认使用private修饰；如果强制指定访问控制符，
 * 则只能指定private修饰符
 * 4.枚举类的所有实例必须在枚举类的第一行显式列出，否则这个枚举类永远都不能产生实例，列出这些实例时，系统会自动添加public static final修饰，
 * 无需程序员显式添加。
 * <p>
 * java.lang.Enum类中包含的方法。
 * protected Object clone();
 * int compareTo(E o):如果该枚举对象位于指定枚举对象之后，则返回正整数
 * boolean equals(Object other):
 * protected void finalize():
 * Class<E> getDeclaringClass():返回此枚举常量的枚举类型对应的类对象。
 * int hashCode():
 * String name():返回此枚举实例的名称，这个名称就是定义枚举类所列出的所有枚举值之一。与此方法相比，优先考虑使用toString()方法，
 * 因此toString()方法返回更加友好的名称
 * int ordinal():返回枚举值在枚举类中的索引值(就是枚举值在枚举声明中的位置,第一个枚举值的索引值为0);
 * String toString():返回枚举值常量的名称
 * static<T extends Enum<T>> T valueOf(Class<T> enumType,String name):用于返回指定枚举类中指定名称的枚举值.名称必须与在该枚举值
 * 中声明枚举值时所用的标识符完全匹配,不允许使用额外的空白字符.
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.objectoriented.renum;