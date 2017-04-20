package com.ccjjltx.thread.sleep;

import java.util.Date;

/**
 * Created by ccjjltx on 2017/4/20.
 *
 * @author ccj
 * @version 1.0
 */
public class SleepTest {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前时间:" + new Date());
            //调用sleep()方法让当前县城暂停ls
            Thread.sleep(1000);
            /*
            当前时间:Thu Apr 20 22:07:58 CST 2017
            当前时间:Thu Apr 20 22:07:59 CST 2017
            当前时间:Thu Apr 20 22:08:00 CST 2017
            当前时间:Thu Apr 20 22:08:01 CST 2017
            当前时间:Thu Apr 20 22:08:02 CST 2017
            当前时间:Thu Apr 20 22:08:03 CST 2017
            当前时间:Thu Apr 20 22:08:04 CST 2017
            当前时间:Thu Apr 20 22:08:05 CST 2017
            当前时间:Thu Apr 20 22:08:06 CST 2017
            当前时间:Thu Apr 20 22:08:07 CST 2017
             */
        }
    }
}
