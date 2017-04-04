package com.ccjjltx.date.j8.year;

import java.time.Year;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class YearTest {
    public static void main(String[] args) {
        Year year = Year.now();
        System.out.println("当前年份:" + year);//当前年份:2017
        year = year.plusYears(5);
        System.out.println("当前年份再过5年:" + year);//当前年份再过5年:2022
    }
}
