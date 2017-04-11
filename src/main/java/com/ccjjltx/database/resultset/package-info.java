/**
 * Created by ccjjltx on 2017/4/11.
 * public interface ResultSet extends Wrapper,AutoCloseable;
 * 通过移动记录指针来取出结果集的内容。
 * 除此之外，还可以通过ResultSet来更新记录，并提供了ResultSetMetaData来获得ResultSet对象的相关信息
 * java5以后，默认打开的ResultSet就是可滚动的，无须传入额外的参数。
 * 以默认方式打开的ResultSet是不可更新的。如果希望创建更新的ResultSet需要在Statement或PreparedStatement传入额外参数：
 * ResultSet.TYPE_FORWARD_ONLY:该常量控制记录指针只能向前移动。是java4以前的默认值
 * ResultSet.TYPE_SCROLL_INSENSITIVE:该常量控制记录指针可以自由移动（可滚动结果集），但底层数据的改变不会影响ResultSet的内容
 * ResultSet.TYPE_SCROLL_SENSITIVE:该常量控制记录指针可以自由移动（可滚动结果集），而且底层数据的改变会影响ResultSet的内容
 * <p>
 * resultSetConCurrency:控制ResultSet的并发类型，该参数可以接收两个值：
 * ResultSet.CONCUR_READ_ONLY:该常量提示ResultSet是只读的并发模式（默认）：
 * ResultSet.CONCUR_UPDATEBALE:该常量提示ResultSet是可更新的并发模式。
 * <p>
 * 创建可读可更新的对象：
 * Statement sm=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
 * PreparedStatement ps=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
 * <p>
 * 可更新的结果集还需要满足两个条件：
 * 所有的额数据都应该来自一个表
 * 选出的数据集必须包含组件列
 * <p>
 * 程序可调用ResultSet的updateXxx(int columnIndex,Xxx value)方法来修改记录指针所指记录、特定列的值
 * 最后调用ResultSet的updateRow()方法来提交修改
 * java8新增：
 * updateObject(String columnLabel,Object x,SQLType targetSqlType)和updateObject(int columnIndex,Object x,SQLType targetSqlType)
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.database.resultset;