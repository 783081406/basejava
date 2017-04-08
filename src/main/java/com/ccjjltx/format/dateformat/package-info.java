/**
 * Created by ccjjltx on 2017/3/8.
 * FULL,LONG,MEDIUM,SHORT
 * DateFormat是抽象方法，用内置的实例化方法一般返回SimpleDateFormat：
 * getInstance():
 * getDateInstance():
 * getDateInstance(int style):
 * getDateInstance(int style, Locale aLocale):
 * getTimeInstance():
 * getDateTimeInstance(int dateStyle, int timeStyle)
 * getDateTimeInstance(int dateStyle, int timeStyle, Locale aLocale)
 * getDateTimeInstance():
 * getTimeInstance(int style)
 * getTimeInstance(int style, Locale aLocale)
 * 方法：
 * Object clone():
 * boolean equals(Object obj):
 * String format(Date date):格式化Date转String类型
 * StringBuffer format(Date date,StringBuffer toAppendTo,FieldPosition fieldPosition):
 * StringBuffer format(Object obj,StringBuffer toAppendTo,FieldPosition fieldPosition):
 * Calendar getCalendar():获取与此格式相关的时间日期格式
 * NumberFormat getNumberFormat():
 * TimeZone getTimeZone():
 * int hashCode():
 * boolean isLenient():
 * Date parse(String source):解析String转Date
 * Date parse(String source,ParsePosition pos):
 * void setCalendar(Calendar newCalendar):
 * void setLenient(boolean lenient):
 * void setNumberFormat(NumberFormat newNumberFormat):
 * void setTimeZone(TimeZone zone):
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.format.dateformat;