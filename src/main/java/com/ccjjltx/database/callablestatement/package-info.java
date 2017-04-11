/**
 * Created by ccjjltx on 2017/4/11.
 * public interface CallableStatement extends PreparedStatement
 * 调用存储过程使用CallableStatement,通过Connection的prepareCall()方法来创建CallableStatement对象
 * 创建该对象时需要传入调用存储过程的SQL语句。
 * 存储过程的参数既有传入参数，也有传出参数。
 * 所谓的出入参数就是Java程序必须为这些参数传入值，可以通过CallableStatement的setXxx()方法为传入参数设置值；
 * 所谓传出参数就是Java程序可以通过该参数获取存储过程里的值，CallableStatement需要调用registerOutParameter()
 * 使用execute()方法来执行存储过程
 * 通过getXxx(int index)方法来获取指定的传出参数的值
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.database.callablestatement;