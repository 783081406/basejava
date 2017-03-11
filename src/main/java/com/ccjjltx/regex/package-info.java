/**
 * Created by ccjjltx on 2017/3/11.
 * 用static Pattern.compile()方法来编译你的正则表达式即可。
 * 他会根据你的String该类型的正则表达式生成一个Pattern对象。
 * 接下来，把你想要检索的字符串传入Pattern对象的matcher()方法
 * matcher()方法会生成一个Matcher对象
 * <p>
 * Matcher类里几个常用方法：
 * boolean find():返回目标字符串中是否包含与Pattern匹配的子串
 * String group():返回上一次与Pattern匹配的子串
 * int start():返回上一次与Pattern匹配的子串在目标字符串中的开始位置
 * int end():返回上一次与Pattern匹配的子串在目标字符串中的结束位置加1
 * boolean lookingAt():返回目标字符串前面部分与Pattern是否匹配
 * boolean matches():返回整个目标字符串与Pattern是否匹配
 * Matcher reset():将现有的Matcher对象应用于一个新的字符序列
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.regex;