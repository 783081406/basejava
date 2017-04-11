package com.ccjjltx.database.transaction;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by ccjjltx on 2017/4/11.
 *
 * @author ccj
 * @version 1.0
 */
public class TransactionTest {
    private String driver;
    private String url;
    private String user;
    private String pass;

    public void initParam(String paramFile) throws Exception {
        //使用Properties类来加载属性文件
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");
    }

    public void insertInTransaction(String[] sqls) throws Exception {
        //加载驱动
        Class.forName(driver);
        try (
                Connection conn = DriverManager.getConnection(url, user, pass)) {
            //关闭自动提交，开启事务
            conn.setAutoCommit(false);
            try (
                    //使用Connection来创建一个Statement对象
                    Statement stmt = conn.createStatement()) {
                //循环多次执行sql语句
                for (String sql : sqls) {
                    stmt.executeUpdate(sql);
                }
            }
            //提交事务
            conn.commit();
        }
    }

    public static void main(String[] args) throws Exception {
        TransactionTest tt = new TransactionTest();
        tt.initParam("mysql.ini");
        String[] sqls = new String[]{
                "insert into student_table values(new,'aaa',1)",
                "insert into student_table values(new,'bbb',1)",
                "insert into student_table values(new,'ccc',1)",
                //下面语句违反外键约束
                "insert into student_table values(new,'ccc',5)"};
        tt.insertInTransaction(sqls);
    }
}
