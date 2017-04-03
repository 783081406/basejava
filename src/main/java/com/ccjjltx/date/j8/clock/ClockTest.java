package com.ccjjltx.date.j8.clock;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

/**
 * Created by ccjjltx on 2017/3/9.
 *
 * @author ccj
 * @version 1.0
 */
public class ClockTest {
    public static void main(String[] args) {
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

}
