package com.ccjjltx.objectoriented.autoboxing;

/**
 * Created by ccjjltx on 2017/3/10.
 * java5提供自动装箱（autoboxing）拆箱,自动拆箱
 *
 * @author ccj
 * @version 1.0
 */
public class PrimitiveTest {
    public static void main(String[] args) {
        String intStr = "123";
        int it1 = Integer.parseInt(intStr);
        int it2 = new Integer(12);
        System.out.println(it1 + it2);
        String iStr1 = String.valueOf(1234);
        String iStr2 = 123 + "";
        System.out.println(iStr1 + iStr2);
        Integer ina = 2;
        Integer inb = 2;
        System.out.println("两个2自动装箱后是否相等:" + (ina == inb));//true
        Integer biga = 128;
        Integer bigb = 128;
        System.out.println("两个128自动装箱后是否相等:" + (biga == bigb));//false
        int inta = 222;
        int intb = 222;
        System.out.println(inta == intb);//true
        //java7为所有包装类都提供了一个静态的compare(xxx val1,xxx val2)方法
        System.out.println(Boolean.compare(true, false));//1
        //java8再次增强了包装类的功能，其中一个重要的增强就是支持无符号算数运算。Java8为整型包装类增加了支持无符号运算的方法
        byte b=-3;
        System.out.println(Byte.toUnsignedInt(b));
        int val=Integer.parseUnsignedInt("123",10);
        System.out.println(val);
        System.out.println(Integer.toUnsignedString(12,10));//12
        System.out.println(Integer.toUnsignedString(-12,10));//4294967284
        System.out.println(Integer.divideUnsigned(2,3));//0
        System.out.println(Integer.divideUnsigned(-2,3));//1431655764
        System.out.println(Integer.remainderUnsigned(-2,7));//2
        /*
        无符号整数最大的特点是最高位不再被当成符号位，因此无符号整数不支持负数，其最小值为0，上面程序的运算结果可能不太直观。
        理解关键是先把操作数转换为无符号整数，然后进行计算。以byte类型的-3为例，其源码为10000011（最高位1代表负数），
        其反码为11111100,补码为11111101，如果将该数当成无符号整数处理，那么最高位的1就不再是符号位，也是数值位，该书就对应为253，
        即上面程序的输出结果。
         */
    }
}
