/**
 * Created by ccjjltx on 2017/4/2.
 * 内部类：
 * static class Locale.Builder:Builder用于根据setter配置的值构建Locale的实例
 * static class Locale.Category:Enum for locale categories
 * static class Locale.FilteringMode:此枚举提供常量来选择区域设置匹配的过滤模式
 * static class Locale.LanguageRange:该类表示在RFC 4647“语言标签匹配”中定义的语言范围
 * 构造函数：
 * Locale(String language)
 * Locale(String language,String country)
 * Locale(String language,String country,String variant)
 * 方法：
 * Object clone():
 * boolean equals(Object obj)
 * static List<Locale>	filter(List<Locale.LanguageRange> priorityList, Collection<Locale> locales):使用RFC 4647中定义的过滤机制返回
 * 匹配的Locale实例列表
 * static List<Locale>	filter(List<Locale.LanguageRange> priorityList, Collection<Locale> locales, Locale.FilteringMode mode):
 * 使用RFC 4647中定义的过滤机制返回匹配的Locale实例列表
 * static List<String>	filterTags(List<Locale.LanguageRange> priorityList, Collection<String> tags):使用RFC 4647中定义的
 * 基本过滤机制返回匹配语言标签的列表
 * static List<String>	filterTags(List<Locale.LanguageRange> priorityList, Collection<String> tags, Locale.FilteringMode mode):
 * 使用RFC 4647中定义的基本过滤机制返回匹配语言标签的列表
 * static Locale	forLanguageTag(String languageTag):返回指定的IETF BCP 47语言标记字符串的语言环境
 * static Locale[]	getAvailableLocales():返回所有已安装区域设置的数组
 * String  getCountry():返回此区域设置的国家/地区代码，该代码应为空字符串，大写ISO 3166 2字母代码或UN M.49 3位代码
 * static Locale	getDefault():获取Java虚拟机的此实例的默认语言环境的当前值
 * static Locale	getDefault(Locale.Category category):获取Java虚拟机的此实例的指定类别的默认语言环境的当前值
 * String getDisplayCountry():返回适合显示给用户的区域设置国家/地区的名称
 * String  getDisplayCountry(Locale inLocale):返回适合显示给用户的区域设置国家/地区的名称
 * String  getDisplayLanguage():返回适合显示给用户的语言环境语言的名称
 * String  getDisplayLanguage(Locale inLocale):返回适合显示给用户的语言环境语言的名称
 * String  getDisplayName():返回适合显示给用户的区域设置的名称
 * String  getDisplayName(Locale inLocale):返回适合显示给用户的区域设置的名称
 * String  getDisplayScript():返回适合显示给用户的区域设置脚本的名称
 * String  getDisplayScript(Locale inLocale):返回适合显示给用户的区域设置脚本的名称
 * String  getDisplayVariant():返回适合显示给用户的区域设置变体代码的名称
 * String  getDisplayVariant(Locale inLocale):返回适合显示给用户的区域设置变体代码的名称
 * String  getExtension(char key):返回与指定键相关联的扩展名（或私有使用）值，如果没有与密钥关联的扩展名，则返回null
 * Set<Character>  getExtensionKeys():返回与此区域设置关联的一组扩展键，如果没有扩展名则返回空集
 * String  getISO3Country():返回此区域设置的国家/地区的三个字母的缩写
 * String  getISO3Language():返回此语言环境的三个字母缩写
 * static String[]	getISOCountries():返回ISO 3166中定义的所有2个字母的国家/地区代码的列表
 * static String[]	getISOLanguages():返回ISO 639中定义的所有2个字母的语言代码的列表
 * String  getLanguage():返回此区域设置的语言代码
 * String  getScript():返回此语言环境的脚本，该脚本应为空字符串或ISO 15924 4字母脚本代码
 * Set<String>	getUnicodeLocaleAttributes():返回与此区域设置相关联的unicode区域设置属性集，如果没有属性则返回空集合
 * Set<String>	getUnicodeLocaleKeys():返回此区域设置定义的Unicode区域设置键的集合，如果此区域设置没有，则返回空集合
 * String  getUnicodeLocaleType(String key):返回与该区域设置的指定Unicode区域设置键相关联的Unicode区域设置类型
 * String  getVariant():返回此区域设置的变体代码
 * boolean	hasExtensions():如果此区域设置有任何扩展名，则返回true
 * int	hashCode():
 * static Locale  lookup(List<Locale.LanguageRange> priorityList, Collection<Locale> locales):使用RFC 4647中定义的查找机制
 * 返回最佳匹配语言标签的Locale实例
 * static String  lookupTag(List<Locale.LanguageRange> priorityList, Collection<String> tags):使用RFC 4647中定义的查找机制返回最匹配的语言标签
 * static void	setDefault(Locale.Category category, Locale newLocale):为Java虚拟机的此实例设置指定类别的默认语言环境
 * static void	setDefault(Locale newLocale):设置Java虚拟机的此实例的默认语言环境
 * Locale	stripExtensions():返回没有扩展名的此区域设置的副本
 * String	toLanguageTag():返回一个格式正确的IETF BCP 47语言标签，代表这个区域
 * String	toString():返回此语言环境对象的字符串表示形式，由语言，国家/地区，变体，脚本和扩展名组成，
 * 如下所示：language +“_”+ country +“_”+（variant +“_＃”|“＃”）+ script +“ - ”+扩展语言总是小写，国家总是大写，脚本总是标题大小写，扩展总是小写。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.i18n.l10n;