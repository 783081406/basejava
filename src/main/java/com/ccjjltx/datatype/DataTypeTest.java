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
        //正负无穷数，非数
        testInfinity();
        //基本类型和String
        primitiveAndString();
        //强制转换
        narrowConversion();
        //运算
        autoPromote();
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
        System.out.println("==========================");
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

    /**
     * 正负无穷数，非数
     */
    private static void testInfinity() {
        System.out.println("==========================");
        float af = 5.23456789f;
        //af值已经发生了变化
        System.out.println(af);
        double a = 0.0;
        double c = Double.NEGATIVE_INFINITY;
        float d = Float.NEGATIVE_INFINITY;
        //float和double的无穷大相同
        System.out.println("无穷大比较" + (c == d));
        System.out.println(-8 / a);
        System.out.println(6.0 / 0 == 555.0 / 0);
        //0.0除以0.0出现非数
        System.out.println("0.0除以0.0出现非数:" + a / a);
        //两个非数不相等
        System.out.println("两个非数不相等:" + (a / a == Float.NaN));
        //下面代码抛出异常
        //System.out.println(0/0);
    }

    /**
     * 基本类型和String
     * 当把任何基本类型的字和字符串值进行连接运算时，基本类型的值将自动类型转换为字符串类型，虽然字符串类型不是基本类型，
     * 而是引用类型。因此，如果希望把基本类型的值转换成对应的字符串时，可以把基本类型的字和一个空字符串进行连接
     */
    private static void primitiveAndString() {
        System.out.println("===========================================");
        //下面代码错误,不能直接赋值给一个字符串
        //String str1=5;
        //一个基本类型的值和字符串进行连接运算时，基本类型的值自动转换为字符串
        String str2 = 3.5 + "";
        System.out.println(3.5);
        System.out.println(3 + 4 + "Hello!");//7Hello!
        System.out.println("Hello" + 3 + 4);//Hello34
    }

    /**
     * 强制转换
     */
    private static void narrowConversion(){
        System.out.println("====================================");
        int iValue=233;
        //强制把一个int类型的值转换为byte类型的值
        byte bValue=(byte)iValue;
        //将输出-23
        //将int的补码取后八位，转反码，最后得到原码
        System.out.println(bValue);
    }

    /**
     * 运算
     */
    private static void autoPromote(){
        System.out.println("===================================");
        String s="45";
        int iValue=Integer.parseInt(s);
        System.out.println(iValue);
        int a=23/3;
        System.out.println(a);//7
        double b=23/3;
        System.out.println(b);//7.0
        double c=23.0/3.0;
        System.out.println(c);//7.666666666666667
    }
}
