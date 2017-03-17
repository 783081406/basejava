/**
 * Created by ccjjltx on 2017/3/17.
 * 用户自定义异常都应该继承Exception基类，如果希望自定义Runtime异常，则应该继承RuntimeException基类。
 * 定义异常类时通常需要提供两个构造器：
 * 一个是无参数的构造器，另一个是带一个字符串参数的构造器
 * 这个字符串将作为该异常对象的描述信息（也就是一场对象的getMessage()方法的返回值
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.exception.custom;