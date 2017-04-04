package com.ccjjltx.date.j8.instant;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by ccjjltx on 2017/4/3.
 *
 * @author ccj
 * @version 1.0
 */
public class InstantTest {
    public static void main(String[] args) {
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
}
