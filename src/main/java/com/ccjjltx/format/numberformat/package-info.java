/**
 * Created by ccjjltx on 2017/4/8.
 * 抽象类Format两个子类，NumberFormat和DateFormat，分别实现数值、日期和格式化。
 * NumberFormat也是一个抽象基类，所以无法通过它的构造器来创建NumberFormat也是一个抽象基类，得到NumberFormat对象
 * getCurrencyInstance():返回默认Locale的货币格式器。也可以在调用该方法时传入指定的Locale，则获取指定Locale的货币格式器。
 * 如：getCurrencyInstance(Locale inLocale):
 * getIntegerInstance():返回默认Locale的整数格式器。也可以在调用该方法时传入指定的Locale，则获取指定Locale的整数格式器。
 * getNumberInstance():返回默认Locale的通用数值格式器。也可以在调用该方法时传入指定的Locale，则获取指定Locale的通用数值格式器。
 * getPercentInstance():返回默认Locale的百分数格式器。也可以在调用该方法时传入指定的Locale，则获取指定Locale的百分比格式器
 * format():将double和long转换成String，StringBuffer
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.format.numberformat;