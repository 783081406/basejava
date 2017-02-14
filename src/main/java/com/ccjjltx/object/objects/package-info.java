/**
 * Created by ccj on 2017/2/14.
 * 提供了一些方法来操作对象，这个工具方法大多是"空指针"安全的
 * 比如当不确定一个应用变量是否是null,如果贸然地调用该变量的toString()方法，则会引发NullPointerException异常
 * 但是如果使用Objects类提供的toString(Object o)方法，就不会引发空指针异常，当o为null时，程序将返回一个"null"字符串
 *
 * Java为工具类的命名习惯是添加一个字符S,比如操作数组的工具类是Arrays,操作集合的工具类是Collections
 *
 * @author ccj
 * @version 1.o
 */
package com.ccjjltx.object.objects;