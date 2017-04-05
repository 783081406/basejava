/**
 * Created by ccjjltx on 2017/4/3.
 * public final class Duration extends Object implements TemporalAmount, Comparable<Duration>, Serializable
 * 该类表示持续的时间，可以非常方便地获取一段时间
 * 秒和纳秒位基准的时长；Period表示以年，月，日衡量的时长。他们可以作为参数，传给主要的时间/日期类的增加或减少的方法
 * 也可以计算两个时间点之间的间隔
 * ofXXX()根据参数指定的大小计算以XXX个单位的时间间隔
 * between(arg1, arg2)计算两个参数时间点的时间间隔
 * plusXXX()/minusXXX()在当前时间间隔的基础上加上或减去指定个单位的时间
 * toXXX()将时间间隔格式化位指定单位的时间，Duration一般使用该类型函数，Period一般使用getXXX()
 * abs()求时间间隔的绝对值，保证时间间隔不为负数
 * isZero()/isNegative()判断时间间隔是否为0或负
 * withXXX()直接指定某个单位的值
 * 字段：
 * static Duration	ZERO：持续时间为零的常数
 * 方法：
 * Duration	abs()：以正长度返回此持续时间的副本
 * Temporal	addTo(Temporal temporal)：将此持续时间添加到指定的时间对象
 * static Duration	between(Temporal startInclusive, Temporal endExclusive)：
 * int	compareTo(Duration otherDuration)：
 * boolean	equals(Object otherDuration)：
 * static Duration	from(TemporalAmount amount)：
 * long	get(TemporalUnit unit)：
 * int	getNano()：在此持续时间内的纳秒数
 * long	getSeconds()：
 * List<TemporalUnit>  getUnits()：获取此持续时间支持的单位集
 * int	hashCode()：
 * boolean	isNegative()：检查此持续时间是否为负，不包括零
 * boolean	isZero()：
 * Duration	minus(Duration duration)：减操作
 * Duration	minus(long amountToSubtract, TemporalUnit unit)：
 * Duration	minusDays(long daysToSubtract)：
 * Duration	minusHours(long hoursToSubtract)：
 * Duration	minusMillis(long millisToSubtract)：
 * Duration	minusMinutes(long minutesToSubtract)：
 * Duration	minusNanos(long nanosToSubtract)：
 * Duration	minusSeconds(long secondsToSubtract)：
 * Duration	multipliedBy(long multiplicand)：
 * Duration	negated()：返回长度为否定的此持续时间的副本
 * static Duration  of(long amount, TemporalUnit unit)：Obtains a Duration representing an amount in the specified unit.
 * static Duration  ofHours(long hours)：获得代表24小时标准时间的持续时间
 * static Duration  ofMinutes(long minutes)：
 * static Duration  ofNanos(long nanos)：
 * static Duration  ofSeconds(long seconds)：
 * static Duration  ofSeconds(long seconds, long nanoAdjustment)
 * static Duration  parse(CharSequence text)：从文本字符串获取持续时间
 * Duration	plus(Duration duration)：加操作
 * Duration	plus(long amountToAdd, TemporalUnit unit)
 * Duration	plusDays(long daysToAdd)
 * Duration	plusHours(long hoursToAdd)
 * Duration	plusMillis(long millisToAdd)
 * Duration	plusMinutes(long minutesToAdd)
 * Duration	plusNanos(long nanosToAdd)
 * Duration	plusSeconds(long secondsToAdd)
 * Temporal	subtractFrom(Temporal temporal)
 * long	toDays()：得到此duration的天数
 * long	toHours()：
 * long	toMillis()：
 * long	toMinutes()：
 * long	toNanos()：
 * String	toString()：使用ISO-8601秒表示形式的字符串表示，如PT8H6M12.345S
 * Duration	withNanos(int nanoOfSecond)：以指定的纳秒秒返回此持续时间的副本
 * Duration	withSeconds(long seconds)
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.j8.duration;