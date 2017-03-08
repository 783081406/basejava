package com.ccjjltx.date.calendar;

import java.util.Calendar;

/**
 * Created by ccjjltx on 2017/3/8.
 * 根据Calendar的api封装的一些常用函数
 *
 * @author ccj
 * @version 1.0
 */
public class MyCalendar {
    private static Calendar calendar = Calendar.getInstance();

    private MyCalendar() {
    }

    /**
     * 返回年
     *
     * @return 年
     */
    public static int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    /**
     * 获取月
     *
     * @return 月
     */
    public static int getMonth() {
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * 获得上个月
     *
     * @return 上个月
     */
    public static int getLastMonth() {
        return (calendar.get(Calendar.MONTH) + 11) % 12 + 1;
    }


    /**
     * 获得下个月
     *
     * @return 下个月
     */
    public static int getNextMonth() {
        return (calendar.get(Calendar.MONTH) + 13) % 12 + 1;
    }

    /**
     * 获取日
     *
     * @return 日
     */
    public static int getDay() {
        return calendar.get(Calendar.DATE);
    }

    /**
     * 获取本月天数
     *
     * @return 本月天数
     */
    public static int getMonthDays() {
        return calendar.getActualMaximum(Calendar.DATE);
    }

    /**
     * 获取上个月的天数
     *
     * @return 上个月的天数
     */
    public static int getPrevMonthDay() {
        //克隆calendar，只对临时变量操作就不会改变calendar了
        Calendar tmpCal = (Calendar) calendar.clone();
        tmpCal.add(Calendar.MONTH, -1);
        return tmpCal.getActualMaximum(Calendar.DATE);
    }

    /**
     * 获取下个月的天数
     *
     * @return 下个月的天数
     */
    public static int getNextMonthDays() {
        //克隆calendar，只对临时变量操作就不会改变calendar了
        Calendar tmpCal = (Calendar) calendar.clone();
        tmpCal.add(Calendar.MONTH, 1);
        return tmpCal.getActualMaximum(Calendar.DATE);
    }

    /**
     * 获取今天星期几
     *
     * @return 星期几
     */
    public static int getWeekDay() {
        return (calendar.get(Calendar.DAY_OF_WEEK) + 6) % 7 + 1;
    }

    /**
     * 获取本月第一天对应星期几
     *
     * @return 本月第一天对应星期几
     */
    public static int getFirstDayMonth() {
        //克隆calendar，只对临时变量操作就不会改变calendar了
        Calendar tmpCal = (Calendar) calendar.clone();
        tmpCal.set(Calendar.DATE, 1);
        return (tmpCal.get(Calendar.DAY_OF_WEEK) + 6) % 7 + 1;
    }

    /**
     * 获取当前月最后一天对应星期几
     *
     * @return 当前月最后一天对应星期几
     */
    public static int getLastDayMonth() {
        //克隆calendar，只对临时变量操作就不会改变calendar了
        Calendar tmpCal = (Calendar) calendar.clone();
        // 把日期设置为当月第一天
        tmpCal.add(Calendar.DATE, 1);
        // 把日期设置为当月最后一天
        tmpCal.roll(Calendar.DATE,-1);
        return (tmpCal.get(Calendar.DAY_OF_WEEK) + 6) % 7 + 1;
    }
}
