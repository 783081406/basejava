/**
 * Created by ccjjltx on 2017/4/3.
 * TimeZone
 * 抽象方法
 * <p>
 * 可以使用gettimezone随着时区ID，例如得到一个时区，例如得到一个时区，为美国太平时区的失去ID是"America/Los_Angeles",所以得到
 * 一个美国太平洋时区对象
 * TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
 * <p>
 * 字段：
 * static int  LONG:使用getDisplayName()时得到"Pacific Standard Time"（太平洋标准时间）
 * static int  SHORT:使用getDisplayName()时得到"PST"
 * 函数：
 * Object  clone():
 * static String[]  getAvailableIDs():获得所有可支持的ID
 * static String[]	getAvailableIDs(int rawOffset):根据给定的时区偏移（以毫秒为单位）获取可用ID
 * static TimeZone	getDefault():获取Java虚拟机的默认TimeZone
 * String  getDisplayName():返回适合在默认语言环境中向用户呈现的此TimeZone的长标准时间名称
 * String  getDisplayName(boolean daylight, int style):返回此TimeZone指定样式的名称，该名称适用于以默认语言环境向用户呈现
 * String  getDisplayName(boolean daylight, int style, Locale locale):返回此TimeZone指定样式的名称，以适合在指定的语言环境中呈现给用户
 * String  getDisplayName(Locale locale):返回此TimeZone的长标准时间名称，适合在指定的区域设置中呈现给用户
 * int  getDSTSavings():返回添加到本地标准时间以获取本地挂钟时间的时间量
 * String  getID():获取此时区的ID
 * abstract int	getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds):获取当前日期的时区偏移，在夏令时情况下进行修改
 * int  getOffset(long date):在指定的日期返回此时区与UTC的偏移量
 * abstract int	getRawOffset():返回添加到UTC的时间（以毫秒为单位），以获得此时区的标准时间
 * static TimeZone	getTimeZone(String ID):
 * static TimeZone	getTimeZone(ZoneId zoneId):
 * boolean	hasSameRules(TimeZone other):如果此区域具有与其他区域相同的规则和偏移量，则返回true。
 * abstract boolean	inDaylightTime(Date date):查询给定日期是否在此时区的夏令时
 * boolean	observesDaylightTime()：如果此TimeZone当前处于夏令时，或如果将来任何时候发生从标准时间到夏令时的转换，则返回true
 * static void  setDefault(TimeZone zone)：
 * void	setID(String ID)：
 * abstract void  setRawOffset(int offsetMillis)：将基准时区偏移设置为GMT
 * ZoneId  toZoneId()：将此TimeZone对象转换为ZoneId
 * abstract boolean	useDaylightTime()：查询此TimeZone是否使用夏令时
 * <p>
 * <p>
 * ZoneId
 * 一个zone Id,类似于Europe/Paris（欧洲/巴黎）
 * ZoneId用于标识用于在Instant和LocalDateTime之间转换的规则。有两种不同类型的ID：
 * static Map<String,String>	SHORT_IDS：一个zone的map覆盖可使用的short time-zone名称
 * boolean  equals(Object obj)：
 * static ZoneId  from(TemporalAccessor temporal):从temporal获得了一个zoneid的对象
 * static Set<String>  getAvailableZoneIds():
 * String  getDisplayName(TextStyle style, Locale locale):得到这个zone的区域代表，例如'British Time' or '+02:00'
 * abstract String  getId():获得唯一的time-zone ID
 * abstract ZoneRules  getRules():获取此ID的时区规则，允许执行计算
 * int  hashCode():
 * ZoneId  normalized():规范的时区ID，尽可能返回一个提供的Zone
 * static ZoneId  of(String zoneId):从ID获取ZoneId的实例，确保该ID有效并且可以使用
 * static ZoneId  of(String zoneId, Map<String,String> aliasMap):使用其ID使用别名映射获取ZoneId的实例，以补充标准区域ID
 * static ZoneId  ofOffset(String prefix, ZoneOffset offset):获取包含偏移量的ZoneId的实例
 * static ZoneId  systemDefault():
 * String	toString()
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.date.timezone;