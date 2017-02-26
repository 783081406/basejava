package com.ccjjltx.string.stringbuffer;

import java.util.HashMap;

/**
 * Created by ccj on 2017/2/24.
 *
 * @author ccj
 * @version 1.0
 */
public class StringBufferTest {
    public static void main(String[] args) {
        //StringBuffer中insert
        testInsertAPIs();
        //StringBuffer中append
        testAppendAPIs();
        //StringBuffer中replace
        testReplaceAPIs();
        //StringBuffer中delete
        testDeleteAPIs();
        //StringBuffer中index
        testIndexAPIs();
        //StringBuffer中其他api
        testOtherAPIs();

    }

    /**
     * StringBuffer中insert
     */
    private static void testInsertAPIs() {
        System.out.println("------testInsertAPIs------");
        StringBuffer sb = new StringBuffer();
        //位置0处插入字符数组
        sb.insert(0, new char[]{'a', 'b', 'c'});
        //位置0处插入字符数组，0表示数组起始位置，3表示长度
        sb.insert(0, new char[]{'z', 'y', 'x', 'w', 'v'}, 0, 3);
        sb.insert(0, true);
        sb.insert(0, '\n');
        sb.insert(0, 12);
        sb.insert(0, 1.11f);
        sb.insert(0, 12L);
        sb.insert(0, 1.22d);
        //在位置0处插入StringBuilder对象
        sb.insert(0, new StringBuilder("StringBuilder"));
        //在位置0插入StringBuilder对象，6表示插入起始位置，13表示结束位置
        sb.insert(0, new StringBuilder("StringBufferStringBuffer"), 6, 13);
        //在位置0插入StringBuffer对象
        sb.insert(0, new StringBuffer("StringBuffer"));
        sb.insert(0, new StringBuffer("StringBufferStringBuffer"), 6, 13);
        sb.insert(0, "String");
        sb.insert(0, "String", 1, 3);
        //插入Object对象，例如HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        sb.insert(0, map);
        System.out.println("sb=" + sb);
    }

    /**
     * StringBuffer中的append
     */
    private static void testAppendAPIs() {
        System.out.println("------testAppendAPIs------");
        StringBuffer sb = new StringBuffer();
        //追加字符数组
        sb.append(new char[]{'a', 'b', 'c', 'd'});
        //追加字符数组，0表示字符数组起始位置，3表示长度
        sb.append(new char[]{'z', 'y', 'x', 'w', 'v'}, 0, 3);
        sb.append(1.414f);
        sb.append(3.141d);
        sb.append(true);
        sb.append('\n');
        sb.append(100);
        sb.append(12345L);
        //追加StringBuilder对象
        sb.append(new StringBuilder("StringBuilder"));
        sb.append(new StringBuilder("StringBuilderStringBuilder"), 6, 13);
        //追加StringBuffer对象
        sb.append(new StringBuffer("StringBuffer"));
        sb.append(new StringBuffer("StringBufferStringBuffer"), 6, 13);
        //追加String对象
        sb.append("String");
        sb.append("StringString", 2, 5);
        //追加Object对象，例如HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        sb.append(map);
        System.out.println("sb=" + sb);
    }

    /**
     * StringBuffer中replace
     */
    private static void testReplaceAPIs() {
        System.out.println("------testReplaceAPIs------");
        StringBuffer sb;
        sb = new StringBuffer("0123456789");
        sb.replace(0, 3, "ABCDE");//ABCDE3456789
        System.out.println("sb=" + sb);

        sb = new StringBuffer("0123456789");
        sb.reverse();
        System.out.println("sb=" + sb);

        sb = new StringBuffer("0123456789");
        sb.setCharAt(0, 'M');
        System.out.println("sb=" + sb);
    }

    /**
     * StringBuffer中delete
     */
    private static void testDeleteAPIs() {
        System.out.println("------testDeleteAPIs------");
        StringBuffer sb = new StringBuffer("0123456789");
        //删除位置0字符123456789
        sb.deleteCharAt(0);
        //删除位置3（包）到6（不包）123789
        sb.delete(3, 6);
        //获取sb中从位置1开始字符串
        String str1 = sb.substring(1);
        //获取sb中中从位置3（包）到5（不包）之间字符串
        String str2 = sb.substring(3, 5);
        //获取sb中中从位置3（包）到5（不包）之间字符串，获取对象是charSequence对象，此处转String
        String str3 = (String) sb.subSequence(3, 5);
        System.out.println("sb=" + sb + ";str1=" + str1 + ";str2" + str2 + ";str3" + str3);
    }

    /**
     * StringBuffer中index
     */
    private static void testIndexAPIs() {
        System.out.println("------testIndexAPIs------");
        StringBuffer sb = new StringBuffer("abcAbcABCabCaBcAbCaBCabc");
        System.out.println("s=" + sb);
        //从前往后，找出"bc"第一次出现的位置
        System.out.println("sb.indexOf(\"bc\"))" + sb.indexOf("bc"));
        //从位置5开始，从前向后找出第一"bc"出现位置
        System.out.println("sb.indexOf(\"bc\",5)" + sb.indexOf("bc", 5));
        //从后向前，找出"bc"第一次出现位置
        System.out.println("sb.lastIndexOf(\"bc\")" + sb.lastIndexOf("bc"));
        //从位置4开始，从后向前，找出"bc"第一次出现的位置
        System.out.println("sb.lastIndexOf(\"bc\",4)" + sb.lastIndexOf("bc", 4));
    }


    /**
     * StringBuffer的其他api
     */
    private static void testOtherAPIs() {
        System.out.println("------testOtherAPIs------");
        StringBuffer sbu = new StringBuffer("0123456789");
        int cap = sbu.capacity();
        System.out.println("cap=" + cap);
        char c = sbu.charAt(6);
        System.out.println("c=" + c);
        char[] carr = new char[4];
        sbu.getChars(3, 7, carr, 0);
        for (char ch : carr) {
            System.out.print(ch);
        }
    }
}
