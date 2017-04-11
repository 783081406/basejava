package com.ccjjltx.database.preparedstatement;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by ccjjltx on 2017/4/11.
 *
 * @author ccj
 * @version 1.0
 */
public class PreparedSatatementTest {
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
        //加载驱动
        Class.forName(driver);
    }

    public void insertUsePrepared() throws SQLException {
        try (
                //获取数据库连接
                Connection conn = DriverManager.getConnection(url, user, pass);
                //使用Connection来创建一个PreparedStatement对象
                PreparedStatement pstmt = conn.prepareStatement("insert into student_table value(null,?.1)")) {
            for (int i = 0; i < 100; i++) {
                pstmt.setString(1, "姓名" + i);
                pstmt.executeUpdate();
            }
        }
    }
}
