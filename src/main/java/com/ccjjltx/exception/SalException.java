package com.ccjjltx.exception;

/**
 * Created by ccjjltx on 2017/4/9.
 * JDK1.4以后，Throwable基类已有一个可以接受Exception参数的方法
 *
 * @author ccj
 * @version 1.0
 */
public class SalException extends Exception {
    public SalException() {
    }

    public SalException(String msg) {
        super(msg);
    }

    public SalException(Throwable t) {
        super(t);
    }
    /*
    调用的时候可以为
    catch(SQLException e){
        throw new SalException(sqle);
    }catch(Exception e){
        throw new SalException(e);
    }
     */
}
