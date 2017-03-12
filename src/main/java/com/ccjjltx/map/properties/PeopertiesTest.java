package com.ccjjltx.map.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Created by ccjjltx on 2017/3/12.
 *
 * @author ccj
 * @version 1.0
 */
public class PeopertiesTest {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        //向Properties中添加属性
        props.setProperty("username", "ccj");
        props.setProperty("password", "123456");
        //将Properties中的key-value对保存到a.ini文件中
        //一个/或者\\都行，因为\要转移所以要\\
        props.store(new FileOutputStream("src/main/java/com/ccjjltx/map/properties/a.ini"), "comment line");
        //新建一个Properties对象
        Properties props2 = new Properties();
        //向Properties
        props2.setProperty("gender", "male");
        //将a.ini文件中的key-value对追加到props2中
        props2.load(new FileInputStream("src/main/java/com/ccjjltx/map/properties/a.ini"));
        System.out.println(props2);//{password=123456, gender=male, username=ccj}
        //需要加上到文本，还需要使用store,而load只是加载，即使在程序中改变也不会改变到a.ini文件中，除非是用store方法
        props2.store(new FileOutputStream("src/main/java/com/ccjjltx/map/properties/a.ini"), "new comment line");
    }
}
