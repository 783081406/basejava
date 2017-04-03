package com.ccjjltx.date.j8.duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * Created by ccjjltx on 2017/4/3.
 *
 * @author ccj
 * @version 1.0
 */
public class DurationTest {
    public static void main(String[] args) {
        Duration d = Duration.ofSeconds(6000);
        System.out.println("6000秒相当于" + d.toMinutes() + "分");
        Duration d1 = Duration.ofSeconds(60 * 60);
        System.out.println("3600秒相当于" + d1.toHours() + "小时");
        System.out.println("6000秒相当于" + d.toDays() + "天");
        //////
        LocalDateTime from = LocalDateTime.of(2014, Month.APRIL, 16, 0, 0, 0);//年月日时分秒
        LocalDateTime to = LocalDateTime.of(2015, Month.APRIL, 16, 23, 59, 59);
        Duration duration = Duration.between(from, to);
        System.out.println("Duration in days: " + duration.toDays());
        System.out.println("Duration in hours: " + duration.toHours());
        /*
        6000秒相当于100分
        3600秒相当于1小时
        6000秒相当于0天
        Duration in days: 365
        Duration in hours: 8783
         */
    }
}
