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
 * <p>
 * 设置或增加通用头字段
 * setRequestProperty(String key,String value):设置该URLConnection的key请求头字段的值为value.如:conn.setRequestProperty("accept","/")
 * addRequestProperty(String key,String value):为该URLConnection的key请求头字段增加value值,该方法并不会覆盖原来请求头字段的值，而是将
 * 新值追加到原请求头字段中
 * <p>
 * 当远程资源可用之后，程序可以使用下面方法来访问头部字段和内容
 * Object getContent():获取该URLConnection的内容
 * String getHeaderField(String name):获取制定响应头字段的值
 * getInputStream():返回该URLConnection对应的输入流，用于获取URLConnection相应的内容
 * getOutputStream():返回该URLConnection对应的输出流，用于想URLConnection发送请求参数
 * getHeaderField()方法用于根据响应头字段来返回对应的值.而某些头字段由于经常需要访问，所以Java提供下面几个方法来访问特定相应头字段的值
 * getContentEncoding():获取content-encoding响应头字段的值
 * getContentLength():获取content-length响应头字段的值
 * getContentType():获取content-type响应头字段的值
 * getDate():获取date响应头字段的值
 * getExpiration();获取expires响应头字段的值
 * getLastModified():获取last-modified响应头字段的值。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.network.getpost;