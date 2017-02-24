package com.ccjjltx.string;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by ccj on 2017/2/18.
 *
 * @author ccj
 * @version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        //String构造函数测试程序
        testStringConstructors();
        //String中的其他API
        testOtherAPIs();
        //String中修改(追加/替换/截取/分隔)字符串的相关API
        testModifyAPIs();
        //String中比较相关API演示
        testCompareAPIs();
        //String的valueOf()
        testValueAPIs();
        //String中index相关API
        testIndexAPIs();
    }

    /**
     * String 构造函数test
     */
    private static void testStringConstructors() {
        System.out.println("-----------------testStringConstructors----------------");
        String str02 = "str02";
        String str03 = new String(new char[]{'s', 't', 'r', '0', '3'});
        String str04 = new String(new char[]{'s', 't', 'r', '0', '3'}, 1, 3);//1表示其实位置，3表示个数
        String str05 = new String(new byte[]{0x61, 0x62, 0x63, 0x64, 0x65});
        String str06 = new String(new byte[]{0x61, 0x62, 0x63, 0x64, 0x65}, 1, 3);
        String str07 = new String(new int[]{0x5b57, 0x7b26, 0x7f16, 0x7801}, 0, 4);//字符编码(\u5b57是字的unicode编码)，0表示起始位置，4表示长度
        String str08 = new String(new StringBuffer("StringBuffer"));
        String str09 = new String(new StringBuilder("StringBuilder"));
        System.out.println("str02=" + str02 + "str03=" + str03 + "str04=" + str04 + "str05=" + str05 + "str06=" + str06 + "str07=" + str07 + "str08=" + str08 + "str09" + str09);
    }

    /**
     * String中其他的API
     */
    private static void testOtherAPIs() {
        System.out.println("-----------------testOtherAPIs----------------");
        String str = "0123456789";
        System.out.println("str=" + str);
        //字符串长度
        System.out.println("str.length()" + str.length());
        //字符串是否为空
        System.out.println("str.isEmpty()" + str.isEmpty());
        //获取字符串相应字节数组
        byte[] barr = str.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.println("barr[" + i + "]=" + barr[i]);
        }
        //获取字符串位置4的字符
        System.out.println("str.charAt[4]=" + str.charAt(4));
        //获取字符串对应的字符数组
        char[] carr = str.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            System.out.println("carr[" + i + "]=" + carr[i]);
        }
        //获取字符数组对应的字符串
        // System.out.println("str.copyValueof(new char[]{'a','b','c'})" + String.copyValueOf(new char[]{'a', 'b', 'c'}));
        //System.out.println("str.copyValueof(new char[]{'a','b','c'})" + String.copyValueOf(new char[]{'a', 'b', 'c'}, 1, 4));
    }

    /**
     * String中修改(追加/替换/截取/分隔)字符串的相关API
     */
    private static void testModifyAPIs() {
        System.out.println("-----------------testModifyAPIs----------------");
        String str = "a b cABCAbCaaaaaaa";
        System.out.println("str.leng()" + str.length());
        //追加
        System.out.println("str.concat(\"123\")" + str.concat("123"));
        //截取str从位置7(包括)开始的元素
        System.out.println("str.substring(7)" + str.substring(7));
        //截取str中从位置7(包括)到位置10(不包括)之间的元素
        System.out.println("str.substring(7,10)" + str.substring(7, 10));
        System.out.println("str.trim()" + str.trim() + "length()" + str.length());
        //替换
        //字符a替换_
        System.out.println("str.replace('a','-')" + str.replace('a', '_'));
        //字符串第一次出现的字符串a替换字符串"###"
        System.out.println("str.replaceFirst(\"a\",\"####\")" + str.replaceFirst("a", "###"));
        //分隔
        //以"b"作为分隔符，对str进行分割
        String[] splits = str.split("b");
        for (int i = 0; i < splits.length; i++) {
            System.out.println("splits[" + i + "]=" + splits[i]);
        }
    }

    /**
     * String中比较相关API演示
     */
    private static void testCompareAPIs() {
        System.out.println("-----------------testCompareAPIs()----------------");
        String str = "abcAbcABCAbCabc";
        System.out.println("str=" + str);
        //比较两个String是否相等
        System.out.println("str.equals(\"abcAbcABCAbCa\")" + str.equals("abcAbcABCAbCa"));
        //比较两个String是否相对(忽略大小写)
        System.out.println("str.equalsIgnoreCase(\"ABCAbcABCAbCa\")" + str.equalsIgnoreCase("ABCAbcABCAbCa"));
        //字符串的开头是不是ab
        System.out.println("str.startsWith(\"ab\"))" + str.startsWith("ab"));
        //字符串是不是包含ABC
        System.out.println("str.startsWith(\"Ab\"" + str.startsWith("Ab", 3));
        //结尾是不是bc
        System.out.println("str.endsWith(\"bc\")" + str.endsWith("bc"));
        //字符串是否包含"ABC"
        System.out.println("str.contains(\"ABC\"" + str.contains("ABC"));
        //比较String和StringBuffer的内容是否相等
        System.out.println("str.contentEquals(new StringBuffer(\"abcAbcABCAbCabc\")" + str.contentEquals(new StringBuffer("abcAbcABCAbCabc")));
        //比较String和StringBuilder的内容是否相等
        System.out.println(str.contentEquals(new StringBuilder("abcAbcABCAbCabc")));
        //match()测试正则表达式
        AtomicReference<String> reg_ipv4 = new AtomicReference<>("[0-9]{3}{\\.[0-9]{1,3}}{3}");
        String ipv4addr1 = "192.168.1.102";
        String ipv4addr2 = "192.168";
        System.out.println("ipv4addr1.matches(reg_ipv4)" + ipv4addr1.matches(reg_ipv4.get()));
        System.out.println("ipv4addr2.matches(reg_ipv4)" + ipv4addr2.matches(reg_ipv4.get()));
    }

    /**
     * String的valueOf()
     */
    private static void testValueAPIs() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        //实际上返回的是obj.toString()
        System.out.println("String.valueOf(map)" + String.valueOf(map));
    }

    /**
     * String中index相关API
     */
    private static void testIndexAPIs() {
        String istr = "abcAbcABCabCaBcAbCaBCabc";
        //从前往后找出a第一出现位置
        System.out.println("istr.indexOf((int)'a'" + istr.indexOf((int) 'a'));
        //从位置5开始找出第一次出现的a位置
        System.out.println("istr.indexOf((int)'a',5" + istr.indexOf((int) 'a', 5));
        //从后往前找
        System.out.println("istr.lastIndexOf((int)'a')" + istr.lastIndexOf((int) 'a'));
        //从位置10开始，从后往前，a第一次出现的位置
        System.out.println("istr.lastIndexOf((int)'a')" + istr.lastIndexOf((int) 'a', 10));
    }

}
