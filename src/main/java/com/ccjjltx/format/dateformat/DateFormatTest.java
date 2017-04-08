package com.ccjjltx.format.dateformat;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.util.Date;
import java.util.Locale;

/**
 * Created by ccjjltx on 2017/3/8.
 *
 * @author ccj
 * @version 1.0
 */
public class DateFormatTest {
    public static void main(String[] args) {
        // 只显示“时间”：调用getTimeInstance()函数
        testGetTimeInstance();
        // 只显示“日期”：调用getDateInstance()函数
        testGetDateInstance();
        // 显示“日期”+“时间”：调用getDateTimeInstance()函数
        testGetDateTimeInstance();
        // 测试format()函数
        testFormat();
    }

    /**
     * 只显示“时间”：调用getTimeInstance()函数
     */
    private static void testGetTimeInstance() {
        Date date = new Date();
        Locale locale = new Locale("en", "US");
        DateFormat short0 = DateFormat.getTimeInstance();
        //参数是:“时间的显示样式”
        DateFormat short1 = DateFormat.getTimeInstance(DateFormat.SHORT);
        DateFormat medium1 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        DateFormat long1 = DateFormat.getTimeInstance(DateFormat.LONG);
        DateFormat full1 = DateFormat.getTimeInstance(DateFormat.FULL);
        //参数是：“时间的显示样式” 和 “地区”
        DateFormat short2 = DateFormat.getTimeInstance(DateFormat.SHORT, locale);
        DateFormat medium2 = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale);
        DateFormat long2 = DateFormat.getTimeInstance(DateFormat.LONG, locale);
        DateFormat full2 = DateFormat.getTimeInstance(DateFormat.FULL, locale);

        System.out.println("默认\t" + "SHORT\t" + "MEDIUM\t" + "LONG\t" + "FULL\t");
        //23:35:24	下午11:35	23:35:24	下午11时35分24秒	下午11时35分24秒 CST
        System.out.println(short0.format(date) + "\t" + short1.format(date) + "\t" + medium1.format(date) + "\t"
                + long1.format(date) + "\t" + full1.format(date));
        //23:35:24	11:35 PM	11:35:24 PM	11:35:24 PM CST	11:35:24 PM CST
        System.out.println(short0.format(date) + "\t" + short2.format(date) + "\t" + medium2.format(date) + "\t"
                + long2.format(date) + "\t" + full2.format(date));
    }

    /**
     * 只显示“日期”：调用getDateInstance()函数
     */
    private static void testGetDateInstance() {
        System.out.println("======================================");
        Date date = new Date();
        Locale locale = new Locale("en", "US");
        DateFormat short0 = DateFormat.getDateInstance();
        DateFormat short1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat medium1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat long1 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat full1 = DateFormat.getDateInstance(DateFormat.FULL);

        DateFormat short2 = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        DateFormat medium2 = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        DateFormat long2 = DateFormat.getDateInstance(DateFormat.LONG, locale);
        DateFormat full2 = DateFormat.getDateInstance(DateFormat.FULL, locale);

        System.out.println("默认\t" + "SHORT\t" + "MEDIUM\t" + "LONG\t" + "FULL\t");
        //2017-3-8	17-3-8	2017-3-8	2017年3月8日	2017年3月8日 星期三
        System.out.println(short0.format(date) + "\t" + short1.format(date) + "\t" + medium1.format(date) + "\t"
                + long1.format(date) + "\t" + full1.format(date));
        //2017-3-8	3/8/17	Mar 8, 2017	March 8, 2017	Wednesday, March 8, 2017
        System.out.println(short0.format(date) + "\t" + short2.format(date) + "\t" + medium2.format(date) + "\t"
                + long2.format(date) + "\t" + full2.format(date));
    }

    /**
     * 显示“日期”+“时间”：调用getDateTimeInstance()函数
     */
    private static void testGetDateTimeInstance() {
        System.out.println("======================================");
        Date date = new Date();
        Locale locale = new Locale("en", "US");
        DateFormat short0 = DateFormat.getDateTimeInstance();
        DateFormat short1 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        DateFormat medium1 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        DateFormat long1 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        DateFormat full1 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);

        DateFormat short2 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, locale);
        DateFormat medium2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, locale);
        DateFormat long2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        DateFormat full2 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, locale);

        System.out.println("默认\t" + "SHORT\t" + "MEDIUM\t" + "LONG\t" + "FULL\t");
        //2017-3-8 23:40:56	17-3-8 下午11:40	2017-3-8 23:40:56	2017年3月8日 下午11时40分56秒	2017年3月8日 星期三 下午11时40分56秒 CST
        System.out.println(short0.format(date) + "\t" + short1.format(date) + "\t" + medium1.format(date) + "\t"
                + long1.format(date) + "\t" + full1.format(date));
        //2017-3-8 23:40:56	3/8/17 11:40 PM	Mar 8, 2017 11:40:56 PM	March 8, 2017 11:40:56 PM CST	Wednesday, March 8, 2017 11:40:56 PM CST
        System.out.println(short0.format(date) + "\t" + short2.format(date) + "\t" + medium2.format(date) + "\t"
                + long2.format(date) + "\t" + full2.format(date));
    }

    /**
     * 测试format()函数
     */
    private static void testFormat() {
        System.out.println("======================================");
        Date date = new Date();
        StringBuffer sb = new StringBuffer();
        FieldPosition field = new FieldPosition(DateFormat.YEAR_FIELD);
        DateFormat format = DateFormat.getDateTimeInstance();

        sb = format.format(date, sb, field);
        System.out.println("\ntestFormat");
        System.out.println("sb=" + sb);//sb=2017-3-8 23:48:13
    }
}
