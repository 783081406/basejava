/**
 * Created by ccjjltx on 2017/4/8.
 * DateTimeFormatter不仅可以将日期、时间对象格式化成字符串，也可以将特定格式的字符串解析成日期、时间对象
 * 获取DateTimeFormatter对象常见三种方式：
 * 直接使用静态常量创建DateTimeFormatter格式器。DateTimeFormatter类中包含了大量形如ISO_LOCAL_DATE,ISO_LOCAL_TIME,ISO_LOCAL_DATE_TIME等
 * 静态常量，这些静态常量本身就是DateTimeFormatter实例
 * 使用代表不同风格的枚举值来创建DateTimeFormatter格式器。在FormatStyle枚举类中定义了FULL、LONG、MEDIUM、SHORT四个枚举值，
 * 它们代表日期、时间的不同风格
 * 根据模式字符串来创建DateTimeFormatter格式器。类似于SimpleDateFormat。可以采用模式字符串来创建DateTimeFormatter
 * 使用DateTimeFormatter将日期、时间（LocalDate、LocalDateTime、LocalTime等实例）格式化为字符串，两种方式：
 * 1.调用DateTimeFormatter的format(TemporalAccessor temporal)方法执行格式化，其中LocalDate、LocalDateTime、LocalTime等类都是
 * TemporalAccessor接口的实现类
 * 2.调用LocalDate、LocalDateTime、LocalTime等日期、时间对象的format(DateTimeFormatter formatter)方法执行格式化
 * <p>
 * 将指定格式的字符串解析成日期、时间对象（LocalDate、LocalDateTime、LocalTime等实例），可以通过日期、时间对象提供的
 * parse(CharSequence text,DateTimeFormatter formatter)方法进行解析
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.format.datetimeformatter;