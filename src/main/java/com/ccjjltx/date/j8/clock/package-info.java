/**
 * Created by ccjjltx on 2017/3/9.
 * 该类用于获取指定时区的当前日期时间。该类可以取代System.currentTimeMillis()和TimeZone.getDefault()方法
 * 而且提供了更多方法来获取当前日期、时间。该类提供了大量静态方法来获取Clock对象
 * public abstract class Clock extends Object
 * protected Clock():由子类重写的构造函数
 * boolean equals(Object obj):
 * static Clock fixed(Instant fixedInstant,ZoneId zone):总是返回一个相同instant的clock
 * abstract ZoneId getZone():获取用于创建时期和时间的时区
 * int hashCode():
 * abstract Instant instant():得到当前clock的当前instant
 * long millis():得到当前clock的millisecond的instant
 * static Clock offset(Clock baseClock,Duration offsetDuration):获得clock，在原本的Clock上增加指定持续时间
 * static Clock system(ZoneId zone):得到一个clock从当前instant使用最有效的系统时钟
 * static Clock systemDefaultZone():得到一个时钟，该时钟使用最佳可用系统时钟返回当前时刻，使用默认时区转换日期和时间
 * static Clock systemUTC():获得时钟返回当前使用最好的系统时钟，转换为日期和使用UTC时区的时间
 * static Clock tick(Clock baseClock,Duration tickDuration):得到一个clock，缩短了Duration
 * static Clock tickMinutes(ZoneId zone):
 * static Clock tickSeconds(ZoneId zone):
 * abstract Clock withZone(ZoneId zone):返回具有不同时区的此时钟的副本
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.j8.clock;