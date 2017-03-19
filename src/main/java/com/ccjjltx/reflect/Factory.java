package com.ccjjltx.reflect;

/**
 * Created by ccjjltx on 2017/3/19.
 *
 * @author ccj
 * @version 1.0
 */
public class Factory {
    public static Fruit getInstance(String className) {
        try {
            return (Fruit) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
