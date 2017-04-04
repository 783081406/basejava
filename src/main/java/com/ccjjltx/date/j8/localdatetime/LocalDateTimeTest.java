package com.ccjjltx.date.j8.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
        DayOfWeek dayOfWeek = sylvester.getDayOfWeek();
        System.out.println(dayOfWeek);      // WEDNESDAY
        Month month = sylvester.getMonth();
        System.out.println(month);          // DECEMBER
        long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
        System.out.println(minuteOfDay);//1439
        //获取当前日期、时间加上25小时3分钟
        LocalDateTime localeDateTime = LocalDateTime.now();
        LocalDateTime future = localeDateTime.plusHours(25).plusMinutes(3);
        System.out.println("当前日期、时间的25小时3分之后:" + future);//当前日期、时间的25小时3分之后:2017-04-05T15:02:29.009
        //运行此程序的时间为2017-04-04 13:59:58
    }
}
