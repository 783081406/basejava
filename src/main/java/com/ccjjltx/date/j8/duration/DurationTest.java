package com.ccjjltx.date.j8.duration;

import java.time.Duration;

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
        /*
        6000秒相当于100分
        3600秒相当于1小时
        6000秒相当于0天
         */
    }
}
