package com.ccjjltx.datatype;

/**
 * Created by ccjjltx on 2017/3/3.
 * 数据类型的一些点
 *
 * @author ccj
 * @version 1.0
 */
public class DataTypeTest {
    public static void main(String[] args) {
        //二进制
        binary();
        //字符串
        testchar();
    }

    /**
     * 二进制
     */
    private static void binary() {
        //定义两个8位的二进制整数
        int binVall = 0b11010100;
        byte binVal12 = 0B01101001;
        //定义一个32位的二进制整数，最高位是符号位
        //负数补码形式保存
        int binVal13 = 0B10_0000000000_0000000000_0000000011;
        System.out.println(binVall);//212
        System.out.println(binVal12);//105
        System.out.println(binVal13);//-2147483645
        /*
        定义一个8为的二进制证书，该证书默认占32位，因此它是一个正数只能听强制类型转换成byte时，产生溢出，最终导致binVa14变成-23
         */
        //使溢出仅使用补码状态时转byte会截取
        byte binVal4 = (byte) 0b11101001;
        System.out.println(binVal4);//-23
        /*
        定义一个32位的二进制整数，最高位是1
        但是由于整数后面添加了L后缀，因此该整数实际占64位，第32位的1不是符号位
         */
        //32->64增0，原标志位为数据位，符号位为0
        long binVal5 = 0B10_0000000000_0000000000_0000000011L;
        System.out.println(binVal5);//2147483651
    }

    /**
     * 字符串
     */
    private static void testchar() {
        //直接指定单个字符作为字符值
        char aChar = 'a';
        //使用转移字符作为字符值
        char enterChar = '\r';
        //使用Unicode编码值来指定字符值
        char ch = '\u9999';
        //将输出一个'香'字符
        System.out.println(ch + "______" + aChar + "______" + enterChar);
        char zhong = '疯';
        System.out.println(zhong);
        //直接将一个char变量当成int类型变量使用
        System.out.println((int) zhong);
        //直接把一个0~65535范围内的int整数赋给一个char变量
        char c = 97;
        System.out.println(c);//a
    }
}
