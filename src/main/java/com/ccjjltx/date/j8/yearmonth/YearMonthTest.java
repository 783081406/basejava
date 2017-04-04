package com.ccjjltx.date.j8.yearmonth;

import java.time.Year;
import java.time.YearMonth;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class YearMonthTest {
    public static void main(String[] args) {
        Year year = Year.now();
        YearMonth yearMonth = year.atMonth(10);
        System.out.println("year年10月:" + yearMonth);//year年10月:2017-10
        yearMonth = yearMonth.plusYears(5).minusMonths(3);
        System.out.println("year年10月再加5年、减3月:" + yearMonth);//year年10月再加5年、减3月:2022-07
    }
}
