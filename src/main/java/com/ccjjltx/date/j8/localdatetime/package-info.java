/**
 * Created by ccjjltx on 2017/4/4.
 * 该类代表不带时区的日期、时间，例如2007-12-03T0：15：30.该类提供了静态的now()方法来获取当前日期、时间，
 * 也提供了静态的now（Clock clock）方法来获取clock对应的日期、时间。除此之外，
 * 它还提供了minusXxx()方法在当前年份基础上减去几年、几月、几日、几小时、几分、几秒等
 * 也提供了plusXxx（）方法在当前年份基础上加上几年、几月、几日、几小时、几分、几秒等
 * <p>
 * 这个值类型只是LocalDate和LocalTime的简单组合。LocalDateTime可以直接创建或者组合时间和日期
 * 将LocalDate和LocalTime两个类的plusXXX(), minusXXX(), withXXX(),getXXX()简单相加
 * 与LocalDate对象其他函数完全类似
 * isXXX()与LocalDate完全一样
 * toLocalDate()/toLocalTime()将LocalDateTime转换为LocalTime或者LocalDate
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.j8.localdatetime;