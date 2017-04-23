/**
 * Created by ccjjltx on 2017/4/23.
 * URLDecoder和URLEncoder用于完成普通字符串和application/x-www-from-urlencoded MIME字符串之间的相互转换
 * 使用搜索引擎的时候关键字包含中文，就会在URL中出现"乱码",这就是application/x-www-form-urlencoded MIME字符串
 * <p>
 * URLDecoder类包含一个decode(String s,String enc)静态方法，它可以将看上去是乱码的特殊字符串转换成普通字符串
 * URLEncoder类包含一个encode(String s,String enc)静态方法，他可以将普通字符串转换成application/x-www.form-urlencoded MIME字符串
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.network.urlxxx;