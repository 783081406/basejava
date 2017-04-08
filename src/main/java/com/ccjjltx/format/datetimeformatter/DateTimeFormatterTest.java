package com.ccjjltx.format.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by ccjjltx on 2017/4/8.
 *
 * @author ccj
 * @version 1.0
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        //格式化成字符串
        testFormat();
        //解析字符串
        testParse();
    }

    //格式化为字符串
    private static void testFormat() {
        DateTimeFormatter[] formatter = new DateTimeFormatter[]{
                //直接使用常量创建DateTimeFormatter格式器
                DateTimeFormatter.ISO_LOCAL_DATE,
                DateTimeFormatter.ISO_LOCAL_TIME,
                DateTimeFormatter.ISO_LOCAL_DATE_TIME,
                //使用本地化的不同风格来创建DateTimeFormatter格式器
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
                DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
                //根据模式字符串来创建DateTimeFormatter格式器
                DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd  HH:mm:ss")
        };
        LocalDateTime date = LocalDateTime.now();
        //依次使用不同的格式器对LocalDateTime进行格式化
        for (int i = 0; i < formatter.length; i++) {
            //下面两行代码作用相同
            System.out.println(date.format(formatter[i]));
            System.out.println(formatter[i].format(date));
        }
    }

    //解析字符串
    private static void testParse() {
        // 定义一个任意格式的日期时间字符串
        String str1 = "2017==04==08 18时06分09秒";
        // 根据需要解析的日期、时间字符串定义解析所用的格式器
        DateTimeFormatter fomatter1 = DateTimeFormatter
                .ofPattern("yyyy==MM==dd HH时mm分ss秒");
        // 执行解析
        LocalDateTime dt1 = LocalDateTime.parse(str1, fomatter1);
        System.out.println(dt1); // 输出 2014-04-12T01:06:09
        // ---下面代码再次解析另一个字符串---
        String str2 = "2017$$$四月$$$08 18小时";
        DateTimeFormatter fomatter2 = DateTimeFormatter
                .ofPattern("yyy$$$MMM$$$dd HH小时");
        LocalDateTime dt2 = LocalDateTime.parse(str2, fomatter2);
        System.out.println(dt2); // 输出 2014-04-13T20:00
    }
}
