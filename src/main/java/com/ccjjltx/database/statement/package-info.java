/**
 * Created by ccjjltx on 2017/3/27.
 * statement主要有三个函数：
 * ResultSet executeQuery(String sql):
 * int executeUpdate(String sql):
 * boolean execute(String sql):
 *
 * all method:
 * void addBatch(String sql):将给定的SQL命令添加到此语句对象的当前命令列表中
 * void cancel():取消这个语句对象如果DBMS和驱动支持中止一个SQL语句
 * void clearBatch():清空此语句对象的SQL命令的当前列表
 * void clearWarnings():清除此语句对象上报告的所有警告
 * void close():
 * int[] executeBatch():将一批命令提交到数据库执行，如果所有命令成功执行，返回一个更新计数的数组。
 * Connection getConnection():
 * int getFetchDirection():检索从数据库表获取行的方向，该表是从该语句对象生成的结果集的默认值。
 * int getFetchSize():检索结果集的行，是默认取ResultSet对象从这个声明对象生成的数。
 * ResultSet getGeneratedKeys():检索执行此语句对象的结果生成的任何自动生成的密钥
 * int getMaxFieldSize():检索字节可以返回字符和二进制在ResultSet对象的陈述对象产生的列值的最大数量。
 * int getMaxRows():检索一个ResultSet对象的声明对象可以包含的最大行数。
 * int getQueryTimeout():检索驱动程序将等待语句对象执行的秒数。
 * ResultSet getResultSet():
 * int getResultSetConcurrency():检索ResultSet的对象的Statement对象生成的结果集的并发。
 * ...
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.database.statement;