package com.ccjjltx.date.j8.instant;

import java.time.*;
import java.time.temporal.ChronoField;
import java.util.Date;

/**
 * Created by ccjjltx on 2017/4/3.
 *
 * @author ccj
 * @version 1.0
 */
public class InstantTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        // 瞬时时间 相当于以前的System.currentTimeMillis()
        Instant instant1 = Instant.now();
        System.out.println(instant1.getEpochSecond());// 精确到秒 得到相对于1970-01-01//1491224011
        // 00:00:00 UTC的一个时间
        System.out.println(instant1.toEpochMilli()); // 精确到毫秒//1491224011300
        Clock clock1 = Clock.systemUTC(); // 获取系统UTC默认时钟
        Instant instant2 = Instant.now(clock1);// 得到时钟的瞬时时间
        System.out.println(instant2.toEpochMilli());//1491224011300
        Clock clock2 = Clock.fixed(instant1, ZoneId.systemDefault()); // 固定瞬时时间时钟
        Instant instant3 = Instant.now(clock2);// 得到时钟的瞬时时间
        System.out.println(instant3.toEpochMilli());// equals instant1//1491224011300
        Instant instant = new Date().toInstant();
        Date date = Date.from(instant);
        System.out.println(instant);//2017-04-03T12:53:31.347Z
        System.out.println(date);//Mon Apr 03 20:53:31 CST 2017
        Instant start = Instant.now();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        long seconds = duration.getSeconds();
        long millis = duration.toMillis();
        boolean isAfter = end.isAfter(start);
        System.out.println(seconds);//3
        System.out.println(millis);//3008
        System.out.println(isAfter);//true

    }

    private static void test2() {
        // instant是一个不可变类线程安全，同时不可以使用==，hashcode去比较
        Instant instant = Instant.now();
        //Temporal的继承接口是TemporalAccessor
        //实现Temporal的常用几个子类是：Instant,LocalDate,LocalTime,LocalDateTime
        //OffsetDateTime,OffsetTime,Year,YearMonth,ZonedDateTime
        //TemporalField的实现类是ChronoField（提供一套标准的字段）
       /* instant.get(ChronoField.INSTANT_SECONDS);
        instant.get(ChronoField.MICRO_OF_SECOND);
        instant.get(ChronoField.MILLI_OF_SECOND);
        instant.get(ChronoField.NANO_OF_SECOND);*/
        //不过建议在使用get,或者getLong方法之前先使用isSupported(TemporalUnit unit)方法检验一下是否支持
        System.out.println(instant.isSupported(ChronoField.INSTANT_SECONDS));
        System.out.println(instant.isSupported(ChronoField.MICRO_OF_SECOND));
        System.out.println(instant.isSupported(ChronoField.MILLI_OF_SECOND));
        System.out.println(instant.isSupported(ChronoField.NANO_OF_SECOND));
        //TemporalUnit的枚举子类是ChronoUnit（提供一组标准的时间日期单位）
        //TemporalAmount的接口子类是ChronoPeriod,实现类是Duration
        //返回一个TemporalAdjuster对象的Instant对象复制
      /*  Instant instant2 = instant.with(LocalDate.now());
        Instant instant3 = instant.with(ChronoField.DAY_OF_MONTH, 2);*/
        System.out.println(instant);
        //System.out.println(instant2);
        //System.out.println(instant3);
    }
}
