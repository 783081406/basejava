/**
 * Created by ccjjltx on 2017/4/23.
 * URL类提供了多个构造器用于创建URL对象，一旦获得了URL对象之后，就可以调用如下方法来访问URL对应的资源
 * String getFile():获取该URL的资源名
 * String getHost():获取该URL的主机名
 * String getPath():获取该URL的路径部分
 * int getPort():获取该URL的端口号
 * String getProtocol():获取该URL的协议名称
 * String getQuery():获取该URL的查询字符串部分
 * URLConnection openConnection():返回一个URLConnection对象，它代表了与URL所引用的远程对象的连接
 * InputStream openStream():打开与此URL的连接，并返回一个用于读取该URL资源的InputStream
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.network.url;