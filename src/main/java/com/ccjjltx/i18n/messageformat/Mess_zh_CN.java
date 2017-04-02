package com.ccjjltx.i18n.messageformat;

import java.util.ListResourceBundle;

/**
 * Created by ccjjltx on 2017/4/2.
 * 等同于mess_zh_CN.properties
 * 使用类文件来代替资源文件必须满足如下条件：
 * 该类的类名必须是baseName_language_country,与属性文件命名相似
 * 该类必须继承ListResourceBundle，并且重写getContents()方法，该方法返回Object数组，该数组的每一项都是key-value对
 *
 * @author ccj
 * @version 1.0
 */
public class Mess_zh_CN extends ListResourceBundle {
    //定义资源
    private final Object myData[][] = {
            {"msg", "你好{0},今天是{1}"}
    };

    @Override
    //重写getContents()方法
    public Object[][] getContents() {
        //该方法返回资源的key-value对
        return myData;
    }
}
