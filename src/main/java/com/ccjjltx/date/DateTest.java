package com.ccjjltx.date;

import java.util.Date;

/**
 * Created by ccjjltx on 2017/3/7.
 * 如果需要对日期、时间进行加减运算，或获取指定时间的年、月、日、时、分、秒信息，可使用Calendar工具类
 *
 * @author ccj
 * @version 1.0
 */
public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        //获取当前时间之后100ms的时间
        Date d2 = new Date(System.currentTimeMillis() + 100);
        System.out.println(d2);//Tue Mar 07 15:11:07 CST 2017
        System.out.println(d1.compareTo(d2));//-1
        System.out.println(d1.before(d2));//true
    }
}
