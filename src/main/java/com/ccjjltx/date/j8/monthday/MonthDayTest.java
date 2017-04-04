package com.ccjjltx.date.j8.monthday;

import java.time.Month;
import java.time.MonthDay;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class MonthDayTest {
    public static void main(String[] args) {
        MonthDay md = MonthDay.now();
        System.out.println("当前月日:" + md);//当前月日:--04-04
        //设置为5月23日
        MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
        System.out.println("5月23日为:" + md2);//5月23日为:--05-23
    }
}