/**
 * Created by ccjjltx on 2017/3/27.
 * DriverManager：用于管理JDBC驱动的服务类。程序使用该类的主要功能是获取Connection对象，（当调用getConnection方法时，DriverManager将试图
 * 从初始化加载的驱动程序中找到合适的驱动程序，并使用当前applet或应用程序相同的类加载器明确加载驱动程序）
 * 该类包含如下方法：
 * public static synchronized Connection getConnection(String url,String user,String pass) throws SQLException:该方法获得url对应
 * 数据库的连接
 * <p>
 * <p>
 * public interface Connection extends Wrapper,AutoCloseable;
 * 代表数据库连接对象，每个Connection代表一个物理连接会话。想要访问数据库，必须先获得数据库连接。该接口的常用方法：
 * Statement createStatement() throws  SQLException:该方法返回一个Statement对象
 * PreparedStatement prepareStatement(String sql) throws SQLException:该方法返回预编译的Statement对象，即将SQL语句提交到数据库进行预编译
 * CallableStatement prepareCall(String sql) throws SQLException:该方法返回CallableStatement对象，该方法用于调用存储过程。
 * 控制事务的方法：
 * Savepoint setSavepoint():创建一个保存点
 * Savepoint setSavepoint(String name):以指定名字来创建一个保存点
 * void setTransactionIsolation(int level):设置事务的隔离级别
 * void rollback():回滚事务
 * void rollback(Savepoint savepoint):将事务回滚到指定的保存点
 * void setAutoCommit(boolean autoCommit):关闭自动提交，打开事务
 * void commit():提交事务
 * java7新增setSchema(String schema),getSchema():用于控制该Connection访问的数据库Schema
 * setNetworkTimeout(Executor executor,int milliseconds),getNetworkTimeout():控制数据库连接的超时行为
 * <p>
 * <p>
 * public interface Statement extends Wrapper,AutoCloseable;用于执行SQL语句的工具接口
 * ResultSet executeQuery(String sql) throws SQLException:该方法用于执行查询语句，并返回查询结果对应的ResultSet对象
 * int executeUpdate(String sql) throws SQLException:该方法用于执行DML语句，并返回受影响的行数；该方法也可以用于执行DDL语句，将返回0
 * boolean execute(String sql) throws  SQLException:该方法可执行任何SQL语句。如果执行后第一个结果为ResultSet对象，则返回true；
 * 如果执行后第一个结果为受影响的行数或没有任何结果，则返回false。
 * java7新增：
 * closeOnCompletion():如果该Statement以来的ResultSet关闭时候，该Statement会自动关闭
 * isCloseOnCompletion():判断是否打开
 * <p>
 * <p>
 * public interface PreparedStatement extends Statement;
 * 预编译的Statement对象。PreparedStatement是Statement的子接口，每次只改变SQL命令的参数，避免数据库每次都需要编译SQL语句，因此
 * 性能更好。
 * void setXxx(int parameteIndex,Xxx value):该方法根据传入参数值的类型不同，需要使用不同的方法。传入值根据索引传给SQL语句中指定
 * 位置的参数。
 * <p>
 * <p>
 * public interface ResultSet extends Wrapper,AutoCloseable;
 * 结果集对象。通过列索引或列名获得列数据。
 * void close():释放ResultSet对象
 * boolean absolute(int row):将结果集的记录指针移动到第row行，如果row是负数，则移动到倒数第row行。如果移动后的记录指针指向一条
 * 有效记录，则返回true。
 * void beforeFirst():将ResultSet的记录指针定位到首行之前。这是ResultSet结果集记录指针的初始状态——记录指针的其实位置于第一行之前
 * boolean first():将ResultSet的记录指针定位到首行。如果移动后的记录指针指向一条有效记录，则该方法返回true。
 * boolean previous():将ResultSet的记录指针定位到上一行。如果移动后的记录指针指向一条有效记录，则该方法返回true。
 * boolean next():将ResultSet的记录指针定位到下一行，如果移动后的记录指针指向一条有效记录，则该方法返回true。
 * boolean last():将ResultSet的记录指针定位到最后一行，如果移动后的记录指针指向一条有效记录，则该方法返回true。
 * void afterLast():将ResultSet的记录指针定位到最后一行之后。
 * java7新增：
 * <T> T getObject(int columnIndex,Class<T> type)和<T> T getObject(String columnIndex,Class<T> type)
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.database;