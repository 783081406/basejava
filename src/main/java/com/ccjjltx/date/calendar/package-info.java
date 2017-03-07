/**
 * Created by ccjjltx on 2017/3/7.
 * 17个字段，都支持下面的公共函数接口:
 * int getMaximum(int field):获取"字段的最大值"
 * int getActualMaximum(int field):获取"当前日期下，该字段的最大值"
 * 上面两者的区别：第一个是获取目的的最大值，综合所有日期，得出一个月最多有31天。因此返回值31.
 * 而第二个是返回本月最大，如在九月会返回30
 * <p>
 * int getMinimum(int field):获取"字段的最小值"
 * int getActualMinimum(int field):获取当前日期下，该字段的最小值
 * 上面两者：在Java默认的Calendar中，虽然 getMinimum() 和 getActualMinimum() 的含义不同；但是，它们的返回值是一样的。
 * 因为Calendar的默认是返回GregorianCalendar对象，而在GregorianCalendar.java中，getMinimum()和 getActualMinimum() 返回值一样。
 * <p>
 * int get(int field):获取"字段的当前值"
 * void set(int field,int value):设置"字段的当前值"
 * void add(int field,int value):给"字段的当前值"添加值。field字段的当前值添加value（添加值可以为正数，也可以是负数。
 * 正数表示将日期增加，负数表示将日期减少。）
 * void roll(int field,int value):回滚"字段的当前值"
 * 上面两者的区别：回滚Calendar中某一字段时，不更改更大的字段！这是roll()与add()的根据区别！
 * add()可能会更改更大字段，比如“使用add()修改‘MONTH’字段，可能会引起‘YEAR’字段的改变”；但是roll()不会更改更大的字段
 * 例如“使用roll()修改‘MONTH’字段，不回引起‘YEAR’字段的改变。”假设：现在cal的值是“2013-09-01”，现在我们将MONTH字段值增加-10。
 * 得到的结果是：“2013-10-01”。
 * 为什么会这样呢？这就是因为“回滚”就是“在最小值和最大值之间来回滚动”。本例中，MONTH是9月，前回滚10，得到的值是10月，
 * 但是roll()不会改变“比MONTH”更大的字段，所以YEAR字段不会改变。所以结果是“2013-10-01”。
 * <p>
 * void clear(int field):清空"字段的当前值".所谓的清空实际上就是把"field"的值设置为0，若field最小值是1，则设置为1
 * boolean isSet(int field):判断"字段field"是否被设置。若判断clear()清空之后，这field变成"没有设置状态"
 * <p>
 * 其他函数：
 * 比较：
 * boolean equals(Object obj):
 * int compareTo(Calendar anotherCalendar):
 * 宽容函数：
 * void setLenient(boolean value):设置Calendar宽容度
 * boolean isLenient():获取alendar的宽容度
 * 年月日(时分秒),Date,TimeZone,MilliSecond函数
 * void set(int year,int month,int day)
 * void set(int year,int month,int day,int hourOfDay,int minute,int second)
 * void set(int year,int month,int day,int hourOfDay,int minute)
 * Date getTime():获取Calendar对应的日期
 * void setTime(Date date):设置Calendar为date
 * TimeZone getTimeZone():获取Calendar对应的时区
 * void setTimeZone(TimeZone timeZone):设置Calendar对应的时区
 * long getTimeInMillis():获取Calendar对应的milliSeconds值，就是Calendar当前日期距离1970-1-1 0：0：0毫秒数
 * void setTimeInMillis(long milliseconds):设置Calendar对应的milliseconds)
 * 其他操作：
 * Object clone():克隆Calendar
 * int getFirstDayOfWeek():获取每周的第一天是星期几
 * void setFirstDayOfWeek():设置每周第一天是星期几
 * int getMinimalDaysInFirstWeek():获取一年中第一个星期所需的最少天数，例如，如果定义第一个星期包含一年第一个月的第一天，
 * 则此方法将返回 1。如果最少天数必须是一整个星期，则此方法将返回 7
 * void setMinimalDaysInFirstWeek(int value):设置一年中第一个星期所需的最少天数，例如，如果定义第一个星期包含一年第一个月的第一天，
 * 则使用值 1 调用此方法。如果最少天数必须是一整个星期，则使用值 7 调用此方法
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.calendar;