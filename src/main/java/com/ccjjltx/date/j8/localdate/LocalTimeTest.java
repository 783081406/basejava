package com.ccjjltx.date.j8.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class LocalTimeTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println(yesterday);//2017-04-03
        LocalDate independenceDay = LocalDate.of(2017, Month.APRIL, 4);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        System.out.println(dayOfWeek);//TUESDAY
        System.out.println("Year:" + today.getYear() + " Month:" + today.getMonthValue() + " day:" + today.getDayOfMonth());
        //Year:2017 Month:4 day:4
    }
}
