/**
 * Created by ccjjltx on 2017/4/11.
 * public interface ResultSetMetaData extends Wrapper;
 * MetaData的意思是元数据，即描述其他数据的数据，因此ResultSetMetaData对象。一旦获得了ResultSetMetaData对象，就可通过ResultSetMetaData
 * 提供的大量方法来返回ResultSet的描述信息。常用方法三个：
 * int  getColumnCount():返回该ResultSet的列数量。
 * String getColumnName(int column):返回指定索引的列名
 * int getColumnType（int column):返回指定索引的列类型
 * 例如:
 * ResultSet rs=stmt.executeQuery("select a,b,c from table2");
 * ResultSetMetaData rsmd=rs.getMetaData();
 * int numberOfColumns=rsmd.getColumnCount();
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.database.resultsetmetadata;