/**
 * Created by ccjjltx on 2017/4/11.
 * jdbc默认是打开自动提交关闭事务，
 * 可以使用conn.getAutoCommit()得到是否打开自动提交模式，使用conn.setAutoCommit(false);来自动提交，开启事务
 * 一旦事务开启之后，创建的statement可以执行任意多条DML语句stmt.executeUpdate(..);stmt.executeUpdate(..);
 * 提交事务     conn.commit();
 * 回滚事务     conn.rollback();
 * <p>
 * Connection提供了设置中间点的方法：
 * Savepoint setSavepoint()：在当前事务中创建一个未命名的中间点，并返回代表该中间点的Savepoint对象
 * Savepoint setSavepoint(String name):在当前事务中创建一个具有指定名称的中间点，并且返回代表该中间点的Savepoint对象
 * 通常来说，设置中间点时没有太大的必要指定名称，因为Connection回滚到指定中间点时，并不是根据名字回滚的而是根据中间对象回滚的
 * Connection提供rollback(Savepoint savepoint)方法回滚到指定中间点
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.database.transaction;