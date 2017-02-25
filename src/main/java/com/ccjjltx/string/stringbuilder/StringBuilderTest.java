package com.ccjjltx.string.stringbuilder;

import java.util.HashMap;

/**
 * Created by ccj on 2017/2/25.
 * @author ccj
 * @version 1.0
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        //StringBuilder的insert()
        testInsertAPIs();
        //StringBuilder的append()
        testAppendAPIs();
        //StringBuilder的replace()
        testReplceAPIs();
        //StringBuilder的delete()
        testDeleteAPIs();
        //StringBuilder中index()相关
        testIndexAPIs();
        //StringBuilder中的其他API
        testOtherAPIs();
    }

    /**
     * StringBuilder的insert()
     */
    private static void testInsertAPIs() {
        System.out.println("------testInsertAPIs------");
        StringBuilder sb = new StringBuilder();
        //在位置0处插入字符串数组
        //会返回一个StringBuilder但是原来的值会改变
        sb.insert(0, new char[]{'a', 'b', 'c', 'd', 'e'});
        //在位置0处插入数组字符。0表示数组起始位置，3表示长度
        sb.insert(0, new char[]{'a', 'b', 'c'}, 0, 2);
        sb.insert(0, 1.141f);
        sb.insert(0, 3.14159d);
        sb.insert(0, true);
        sb.insert(0, '\n');
        sb.insert(0, 100);
        sb.insert(0, 12345L);
        sb.insert(0, new StringBuilder("StringBuilder"));
        //在位置0处插入StringBuilder对象。6表示被在位置0处插入对象的起始位置(包括),12是结束位置(不包括)
        sb.insert(0, new StringBuilder("StringBuilder"), 6, 12);
        sb.insert(0, "String");
        //在位置0处插入String对象，1表示被插入对象的起始位置（包括），6是结束位置（不包括）
        sb.insert(0, "0123456789", 1, 6);
        //在0处插入Object对象，例如HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        sb.insert(0, map);
        System.out.println(sb);
    }

    /**
     * StringBuild的append()
     */
    private static void testAppendAPIs() {
        System.out.println("------testAppendAPIs------");
        StringBuilder sb = new StringBuilder();
        //追加字符数组
        sb.append(new char[]{'a', 'b', 'c'});
        //0表示数组起始位置，3表示长度
        sb.append(new char[]{'A', 'B', 'C'}, 0, 3);
        sb.append(1.414f);
        sb.append(3.14159d);
        sb.append(true);
        sb.append('\n');
        sb.append(100);
        sb.append(12345L);
        //追加StringBuild对象
        sb.append(new StringBuilder("StringBuilder"));
        //6表示被追加对象起始位置（包括），13表示结束位置（不包括）
//        sb.append(new StringBuilder("SRINGBUILDER"), 6, 13);
        //追加String对象
        sb.append("String");
        //追加String对象，1表示被追加起始位置（包括），6是结束位置（不包括）
        sb.append("0123456789", 1, 6);
        //追击object对象，例如HshMap
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        sb.append(map);
        System.out.println(sb);
    }

    /**
     * StringBuilder的replace()
     */
    private static void testReplceAPIs() {
        System.out.println("------testReplceAPIs------");
        StringBuilder sb;
        sb = new StringBuilder("0123456789");
        sb.replace(0, 3, "ABCDE");
        System.out.println(sb);

        sb = new StringBuilder("0123456789");
        //导致字符序列被反向替换//9876543210
        sb.reverse();
        System.out.println(sb);

        sb = new StringBuilder("0123456789");
        sb.setCharAt(0, 'M');
        System.out.println(sb);
    }

    /**
     * StringBuilder中delete()
     */
    private static void testDeleteAPIs() {
        System.out.println("------testDeleteAPIs------");
        StringBuilder sb = new StringBuilder("0123456789");
        //删除位置0字符//123456789
        sb.deleteCharAt(0);
        //删除3（包括）到6（不包括）之间的字符//123789
        sb.delete(0, 6);
        //获取sb中从位置1开始的字符串
        String str1 = sb.substring(1);
        //获取sb中从位置3(包括)到5(不包括)之间的字符串
        String str2 = sb.substring(1, 3);
        //获取从3（包括）到5（不包括）之间的字符串，获取对象是CharSequence对象，此处转型为String
        String str3 = (String) sb.subSequence(3, 5);
        System.out.println("sb=" + sb + "str1" + str1 + "str2=" + str2 + "str3=" + str3);
    }

    /**
     * StringBuilder中的index相关
     */
    private static void testIndexAPIs() {
        System.out.println("------testIndexAPIs------");
        StringBuilder sb = new StringBuilder("abcAbcABCabCaBcAbcCBCabc");
        System.out.println("sb=" + sb);
        //从前往后，找出"bc"第一次出现位置
        System.out.println("sb.indexOf(\"bc\")" + sb.indexOf("bc"));
        //从位置5开始，从前往后，找出"bc"第一次出现的位置
        System.out.println("sb.indexOf(\"bc\",5)" + sb.indexOf("bc", 5));
        //从后往前，找出bc第一次出现位置
        System.out.println("sb.lastIndexOf(\"bc\")" + sb.lastIndexOf("bc"));
        //从位置4开始，从后向前，找出"bc"第一次出现的位置
        System.out.println("sb.lastIndexOf(\"bc\",4)" + sb.lastIndexOf("bc", 4));
    }

    /**
     * StringBuilder的其他API
     */
    private static void testOtherAPIs() {
        System.out.println("------testOtherAPIs------");
        StringBuilder sb = new StringBuilder("0123456789");
        //返回当前容量
        int cap = sb.capacity();
        System.out.println("cap=" + cap);
        //返回索引处的char
        char c = sb.charAt(6);
        System.out.println("c=" + c);
        //从字符序列中复制目标数组dst
        char[] chars = new char[4];
        //3，7字符序列开始结束为止，0表示复制序列的开始位置
        sb.getChars(3, 7, chars, 0);
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}
