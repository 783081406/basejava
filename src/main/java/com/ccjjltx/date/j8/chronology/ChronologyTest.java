package com.ccjjltx.date.j8.chronology;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.Chronology;
import java.time.chrono.HijrahChronology;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class ChronologyTest {
    public static void main(String[] args) {
        //提供对java.uti.Calendar的替换，提供对年历系统的支持
        Chronology c = HijrahChronology.INSTANCE;
        ChronoLocalDateTime d = c.localDateTime(LocalDateTime.now());
        System.out.println(d);//Hijrah-umalqura AH 1438-07-07T19:49:23.512
    }
}
