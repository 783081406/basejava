/**
 * Created by ccjjltx on 2017/4/2.
 * MessageFormat:
 * 带占位符的消息
 * 内部类:
 * static class MessageFormat.Field
 * 构造器：
 * MessageFormat(String pattern):
 * MessageFormat(String pattern,Locale locale):
 * 函数:
 * void	applyPattern(String pattern):设置此消息格式使用的模式
 * Object  clone():
 * boolean	equals(Object obj):
 * StringBuffer	format(Object[] arguments, StringBuffer result, FieldPosition pos):格式化一个对象数组，并将MessageFormat的格式
 * （格式化元素替换为格式化的对象）附加到提供的StringBuffer。
 * StringBuffer	format(Object arguments, StringBuffer result, FieldPosition pos):
 * static String  format(String pattern, Object... arguments):
 * AttributedCharacterIterator	formatToCharacterIterator(Object arguments):格式化一个对象数组，并将它们插入到MessageFormat
 * 的模式中，生成一个AttributedCharacterIterator。
 * Format[]	getFormats():获取用于先前设置的模式字符串中的格式元素的格式
 * Format[]	getFormatsByArgumentIndex():获取用于传递给格式方法或从解析方法返回的值所使用的格式
 * Locale  getLocale():获取创建或比较子格式时使用的区域设置
 * int	hashCode():
 * Object[]	parse(String source):从给定字符串的开头解析文本以产生一个对象数组
 * Object[]	parse(String source, ParsePosition pos):
 * Object	parseObject(String source, ParsePosition pos):从字符串中解析文本以生成对象数组
 * void	setFormat(int formatElementIndex, Format newFormat):设置在先前设置的模式字符串中使用具有给定格式元素索引的格式元素的格式
 * void	setFormatByArgumentIndex(int argumentIndex, Format newFormat):设置使用给定参数索引的先前设置的模式字符串中的格式元素的格式
 * void	setFormats(Format[] newFormats):设置用于先前设置的模式字符串中的格式元素的格式。
 * void	setFormatsByArgumentIndex(Format[] newFormats):设置用于传递给格式方法或从解析方法返回的值的格式。
 * void	setLocale(Locale locale):设置创建或比较子格式时要使用的区域设置
 * String  toPattern():返回表示消息格式的当前状态的模式
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.i18n.messageformat;