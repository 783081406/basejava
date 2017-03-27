package com.ccjjltx.database.statement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created by ccjjltx on 2017/3/27.
 * 封装了三个Statement的三个主要方法
 *
 * @author ccj
 * @version 1.0
 */
public class DbExecute {
    private String driver;
    private String url;
    private String user;
    private String pass;
    private String path = "src/java/com/ccjjltx/database/statement/connectconf.init";
    private boolean isInit = false;//记录是否准确的执行了iniConnection函数
    private Connection conn = null;


    /**
     * 加载属性文件
     *
     * @return 是否能正确加载
     */
    public boolean initConnection() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File(path)));
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            pass = properties.getProperty("pass");
        } catch (FileNotFoundException e) {
            System.out.println("文件没有找到");
            return setIsInit(false);
        } catch (IOException e) {
            System.out.println("IO流读取错误");
            return setIsInit(false);
        }
        return setIsInit(true);
    }

    /**
     * 初始化加载
     *
     * @return 连接
     */
    public Connection getConnection() {
        //必须先执行initConnection,使用成
        if (!isInit)
            return conn;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            System.out.println("配置文件中driver有错或没有加载jar文件");
        } catch (SQLException e) {
            System.out.println("sql连接错误");
        }
        return conn;
    }

    /**
     * 封装statement里面的executeQuerty(String sql)方法
     *
     * @param sql 执行语句
     * @return 得到结果的ResultSet
     */
    public ResultSet executeQuery(String sql) {
        if (conn == null)
            return null;
        try (Statement stmt = conn.createStatement()) {
            return stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("sql语句异常");
            return null;
        }
    }

    /**
     * 封装statement的executeUpdate函数
     *
     * @param sql sql语句
     * @return 如果有错返回-1，否则成功运行返回受影响的行数
     */
    public int executeUpdate(String sql) {
        if (conn == null) {
            return -1;
        }
        try (Statement stmt = conn.createStatement()) {
            return stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("sql语句异常");
            return -1;
        }
    }

    /**
     * 自动识别是采用executeQuery函数还是采用executeUpdate
     *
     * @param sql 要执行的sql语句
     */
    public void execute(String sql) {
        if (conn == null)
            return;
        try (Statement stmt = conn.createStatement()) {
            //执行SQL语句，返回boolean值表示是否包含ResultSet
            boolean hasResultSet = stmt.execute(sql);
            //如果执行后有ResultSet结果集
            if (hasResultSet) {
                try (ResultSet rs = stmt.getResultSet()) {
                    //ResultSetMetaData是用于分析结果集的元数据接口
                    ResultSetMetaData rsmd = rs.getMetaData();
                    int columnCount = rsmd.getColumnCount();
                    //迭代输出ResultSet值
                    while (rs.next()) {
                        //依次输出ResultSet值
                        for (int i = 0; i < columnCount; i++) {
                            //依次输出每列的值
                            /*
                            ResultSet的getString()方法几乎可以获取除了Blob之外的任意类型列的值，因为所有的数据类型都可以
                            自动转换成字符串类型
                             */
                            System.out.println(rs.getString(i + 1) + "\t");
                        }
                        System.out.println();
                    }
                }
            } else {
                System.out.println("该SQL语句影响的记录有" + stmt.getUpdateCount() + "条");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 更改是否成功执行initConnection函数
     *
     * @param isInit 成员变量
     * @return isInit的值
     */
    private boolean setIsInit(boolean isInit) {
        this.isInit = isInit;
        return isInit;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
