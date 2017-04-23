/**
 * Created by ccjjltx on 2017/4/23.
 * 实现一个多线程的下载工具
 * <p>
 * 解决思路：
 * 1.创建URL对象
 * 2.获取指定URL对象所指向资源的大小(通过getConnectionLength()方法获得)
 * 3.在本地磁盘上创建一个与网络资源具有相同大小的空文件
 * 4.计算每个线程应该下载网络的哪个部分（从哪个字节开始，到哪个字节结束）
 * 5.依次创建、启动多个线程来下载网络资源的指定部分
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.network.url.download;