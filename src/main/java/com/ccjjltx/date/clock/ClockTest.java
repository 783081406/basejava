package com.ccjjltx.date.clock;

import java.time.Clock;
import java.time.ZoneId;

/**
 * Created by ccjjltx on 2017/3/9.
 * @author ccj
 * @version 1.0
 */
public class ClockTest {
    public static void main(String[] args) {
        //系统默认UTC时钟
        Clock c1=Clock.systemUTC();
        //通过Clock获取当前时刻
        System.out.println("当前时刻为:"+c1.instant());//当前时刻为:2017-03-09T12:57:31.852Z(不准)
        //下面两者输出相同
        System.out.println(c1.millis());//1489064348148
        System.out.println(System.currentTimeMillis());//1489064348148
        Clock c2=Clock.systemDefaultZone();//系统默认时区（当前瞬时）
        System.out.println("当前时刻为:"+c2.instant());//2017-03-09T13:00:50.156Z(不准)
        Clock c3=Clock.system(ZoneId.of("Asia/Shanghai"));//上海时区
        System.out.println("当前时刻为:"+c3.instant()) ;//当前时刻为:2017-03-09T13:02:53.586Z(不准)
    }

}
