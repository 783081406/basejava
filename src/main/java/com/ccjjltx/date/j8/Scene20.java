package com.ccjjltx.date.j8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

/**
 * Created by ccjjltx on 2017/4/4.
 *
 * @author ccj
 * @version 1.0
 */
public class Scene20 {
    public static void main(String[] args) {
        scene1();
        scene2();
        scene3();
        scene4();
        scene5();
        scene6();
        scene7();
        scene8();
        scene9();
        scene10();
        scene11();
        scene12();
        scene13();
        scene14();
        scene15();
        scene16();
        scene17();
        scene18();
        scene19();
        scene20();
    }

    /**
     * 获取当天日期
     */
    private static void scene1() {
        LocalDate today = LocalDate.now();
        System.out.println("Today is Local date:" + today);//Today is Local date:2017-04-04
    }

    /**
     * 获取当前的年月日
     */
    private static void scene2() {
        System.out.println("================================================");
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println("Year=" + year + ",Month=" + month + ",Day=" + day);//Year=2017,Month=4,Day=4
    }

    /**
     * 获取某个特定的时间
     */
    private static void scene3() {
        System.out.println("===============================");
        LocalDate dateOfBirth = LocalDate.of(2017, 1, 1);
        System.out.println("Your Date of birth is :" + dateOfBirth);
    }

    /**
     * 检查两个日期是否相等
     * 场景：判断静态是不是某个特殊的日子，比如说生日啊，周年纪念日啊，或者假期等
     */
    private static void scene4() {
        System.out.println("===============================");
        LocalDate date1 = LocalDate.of(2017, 4, 4);
        if (date1.equals(LocalDate.now())) {
            System.out.println("今天是清明节");
        }
    }

    /**
     * 检查重复事件
     * 比如说每月的账单日，结婚纪念日，每月的还款日或者每年交保险的额日子。
     * 如果是电商工作会去给用户发送生日祝福并且在每个重要的节假日给他们捎去问候
     */
    private static void scene5() {
        System.out.println("===============================");
        LocalDate dateOfBirth = LocalDate.of(2017, 4, 4);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(LocalDate.now());
        if (currentMonthDay.equals(birthday)) {
            System.out.println("XXX今天生日");
        } else {
            System.out.println("Sorry,today is not your birthday");
        }
    }

    /**
     * 获取当前时间
     */
    private static void scene6() {
        System.out.println("===============================");
        LocalTime time = LocalTime.now();
        System.out.println("local time now:" + time);//local time now:20:50:58.136
    }

    /**
     * 增加时间里的小时数
     * 由于是不可变且线程安全的类，所以要另外存储
     */
    private static void scene7() {
        LocalTime time = LocalTime.now();
        LocalTime newTime = time.plusHours(2);
        System.out.println("Time after 2 hours :" + newTime);
    }

    /**
     * 获取一周后的日期
     */
    private static void scene8() {
        System.out.println("===============================");
        LocalDate now = LocalDate.now();
        LocalDate nextWeek = now.plus(1, ChronoUnit.WEEKS);
        System.out.println("Today is :" + now);//Today is :2017-04-04
        System.out.println("Date after 1 week:" + nextWeek);//Date after 1 week:2017-04-11
    }

    /**
     * 一年后的日期
     */
    private static void scene9() {
        System.out.println("==========================================");
        LocalDate previousYear = LocalDate.now().minus(1, ChronoUnit.YEARS);
        System.out.println("Date before 1 year :" + previousYear);//Date before 1 year :2016-04-04
        LocalDate nextYear = LocalDate.now().plus(1, ChronoUnit.YEARS);
        System.out.println("Date of after 1 year :" + nextYear);//Date of after 1 year :2018-04-04
    }

    /**
     * 使用时钟
     */
    private static void scene10() {
        System.out.println("=====================================");
        System.out.println(Clock.systemUTC());
        System.out.println(Clock.systemDefaultZone());
    }

    /**
     * 判断某个日期是在另一个日期的前面还是后面
     */
    private static void scene11() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = LocalDate.of(2014, 1, 15);
        if (tomorrow.isAfter(today)) {
            System.out.println("Tomorrow comes after today");
        }
        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
        if (yesterday.isBefore(today)) {
            System.out.println("Yesterday is day before today");
        }
    }

    /**
     * 处理不同时区
     */
    private static void scene12() {
        System.out.println("===========================================");
        LocalDateTime localtDateAndTime = LocalDateTime.now();
        ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localtDateAndTime, ZoneId.of("Asia/Shanghai"));
        System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);
    }

    /**
     * 固定日期，比如信用卡过期时间
     */
    private static void scene13() {
        System.out.println("==========================================");
        YearMonth currentYearMonth = YearMonth.now();
        System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2018, Month.FEBRUARY);
        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
    }

    /**
     * 检查是否是闰年
     */
    private static void scene14() {
        System.out.println("==========================================");
        LocalDate today = LocalDate.now();
        if (today.isLeapYear()) {
            System.out.println("This year is Leap year");
        } else {
            System.out.println(today.getYear() + "is not a Leap year");
        }
    }

    /**
     * 两个日期之间包含多少天，多少个月
     */
    private static void scene15() {
        System.out.println("==========================================");
        LocalDate today = LocalDate.now();
        LocalDate java8Release = LocalDate.of(2014, Month.MARCH, 14);
        Period periodToNextJavaRelease = Period.between(today, java8Release);
        System.out.println("Years left between today and Java 8 release : " + periodToNextJavaRelease.getYears());
        System.out.println("Months left between today and Java 8 release : " + periodToNextJavaRelease.getMonths());
        System.out.println("Days left between today and Java 8 release : " + periodToNextJavaRelease.getDays());
        /*
        Years left between today and Java 8 release : -3
        Months left between today and Java 8 release : 0
        Days left between today and Java 8 release : -21
         */

    }

    /**
     * ZoneOffset类来代表某个时区，比如印度是GMT或者UTC5：30，可以使用它的静态方法ZoneOffset.of()方法来获取对应的时区。
     * 只要获取到了这个偏移量，可以拿LocalDateTime和这个偏移量创建出一个OffsetDateTime
     */
    private static void scene16() {
        System.out.println("==========================================");
        LocalDateTime datetime = LocalDateTime.of(2014, Month.JANUARY, 14, 19, 30);
        ZoneOffset offset = ZoneOffset.of("+05:30");
        OffsetDateTime date = OffsetDateTime.of(datetime, offset);
        System.out.println("Date and Time with timezone offset in Java : " + date);
    }

    /**
     * 获取当前时间戳
     */
    private static void scene17() {
        System.out.println("==========================================");
        Instant timestamp = Instant.now();
        System.out.println("What is value of this instant " + timestamp);
    }

    /**
     * 使用预定义的格式器来对日期进行解析/格式化
     * SimpleDateFormat并不是线程安全的，而如果用作本地变量来格式化的话又显得有些笨重
     */
    private static void scene18() {
        System.out.println("==========================================");
        String dayAfter = "20170405";
        LocalDate formatted = LocalDate.parse(dayAfter, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.printf("Date generated from String %s is %s %n", dayAfter, formatted);
    }

    /**
     * 使用自定义的格式器来解析日期
     */
    private static void scene19() {
        String goodFriday = "Apr 04 2017";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");
            LocalDate holiday = LocalDate.parse(goodFriday, formatter);
            System.out.printf("Successfully parsed String %s, date is %s%n", goodFriday, holiday);
        } catch (DateTimeParseException ex) {
            System.out.printf("%s is not parsable!%n", goodFriday);
            ex.printStackTrace();
        }
    }

    /**
     * 日期进行格式化，转换成字符串
     */
    private static void scene20() {
        LocalDateTime arrivalDate = LocalDateTime.now();
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm a");
            String landing = arrivalDate.format(format);
            System.out.printf("Arriving at : %s %n", landing);
        } catch (DateTimeException ex) {
            System.out.printf("%s can't be formatted!%n", arrivalDate);
            ex.printStackTrace();
        }
    }
}
