/**
 * Created by ccj on 2017/2/13.
 * Runtime类代表Java程序的运行时环境，每个Java程序都有一个对应的Runtime实例，应用程序通过该对象与其运行时环境相连。
 * 应用程序不能创建自己的Runtime实例，但是可以通过getRuntime()方法获得与之关联的Runtime对象
 * 与System类似的是，Runtime类也提供了gc()方法和runFinalization()方法来通知系统进行垃圾回收、清理系统资源，
 * 并提供load(String filename)和loadLibrary(String libname)方法来加载文件和动态链接库
 * Runtime类代表Java程序的运行时环境，可以访问JVM相关的信息，如处理器数量，内存信息等
 * @author ccj
 * @version 1.0-SHAPSHOT
 */
package com.ccjjltx.runtime;