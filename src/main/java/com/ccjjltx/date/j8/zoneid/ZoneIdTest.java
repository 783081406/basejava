package com.ccjjltx.date.j8.zoneid;

import java.time.ZoneId;
import java.util.Set;

/**
 * Created by ccjjltx on 2017/4/8.
 *
 * @author ccj
 * @version 1.0
 */
public class ZoneIdTest {
    public static void main(String[] args) {
        Set<String> sets = ZoneId.getAvailableZoneIds();
        for (String set : sets) {
            System.out.println(set);
        }
        System.out.println("=============================");
        ZoneId zd = ZoneId.systemDefault();
        System.out.println(zd.getId());
    }
}
