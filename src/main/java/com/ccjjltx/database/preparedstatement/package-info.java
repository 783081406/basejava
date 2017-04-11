/**
 * Created by ccjjltx on 2017/4/11.
 * PreparedStatement也提供了execute(),executeUpdate(),executeQuery()三个方法来执行SQL语句，不过这三个方法无须参数，因为PreparedStatement
 * 已存储了预编译的SQK语句
 * <p>
 * 如果程序不清楚预编译SQL语句中的各参数的类型，则可以使用setObject()方法来传入参数，由PreparedStatement来负责类型转换
 * <p>
 * 其中有个很好的作用就是防止SQL注入
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.database.preparedstatement;