package com.ccjjltx.date.j8;

import java.time.*;
import java.util.Date;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class NewDatePackageTest {
    public static void main(String[] args) {
        //-------Clock-----------
        Clock clock = Clock.systemUTC();
        Instant instant = clock.instant();
        System.out.println(instant);//2017-04-04T08:28:23.702Z
        System.out.println(Date.from(instant));//Tue Apr 04 16:28:23 CST 2017
        //获取clock对应的毫秒数，与System.currentTimeMillis()输出相同
        System.out.println(clock.millis());//1491294503764
        System.out.println(System.currentTimeMillis());//1491294503764
        //------Duration----------
        Duration d = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于" + d.toMinutes() + "分");//6000秒相当于100分
        System.out.println("6000秒相当于" + d.toHours() + "小时");//6000秒相当于1小时
        System.out.println("6000秒相当于" + d.toDays() + "天");//6000秒相当于0天
        //在clock基础上增加6000秒，返回新的Clock
        Clock clock2 = Clock.offset(clock, d);
        //clock2与clock1相差1小时40分
        System.out.println("当前时刻加6000秒为:" + clock2.instant());//当前时刻加6000秒为:2017-04-04T10:08:23.764Z
        //--------Instant----------
        Instant instant1 = Instant.now();
        System.out.println(instant1);//2017-04-04T08:28:23.702Z
        //添加100分钟，返回新的Instant
        Instant instant2 = instant.plusSeconds(6000);//2017-04-04T10:08:23.702Z
        System.out.println(instant2);
        //根据字符串解析Instant对象
        Instant instant3 = Instant.parse("2017-04-04T09:52:18.825Z");
        System.out.println(instant3);//2017-04-04T09:52:18.825Z
        //在instant3的基础上添加5小时4分钟
        Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
        System.out.println(instant4);//2017-04-04T14:56:18.825Z
        //获取instant4的5天以前的时刻
        Instant instant5 = instant4.minus(Duration.ofDays(5));
        System.out.println(instant5);//2017-03-30T14:56:18.825Z
        //----------LocalDate---------------
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);//2017-04-04
        //获取2017年第146天
        localDate = LocalDate.ofYearDay(2017, 146);
        System.out.println(localDate);//2017-05-26
        //设置为2017-4-4
        localDate = LocalDate.of(2017, Month.APRIL, 4);
        System.out.println(localDate);//2017-04-04
        //------------LocalTime-------------
        LocalTime localTime;
        localTime = LocalTime.now();
        System.out.println(localTime);//16:36:41.526
        localTime = LocalTime.of(22, 23);
        System.out.println(localTime);//22:23
        //返回一天中的第5503秒
        localTime = LocalTime.ofSecondOfDay(5503);
        System.out.println(localTime);//01:31:43
        //------------LocalDateTime-----------
        LocalDateTime localDateTime = LocalDateTime.now();
        //当前日期、时间加上25小时3分钟
        LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
        System.out.println("当前时间、日期的25小时3分之后：" + future);//当前时间、日期的25小时3分之后：2017-04-05T17:31:23.764
        //-----------Year、YearMonth、MonthDay-------------
        Year year = Year.now();
        System.out.println("当前年份:" + year);//当前年份:2017
        year = year.plusYears(5);
        System.out.println("当前年份再过5年:" + year);//当前年份再过5年:2022
        //根据指定月份获取YearMonth
        YearMonth ym = year.atMonth(10);
        System.out.println("year年10月:" + ym);//year年10月:2022-10
        //当前年月再加上5年、减去3个月
        ym = ym.plusYears(5).minusMonths(3);
        System.out.println("year年10月再加上5年、减去3个月:" + ym);//year年10月再加上5年、减去3个月:2027-07
        MonthDay md = MonthDay.now();
        System.out.println("当前月日:" + md);//当前月日:--04-04
        MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
        System.out.println("5月23日为:" + md2);//5月23日为:--05-23


    }
}
