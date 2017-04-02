package com.ccjjltx.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by ccjjltx on 2017/4/2.
 *
 * @author ccj
 * @version 1.0
 */
public class BundleTest {
    public static void main(String[] args) {
        //取得系统默认的国家/语言环境
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
        //根据指定的环境/语言加载资源文件
        /*
        一般路径为包名字加文件头名字，同时如果找不到把文件执行copy找同一目录下
        Thread.currentThread().getContextClassLoader().getResource("").getPath()
         */
        ResourceBundle bundle = ResourceBundle.getBundle("com/ccjjltx/i18n/test1", myLocale);
        for (String key : bundle.keySet()) {
            //打印从资源文件中取得的信息
            System.out.println(key + "=" + bundle.getString(key));
        }
    }
}
