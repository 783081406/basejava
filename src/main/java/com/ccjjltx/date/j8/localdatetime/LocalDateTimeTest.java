package com.ccjjltx.date.j8.localdatetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.IsoFields;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
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

    private static void test2() {
        System.out.println("====================================================================");
        //使用默认时区时钟瞬时时间创建 Clock.systemDefaultZone() -->即相对于 ZoneId.systemDefault()默认时区
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2017-04-04T19:59:56.177
        //自定义时区
        LocalDateTime now2 = LocalDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(now2);//会以相应的时区显示日期//2017-04-04T13:59:56.177
        //自定义时钟
        Clock clock = Clock.system(ZoneId.of("Asia/Dhaka"));
        LocalDateTime now3 = LocalDateTime.now(clock);
        System.out.println(now3);//会以相应的时区显示日期//2017-04-04T17:59:56.184
        //不需要写什么相对时间 如java.util.Date 年是相对于1900 月是从0开始
        //2013-12-31 23:59
        LocalDateTime d1 = LocalDateTime.of(2013, 12, 31, 23, 59);
        System.out.println(d1);//2013-12-31T23:59
        //年月日 时分秒 纳秒
        LocalDateTime d2 = LocalDateTime.of(2013, 12, 31, 23, 59, 59, 11);
        System.out.println(d2);//2013-12-31T23:59:59.000000011
        //使用瞬时时间 + 时区
        LocalDateTime d3 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println(d3);//2017-04-04T19:59:56.184
        //解析String--->LocalDateTime
        LocalDateTime d4 = LocalDateTime.parse("2013-12-31T23:59");
        System.out.println(d4);//2013-12-31T23:59
        LocalDateTime d5 = LocalDateTime.parse("2013-12-31T23:59:59.999");//999毫秒 等价于999000000纳秒
        System.out.println(d5);//2013-12-31T23:59:59.999
        //使用DateTimeFormatter API 解析 和 格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime d6 = LocalDateTime.parse("2013/12/31 23:59:59", formatter);
        System.out.println(formatter.format(d6));//2013/12/31 23:59:59
        //时间获取
        System.out.println(d6.getYear());//2013
        System.out.println(d6.getMonth());//DECEMBER
        System.out.println(d6.getDayOfYear());//365
        System.out.println(d6.getDayOfMonth());//31
        System.out.println(d6.getDayOfWeek());//TUESDAY
        System.out.println(d6.getHour());//23
        System.out.println(d6.getMinute());//59
        System.out.println(d6.getSecond());//59
        System.out.println(d6.getNano());//0
        //时间增减
        LocalDateTime d7 = d6.minusDays(1);
        LocalDateTime d8 = d7.plus(1, IsoFields.QUARTER_YEARS);
        System.out.println(d8);//2014-03-30T23:59:59
    }
}
