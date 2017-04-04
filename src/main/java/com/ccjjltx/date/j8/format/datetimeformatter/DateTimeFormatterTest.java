package com.ccjjltx.date.j8.format.datetimeformatter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //按照内置的不同方式格式化
        String format = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now());
        String format2 = DateTimeFormatter.ISO_LOCAL_TIME.format(LocalTime.now());
        String format3 = DateTimeFormatter.ISO_DATE.format(LocalDateTime.now());
        String format4 = DateTimeFormatter.ISO_INSTANT.format(Instant.now());
        System.out.println(format);//2017-04-04
        System.out.println(format2);//17:56:21.89
        System.out.println(format3);//2017-04-04
        System.out.println(format4);//2017-04-04T09:56:21.890Z
        //按照标准格式格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String format5 = formatter.format(LocalDateTime.now());
        System.out.println(format5);//2017年4月4日 星期二
        //按照指定方式格式化
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd E HH:mm:ss");
        String format6 = pattern.format(LocalDateTime.now());
        System.out.println(format6);//2017-04-04 星期二 17:56:21
    }
}
