/**
 * Created by ccjjltx on 2017/4/3.
 * 新的API：java.time由5个包组成
 * java.time-包含值对象的基础包
 * java.time.chrono-提供对不同的日历系统的访问
 * java.time.format-格式化和解析时间和日期
 * java.time.temporal-包括底层框架和扩展特性
 * java.time.zone-包含市区支持的类
 * 关键日期/时间概述：
 * 不可变性。借鉴于java.util.Calendar的前车之鉴，设计这个API的时候着重考虑了原有方法的不可变性，不允许任何更改，如果必须改变的话就会返回一个新的实例，所以我们必须捕获该方法的返回值
 * 瞬间性。表示时间上的某个精确的时刻，使用从epoch开始计算的毫秒表示
 * <p>
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