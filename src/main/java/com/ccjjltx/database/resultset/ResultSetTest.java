package com.ccjjltx.database.resultset;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by ccjjltx on 2017/4/11.
 *
 * @author ccj
 * @version 1.0
 */
public class ResultSetTest {
    private String driver;
    private String url;
    private String user;
    private String pass;

    public void intParam(String paramFile) throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream(paramFile));
        driver = prop.getProperty("driver");
        url = prop.getProperty("url");
        user = prop.getProperty("user");
        pass = prop.getProperty("pass");
    }

    public void query(String sql) throws Exception {
        //加载类驱动
        Class.forName(driver);
        try (
                //获取数据库连接
                Connection conn = DriverManager.getConnection(url, user, pass);
                //使用Connection来创建一个PreparedStatement对象
                //传入控制结果集可滚动、可更新的参数
                PreparedStatement pstmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = pstmt.executeQuery()) {
            rs.last();
            int rowCount = rs.getRow();
            for (int i = rowCount; i > 0; i--) {
                rs.absolute(i);
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
                //修改记录指针所指记录，第2列的值
                rs.updateString(2, "学生名" + i);
                //提交修改
                rs.updateRow();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ResultSetTest rt = new ResultSetTest();
        rt.intParam("mysql.ini");
        rt.query("select * from student_table");
    }
}
