/**
 * Created by ccjjltx on 2017/3/7.
 * 可变类
 * java.util.Date
 * implements Serializable,Cloneable,Comparable<Date>
 * Date不仅无法实现国际化，而且她对不同属性也使用了前后矛盾的偏移量
 * 比如月份与小时都是从0开始的，月份中的天数则是从1开始的，而Calendar则过于复杂
 * Date():生成一个代表当前日期时间的Date对象，该构造器在底层调用System.currentTimeMillis()获得long整数作为日期参数
 * Date(long date):根据指定的long型整数来生成一个Date对象。该构造器的参数表示创建Date对象和GMT 1970年1月1日00：00：00之
 * 间的时间差，以毫秒作为计时单位
 * boolean after(Date when):测试该日期是否在指定日期when之后
 * boolean before(Date when):测试该日期是否在制定日期when之前
 * static Date from(Instant instant):获得一个Date实例化从Instant对象中
 * long getTime():返回该事件对应的long型整数，即从GMT 1970-01-01 00:00:00到Date对象之间的时间差，以毫秒作为即时单位
 * void setTime(long time):设置该Date对象的时间
 * ing getXxx():得到年月日小时秒等等
 * void setXxx():设置年月日小时秒等等
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date;