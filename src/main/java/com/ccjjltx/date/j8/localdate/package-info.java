/**
 * Created by ccjjltx on 2017/4/4.
 * 该类代表不带时区的日期，例如2007-12-03.该类提供了静态的now()方法来获取当前日期
 * 也提供了静态的now(Clock clock)方法来获取clock。除此之外还提供了minusXxx()方法在当前年份基础上减去几年、几月、几周或几日等
 * 也提供了plusXxx()方法在当前年份基础上加上几年、几月、几周或几日等
 * 不可变类型
 * now()根据当前时间戳创建LocalDate
 * of()根据制定的年月日创建LocalDate
 * parse(charqueue, DateTimeFormatterTest)根据传入的format将字符串转化为LocalDate对象
 * ofYearDay()根据指定的年和一年中的第几天创建LocalDate
 * getXXX()获取当前LocalDate中关于日期的信息，年月日等等
 * plusXXX()在当前的LocalDate的基础上增加指定时间类型来创建一个新的LocalDate
 * minusXXX()在当前的LocalDate的基础上减去指定时间类型来创建一个新的LocalDate
 * withXXX()在当前的LocalDate的基础上指定某个时间类型的值来创建一个新的LocalDate
 * isXXX()判断两个LocalDate的大小关系，特别（isLeepYear()判断是否为闰年）
 * lengthOfXXX()获取LocalDate代表的年或月的天数
 * with(TemporalAdjuster)TemporalAdjusters提供了几个用来获取TemporalAdjuster的方法，用来处理比较复杂的逻辑，比如获取当月的最后一天lastDayOfMonth()
 * atTime()将LocalDate转化为LocalDateTime
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.j8.localdate;