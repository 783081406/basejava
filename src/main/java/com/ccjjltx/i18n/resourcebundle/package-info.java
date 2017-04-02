/**
 * Created by ccjjltx on 2017/4/2.
 * ResourceBundle:
 * static void	clearCache():从使用调用者的类加载器加载的缓存中删除所有资源束
 * static void	clearCache(ClassLoader loader):从使用给定的类加载器加载的缓存中删除所有资源束
 * boolean  containsKey(String key):确定给定的键是否包含在此ResourceBundle或其父包中
 * String  getBaseBundleName():返回这个bundle基本的名字，如果没有则返回null
 * static ResourceBundle  getBundle(String baseName)：使用指定的基本名称，默认语言环境和调用者的类加载器获取资源包
 * static ResourceBundle  getBundle(String baseName, Locale locale)：
 * static ResourceBundle  getBundle(String baseName, Locale locale, ClassLoader loader)：
 * static ResourceBundle  getBundle(String baseName, Locale targetLocale, ClassLoader loader, ResourceBundle.Control control)
 * static ResourceBundle  getBundle(String baseName, Locale targetLocale, ResourceBundle.Control control)：
 * static ResourceBundle  getBundle(String baseName, ResourceBundle.Control control)：
 * abstract Enumeration<String>	getKeys()：（之后可以使用nextElement与getString(String key)配套使用）
 * Locale  getLocale()：
 * Object  getObject(String key)：
 * String  getString(String key)：
 * protected abstract Object	handleGetObject(String key)：
 * protected Set<String>  handleKeySet()：Returns a Set of the keys contained only in this ResourceBundle
 * Set<String>	keySet()：
 * protected void  setParent(ResourceBundle parent)：设置此bundle的父bundle
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.i18n.resourcebundle;