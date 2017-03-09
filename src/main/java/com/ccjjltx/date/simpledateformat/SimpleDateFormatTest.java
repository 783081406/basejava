package com.ccjjltx.date.simpledateformat;

import java.text.SimpleDateFormat;

/**
 * Created by ccjjltx on 2017/3/9.
 * @author ccj
 * @version 1.0
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
    }

    private static void testPattern(){
        SimpleDateFormat myFmt=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        SimpleDateFormat myFmt1=new SimpleDateFormat("yy/MM/dd HH:mm");
        SimpleDateFormat myFmt2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//等价于now.toLocalString()
        SimpleDateFormat myFmt3=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E");
    }
}
