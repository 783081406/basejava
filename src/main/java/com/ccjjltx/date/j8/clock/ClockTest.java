package com.ccjjltx.date.j8.clock;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/**
 * Created by ccjjltx on 2017/3/9.
 *
 * @author ccj
 * @version 1.0
 */
public class ClockTest {
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        Instant instant = clock.instant();
        System.out.println(clock);//SystemClock[Asia/Shanghai]
        Date date = Date.from(instant);
        System.out.println(millis);//1491217621491
        System.out.println(date);//Mon Apr 03 19:07:01 CST 2017
        Date date1 = new Date(millis);
        System.out.println(date1);//Mon Apr 03 19:07:01 CST 2017
    }

    private static void test2() {
        System.out.println("==============================================");
        //时钟提供给我们用于访问某个特定时区的瞬时时间、日期和时间
        Clock c1 = Clock.systemUTC();//系统默认UTC时钟（当前瞬时时间 System.currentTimeMillis()）
        System.out.println(c1.millis());//1491305703268
        Clock c2 = Clock.systemDefaultZone(); //系统默认时区时钟（当前瞬时时间）
        Clock c31 = Clock.system(ZoneId.of("Europe/Paris")); //巴黎时区
        System.out.println(c31.millis()); //每次调用将返回当前瞬时时间（UTC）//1491305703268
        Clock c32 = Clock.system(ZoneId.of("Asia/Shanghai"));//上海时区
        System.out.println(c32.millis());//每次调用将返回当前瞬时时间（UTC）//1491305703268
        Clock c4 = Clock.fixed(Instant.now(), ZoneId.of("Asia/Shanghai"));//固定上海时区时钟
        System.out.println(c4.millis());//1491305703268
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c4.millis()); //不变 即时钟时钟在那一个点不动//1491305703268
        Clock c5 = Clock.offset(c1, Duration.ofSeconds(2)); //相对于系统默认时钟两秒的时钟
        System.out.println(c1.millis());//1491305704268
        System.out.println(c5.millis());//1491305706268
    }
}
