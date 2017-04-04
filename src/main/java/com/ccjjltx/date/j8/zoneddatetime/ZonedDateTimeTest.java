package com.ccjjltx.date.j8.zoneddatetime;

import java.sql.Date;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class ZonedDateTimeTest {
    public static void main(String[] args) {
        //即带有时区的date-time 存储纳秒、时区和时差（避免与本地date-time歧义）。
        //API和LocalDateTime类似，只是多了时差(如2013-12-20T10:35:50.711+08:00[Asia/Shanghai])
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);//2017-04-04T19:40:44.619+08:00[Asia/Shanghai]
        ZonedDateTime now2 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(now2);//2017-04-04T13:40:44.619+02:00[Europe/Paris]
        ZonedDateTime z1 = ZonedDateTime.parse("2013-12-31T23:59:59Z[Europe/Paris]");
        System.out.println(z1);//2013-12-31T23:59:59+01:00[Europe/Paris]
    }
}
