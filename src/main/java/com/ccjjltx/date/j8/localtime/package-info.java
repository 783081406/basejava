/**
 * Created by ccjjltx on 2017/4/4.
 * 该类代表不带时区的时间，例如10:15:30.该类提供了静态的now()方法来获取当前时间
 * 也提供了静态的now(Clock clock)方法来获取clock对应的时间。除此之外，它还提供了minusXxx()方法在当前年份基础上减去几小时、
 * 几分、几秒等，也提供了plusXxx()方法在当前年份基础上加上几小时、几分、几秒等。
 * 和LocalDate基本类似，只是将对年月日的操作转换为时分秒
 * toSecondOfDay()获取该时间点距离0:00的秒数
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.j8.localtime;