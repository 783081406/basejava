/**
 * Created by ccjjltx on 2017/4/23.
 * URLConnection：应用程序与URL之间的通信连接
 * HttpURLConnection：URL之间的HTTP连接
 * <p>
 * 创建一个URL的连接，并发送请求、读取此URL引用的资源需要的几个步骤：
 * 1.通过调用URL对象的openConnection()方法来创建URLConnection对象
 * 2.设置URLConnection的参数和普通请求属性
 * 3.如果只是发送GET方式请求，则使用connect()方法建立和远程资源之间的实际连接即可；如果需要发送POST方式的请求，则需要获
 * 取URLConnection实例对应的输入流读取远程资源的数据
 * 4.远程资源变成可用，程序可以访问远程资源的头字段或通过输入流读取远程资源的数据
 * <p>
 * 在建立和远程资源的实际连接之前，程序可以通过如下方法来设置请求头字段
 * setAllowUserInteraction():设置该URLConnection的allowUserInteraction请求头字段的值
 * setDoInput():设置该URLConnection的doInput请求头字段的值
 * setDoOutput():设置该URLConnection的doOutput请求头字段的值
 * setIfModifiedSince():设置该URLConnection的ifModifiedSince请求头部字段的值
 *
 * 设置或增加通用头字段
 * setRequestProperty(String key,String value):
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.network.getpost;