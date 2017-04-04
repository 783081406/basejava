package com.ccjjltx.date.j8.localtime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(20, 30);
        time = time.withSecond(6); // 20:30:06
        System.out.println(time);
        LocalTime late = LocalTime.of(23, 59, 59);
        System.out.println(late);       // 23:59:59
        /////
        DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.GERMAN);
        LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
        System.out.println(leetTime);   // 13:37
        ////////
        ZoneId zone1 = ZoneId.of("Europe/Berlin");//ZoneRules[currentStandardOffset=+01:00]
        ZoneId zone2 = ZoneId.of("Brazil/East");//ZoneRules[currentStandardOffset=-03:00]
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());
        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);
        System.out.println(now1.isBefore(now2));//false
        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
        System.out.println(hoursBetween);//-4
        System.out.println(minutesBetween);//-299
    }
}
