/**
 * Created by ccjjltx on 2017/4/3.
 * 新的API：java.time由5个包组成
 * java.time-包含值对象的基础包
 * java.time.chrono-提供对不同的日历系统的访问
 * java.time.format-格式化和解析时间和日期
 * java.time.temporal-包括底层框架和扩展特性
 * java.time.zone-包含时区支持的类
 * 关键日期/时间概述：
 * 不可变性。借鉴于java.util.Calendar的前车之鉴，设计这个API的时候着重考虑了原有方法的不可变性，
 * 不允许任何更改，如果必须改变的话就会返回一个新的实例，所以我们必须捕获该方法的返回值
 * 瞬间性。表示时间上的某个精确的时刻，使用从epoch开始计算的毫秒表示
 * <p>
 * 这些方法一般有一致的方法前缀：
 * of：静态工厂方法。
 * parse：静态工厂方法，关注于解析。
 * get：获取某些东西的值。
 * is：检查某些东西的是否是true。
 * with：不可变的setter等价物。
 * plus：加一些量到某个对象。
 * minus：从某个对象减去一些量。
 * to：转换到另一个类型。
 * at：把这个对象与另一个对象组合起来，例如： date.atTime(time)。
 * Clock:
 * Duration:
 * Instant:
 * LocalDate:
 * LocalTime:
 * LocalDateTime:
 * MonthDay:
 * Year:
 * YearMonth:
 * ZonedDateTime:
 * ZoneId:
 * DayOfWeek:
 * Month:
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.j8;