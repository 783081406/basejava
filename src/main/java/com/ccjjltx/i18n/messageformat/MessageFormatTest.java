package com.ccjjltx.i18n.messageformat;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by ccjjltx on 2017/4/2.
 *
 * @author ccj
 * @version 1.0
 */
public class MessageFormatTest {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault(Locale.Category.FORMAT);
        //根据Locale加载语言资源
        ResourceBundle bundle = ResourceBundle.getBundle("com\\ccjjltx\\i18n\\messageformat\\mess", locale);
        //取得已加载的语言资源文件中msg对象的消息
        String msg = bundle.getString("msg");
        System.out.println(MessageFormat.format(msg, "ccj", new Date()));
    }
}
