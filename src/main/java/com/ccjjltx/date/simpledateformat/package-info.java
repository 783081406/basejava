/**
 * Created by ccjjltx on 2017/3/9.
 * SimpleDateFormat是一个格式化Date以及解析日期字符串的工具。它的最常用途是，能够按照指定的格式来对Date进行格式化，然后
 * 我们可使用格式化Date后得到的字符串
 * 更严格的说，SimpleDateFormat是一个与语言环境相关的方式来格式化和解析日期的具体类。它允许进行格式化（日期->文本）、
 * 解析（文本->日期）和规范化
 * G 年代标识符
 * y 年
 * M 月
 * d 日
 * h 时 在上午或下午（1~12）
 * H 时 在一天中（0~23）
 * m 分
 * s 秒
 * S 毫秒
 * E 星期
 * D 一年中的第几天
 * F 一月中第几个星期天
 * w 一年中第几个星期
 * W 一月中第几个星期
 * a 上午/下午 标记符
 * k 时 在一天中（1~24）
 * K 时 在上午或下午（0~11）
 * z 时区
 *
 * 构造函数：
 * SimpleDateFormat():
 * SimpleDateFormat(String pattern):
 * SimpleDateFormat(String pattern,DateFormatSymbols formatSymbols):
 * SimpleDateFormat(String pattern,Locale locale):
 *
 * 函数：
 * void applyLocalizedPattern(String pattern):将给定的本地化模式字符串应用到该日期格式
 * void applyPattern(String pattern):将给定的模式字符串应用到该日期格式
 * Object clone():
 * boolean equals(Object obj):
 * StringBuffer format(Date date,StringBuffer toAppendTo,FieldPosition pos);给定的日期格式为日期/时间线和附加的结果给StringBuffer
 * AttributedCharacterIterator formatToCharacterIterator(Object obj):格式对象产生一个AttributedCharacterIterator
 * Date get2DigitYearStart():
 * DateFormatSymbols getDateFormatSymbols():
 * int hashCode():
 * Date parse(String txt,ParsePosition pos):
 * void set2DigitYearStart(Date StartDate)
 * void setDateFormatSymbols(DateFormatSymbols newFormatSymbols)
 * String toLocalizedPattern():
 * String toPattern():
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.simpledateformat;