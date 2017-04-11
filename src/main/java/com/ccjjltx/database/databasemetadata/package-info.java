/**
 * Created by ccjjltx on 2017/4/11.
 * DatabaseMetaData来封装数据库连接对应数据库的信息，通过Connection提供的getMetaData()方法获得对象
 * 该接口通常由驱动程序提供商提供实现，其目的是让用户了解底层数据库的相关信息。使用该接口的目的是发现如果处理底层数据库，尤其
 * 是对于试图与多个数据库一起使用的应用程序——因为应用程序需要在多个数据库之间切换，所以必须利用该接口来找出底层数据库的功能，
 * 例如:
 * 调用supportsCorrelatedSubqueries()方法查看是否可以使用关联子查询
 * 或者调用supportBatchUpdates()方法查看是否可以使用批量更新。
 * <p>
 * 许多DatabaseMetaData方法以ResultSet对象的形式返回查询信息，然后使用ResultSet的常规方法（如getString()和getInt())获取数据
 * 如果查询的信息不可用，则返回一个空ResultSet对象
 * <p>
 * DatabaseMetaData许多方法都需要传入一个xxxPattern，这里xxxPattern不是正则表达式，而是SQL里的模式字符串，即用百分号(%)任意多个字符，
 * 使用下划线(_)代表一个字符。在通常情况下，如果把该模式字符串的参数值设置为null，即表明该参数不作为过滤条件
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.database.databasemetadata;