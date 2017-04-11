package com.ccjjltx.database.callablestatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created by ccjjltx on 2017/4/11.
 * 先在数据库中创建一个存储过程
 * delimiter //
 * create procedure add_pro(a int,b int,out sum int)
 * begin
 * set sum=a+b;
 * end//
 * delimiter ;
 *
 * @author ccj
 * @version 1.0
 */
public class CallableStatementTest {
    private String driver;
    private String url;
    private String user;
    private String pass;

    public void initParam(String paramFile) throws SQLException, IOException {
        //使用Properties类来加载属性文件
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");
    }

    public void callProcedure() throws SQLException, ClassNotFoundException {
        //加载驱动
        Class.forName(driver);
        try (
                //获取数据库连接
                Connection connection = DriverManager.getConnection(url, user, pass);
                //使用Connection创建一个CallableStatement对象
                CallableStatement cstmt = connection.prepareCall("{call procedure(?,?,?)}")) {
            cstmt.setInt(1, 2);
            cstmt.setInt(2, 5);
            //注册CallableStatement的第三个参数是int类型，传出参数
            cstmt.registerOutParameter(3, Types.INTEGER);
            //执行存储过程
            cstmt.execute();
            //获取并输出存储过程传出参数的值
            System.out.println("执行结果是:" + cstmt.getInt(3));
        }
    }

    public static void main(String[] args) throws Exception {
        CallableStatementTest ct = new CallableStatementTest();
        ct.initParam("mysql.ini");
        ct.callProcedure();
    }
}
