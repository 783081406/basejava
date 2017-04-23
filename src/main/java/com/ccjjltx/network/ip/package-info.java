/**
 * Created by ccjjltx on 2017/4/23.
 * InetAddress类来代表IP地址，两个子类：Inet4Address、Inet6Address,分别Internet Protocol version 4(IPv4)地址和Internet Protocol version(IPv6)地址
 * InetAddress没有构造器，只提供静态方法来获取InetAddress实例：
 * getByName(String host):根据主机获取对应的InetAddress对象
 * getByAddress(byte[] addr):根据原始IP地址来获取对应的InetAddress对象
 * getLocalHost()获取本机IP地址对应的InetAddress实例
 * <p>
 * 提供三个方法来获取InetAddress实例对应的IP地址和主机名：
 * String getCanonicalHostName():获取此IP地址的全限定域名。
 * String getHostAddress():返回此InetAddress实例对应的IP地址字符串(一字符串形式).
 * String getHostName():获取此IP地址的主机名。
 *
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.network.ip;