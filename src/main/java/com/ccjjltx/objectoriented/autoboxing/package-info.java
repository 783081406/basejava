/**
 * Created by ccjjltx on 2017/3/10.
 * java8再次增强了包装类的功能，其中一个重要的增强就是支持无符号算数运算。Java8为整型包装类增加了支持无符号运算的方法
 * static String toUnsignedString(int/long i):该方法将指定int或long型整数转换为无符号整数对应的字符串
 * static String toUnsignedString(int i/long,int radix):将方法将指定int或long型整数转换为指定进制的无符号整数对应的字符串
 * static xxx parseUnsignedXxx(String s):该方法将指定字符串解析成无符号整数。当调用类为Integer时，xxx代表int;但调用类为Long时，xxx代表long
 * static xxx parseUnsignedXxx(String s,int radix):该方法将指定字符串按指定进制解析成无符号整数。
 * static int compareUnsigned(xxx x,xxx y):该方法将x、y两个整数转换成无符号整数后比较大小。
 * static long divideUnsigned(long dividend,long divisor):该方法将x、y两个整数转换为无符号整数后计算它们相除的商。
 * static long remainderUnsigned(long dividend,long divisor):该方法将x、y两个整数转换为无符号整数后计算他们相除的余数。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.objectoriented.autoboxing;