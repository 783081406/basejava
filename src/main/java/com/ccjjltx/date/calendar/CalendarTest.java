package com.ccjjltx.date.calendar;

import java.util.Calendar;

/**
 * Created by ccjjltx on 2017/3/7.
 *
 * @author ccj
 * @version 1.0
 */
public class CalendarTest {
    public static void main(String[] args) {
        testfiled();
        addroll();
        //容错函数
        testLenient();
        testlazy();
    }

    private static void testfiled() {
        Calendar c = Calendar.getInstance();
        //取出年
        System.out.println(c.get(Calendar.YEAR));
        //取出月
        System.out.println(c.get(Calendar.MONTH));//从0开始//2
        //取出日
        System.out.println(c.get(Calendar.DATE));
        //分别设置年月日小时分钟秒
        c.set(2014, 9, 13, 22, 21, 23);
        System.out.println(c.getTime());//Mon Oct 13 22:21:23 CST 2014
        //将Calendar的年前推1年
        c.add(Calendar.YEAR, -1);
        System.out.println(c.getTime());//Sun Oct 13 22:21:23 CST 2013
        //将月推前10月
        c.add(Calendar.MONTH, -10);
        System.out.println(c.getTime());//Thu Dec 13 22:21:23 CST 2012
    }

    private static void addroll() {
        System.out.println("====================================");
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2017, 7, 31, 0, 0, 0);
        cal1.add(Calendar.MONTH, -6);
        System.out.println(cal1.getTime());//Tue Feb 28 00:00:00 CST 2017//天数会自动修改变化最小值
        cal1.roll(Calendar.MONTH, 8);
        System.out.println(cal1.getTime());//Sat Oct 28 00:00:00 CST 2017//不会进位修改
    }

    /**
     * 宽容函数，自动容错
     * 有两种解释日历字段的模式：lenient模式和non-lenient模式。但Calendar处于lenient模式时，每个时间字段可接受允许范围的值
     * 但Calendar处于non-lenient模式时，如果为某个时间字段设置的值超出了它允许的取值范围，程序将会抛出异常
     */
    private static void testLenient() {
        Calendar cal = Calendar.getInstance();
        //结果是YEAR字段加1
        cal.set(Calendar.MONTH, 13);
        System.out.println(cal.getTime());
        //关闭容错
        cal.setLenient(false);
        //cal.set(Calendar.MONTH,13);//会错
    }

    /**
     * set(f,value)方法具有延迟性，修改的时候尽管日历字段f是立即更改的，但该Calendar所代表的时间却不会立即修改
     * 知道下次调用get(),getTime(),getTimeInMillis(),add()或roll()时才能重新计算日历的时间
     * 采用延迟修改的优势是多次调用set()不会触发多次不必要的计算
     */
    private static void testlazy() {
        System.out.println("===================================");
        Calendar cal = Calendar.getInstance();
        cal.set(2017, 7, 31);
        //将月份设成9，但9月31日不存在
        //如果修改会自动调到10.1
        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DATE, 5);
        //因为延迟性，所以在还没有修改成10.1之前还是用9.31来计算
        System.out.println(cal.getTime());//Sun Mar 05 22:58:17 CST 2017
    }
}