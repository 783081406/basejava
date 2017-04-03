/**
 * Created by ccjjltx on 2017/4/3.
 * 该类表示持续的时间，可以非常方便地获取一段时间
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