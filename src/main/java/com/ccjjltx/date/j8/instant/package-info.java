/**
 * Created by ccjjltx on 2017/4/3.
 * 继承Temporal,TemporalAdjuster
 * 代表一个具体的时刻，可以精确到纳秒。该类提供了静态的now(Clock clock)方法来获取当前时刻.除此之外，还提供了一系列minusXXX()方法
 * 在当前时刻基础上减去一段时间，也提供了plusXXX()方法在当前时刻基础上加上一段时间
 * 字段：
 * static Instant  EPOCH：常数为1970-01-01T00：00：00Z 时代瞬间
 * static Instant  MAX：最大支持的即时，'1000000000-12-31T23：59：59.999999999Z'
 * static Instant  MIN：支持的最小速度“-1000000000-01-01T00：00Z”
 * 函数：
 * Temporal	adjustInto(Temporal temporal)：调整指定的时间对象具有这个瞬间
 * OffsetDateTime  atOffset(ZoneOffset offset)：将此瞬间与偏移组合以创建OffsetDateTime
 * ZonedDateTime  atZone(ZoneId zone)：将此瞬间与时区相结合，创建ZonedDateTime
 * int  compareTo(Instant otherInstant)
 * boolean  equals(Object otherInstant)
 * static Instant  from(TemporalAccessor temporal)：从时间对象获取即时的实例
 * int	get(TemporalField field)：从该时刻获取指定字段的值作为int
 * long	getEpochSecond()：从1970-01-01T00：00：00Z的Java时代获取秒数
 * long	getLong(TemporalField field)：
 * int	getNano()：
 * int	hashCode()：
 * boolean	isAfter(Instant otherInstant)：
 * boolean	isBefore(Instant otherInstant)：
 * boolean	isSupported(TemporalField field)：检查指定的字段是否受支持
 * boolean	isSupported(TemporalUnit unit)：
 * Instant	minus(long amountToSubtract, TemporalUnit unit)：返回此时刻的副本，减去指定的
 * Instant	minus(TemporalAmount amountToSubtract)：
 * Instant	minusMillis(long millisToSubtract)：
 * Instant	minusNanos(long nanosToSubtract)：
 * Instant	minusSeconds(long secondsToSubtract)：
 * static Instant	now()：获得一个实例化来自系统时钟
 * static Instant	now(Clock clock)
 * static Instant	ofEpochMilli(long epochMilli)
 * static Instant	ofEpochSecond(long epochSecond)
 * static Instant	ofEpochSecond(long epochSecond, long nanoAdjustment)
 * static Instant	parse(CharSequence text)：such as 2007-12-03T10:15:30.00Z
 * Instant	plus(long amountToAdd, TemporalUnit unit)：减操作
 * Instant	plus(TemporalAmount amountToAdd)：
 * Instant	plusMillis(long millisToAdd)：
 * Instant	plusNanos(long nanosToAdd)
 * Instant	plusSeconds(long secondsToAdd)
 * <R> R	query(TemporalQuery<R> query)：查询
 * long	toEpochMilli()：将此瞬间转换为1970-01-01T00：00：00Z的时期的毫秒数。
 * String  toString()
 * Instant  truncatedTo(TemporalUnit unit)：将此Instant的副本返回给指定的单位
 * long	until(Temporal endExclusive, TemporalUnit unit)：根据指定单位计算直到另一瞬间的时间量
 * Instant	with(TemporalAdjuster adjuster)：返回一个adjusted副本在这个instant
 * Instant	with(TemporalField field, long newValue)
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.j8.instant;