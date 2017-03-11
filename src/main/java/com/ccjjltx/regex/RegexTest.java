package com.ccjjltx.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ccjjltx on 2017/3/11.
 * 正则表达式
 *
 * @author ccj
 * @version 1.0
 */
public class RegexTest {
    public static void main(String[] args) {
        findGroup();
        startEmd();
        testMatches();
        testReplace();
        testReplace2();
    }

    /**
     * 使用find()和group方法从目标字符串中依次取出特定子串
     */
    private static void findGroup() {
        String str = "我想要一本XXX书籍，尽快联系我13500006666，交朋友电话号码13611125565，出售二手电脑联系方式15899903312";
        //创建一个Pattern对象，并且它建立了一个Matcher对象
        Matcher m = Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(str);
        //将符合正则表达式的字串（电话号码）全部输出
        while (m.find()) {
            System.out.println(m.group());
        }
        /*
        13500006666
        13611125565
        15899903312
         */
    }

    private static void startEmd() {
        System.out.println("========================================================");
        String regStr = "Java is very cool";
        System.out.println("目标字符串:" + regStr);
        Matcher m = Pattern.compile("\\w+").matcher(regStr);
        while (m.find()) {
            System.out.println(m.group() + "起始位置:" + m.start() + ",结束位置:" + m.end());
        }
        /*
        目标字符串:Java is very cool
        Java起始位置:0,结束位置:4
        is起始位置:5,结束位置:7
        very起始位置:8,结束位置:12
        cool起始位置:13,结束位置:17
         */
    }

    /**
     * matches()方法要求整个字符串和Pattern完全匹配时才能返回true
     * 而lookingAt()只有字符串以Pattern开头就会返回true
     * reset()方法可将现有的Matcher对象应用于新的字符序列
     */
    private static void testMatches() {
        System.out.println("========================================================");
        String[] mails = {"kongyeeku@163.com", "kongyeeku@gmail.com", "ligang@crazyit.org", "waw@abc,xxx"};
        String mailRegEx = "\\w{3,20}+@\\w+\\.(com|org|cn|net|gov)";
        Pattern mailPattern = Pattern.compile(mailRegEx);
        Matcher matcher = null;
        for (String mail : mails) {
            if (matcher == null) {
                matcher = mailPattern.matcher(mail);
            } else {
                matcher.reset(mail);
            }
            String result = mail + (matcher.matches() ? "是" : "不是") + "一个有效的邮件地址";
            System.out.println(result);
        }
        /*
        kongyeeku@163.com是一个有效的邮件地址
        kongyeeku@gmail.com是一个有效的邮件地址
        ligang@crazyit.org是一个有效的邮件地址
        waw@abc,xxx不是一个有效的邮件地址
         */
    }

    private static void testReplace() {
        System.out.println("=================================================");
        String[] msgs = {"Java has regular expressions in 1.4", "regular expressions now expressing in Java",
                "Java represses oracular expressions"};
        Pattern p = Pattern.compile("re\\w*");
        Matcher matcher = null;
        for (int i = 0; i < msgs.length; i++) {
            if (matcher == null) {
                matcher = p.matcher(msgs[i]);
            } else {
                matcher.reset(msgs[i]);
            }
            System.out.println(matcher.replaceAll("哈哈:)"));
        }
        /*
        Java has 哈哈:) exp哈哈:) in 1.4
        哈哈:) exp哈哈:) now exp哈哈:) in Java
        Java 哈哈:) oracular exp哈哈:)
         */
    }

    private static void testReplace2() {
        System.out.println("=================================================");
        String[] msgs = {"Java has regular expressions in 1.4", "regular expressions now expressing in Java",
                "Java represses oracular expressions"};
        for (String msg : msgs) {
            System.out.println(msg.replaceFirst("re\\w*", "哈哈:)"));
            System.out.println(Arrays.toString(msg.split(" ")));
        }
        /*
        Java has 哈哈:) expressions in 1.4
        [Java, has, regular, expressions, in, 1.4]
        哈哈:) expressions now expressing in Java
        [regular, expressions, now, expressing, in, Java]
        Java 哈哈:) oracular expressions
        [Java, represses, oracular, expressions]
         */
    }
}
