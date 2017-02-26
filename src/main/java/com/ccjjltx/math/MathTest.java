package com.ccjjltx.math;

/**
 * Created by ccjjltx on 2017/2/26.
 * @author ccj
 * @version 1.0
 */
public class MathTest {
    public static void main(String[] args){
        //==============三角运算==============
        //将弧度转换成角度
        System.out.println("Math.toDegrees(1.57):"+Math.toDegrees(1.57));
        //将角度转换成弧度
        System.out.println("Math.toRadians(10):"+Math.toRadians(10));
        //计算余弦
        System.out.println("Math.cos(1.5):"+Math.cos(1.5));
        System.out.println("Math.cos(Math.toRadians(60)):"+Math.cos(Math.toRadians(60)));
        //计算正弦
        System.out.println("Math.sin(1.5):"+Math.sin(1.5));
        System.out.println("Math.sin(Math.toRadians(30)):"+Math.sin(Math.toRadians(30)));
        //计算正切
        System.out.println("Math.tan(0.8):"+Math.tan(0.8));
        System.out.println("Math.tan(Math.toRadians(0)):"+Math.tan(Math.toRadians(0)));
        //==============取整运算==============
        //取整，返回小于目标数的最大整数//-2
        System.out.println("Math.floor(-1.2):"+Math.floor(-1.2));
        //取整，返回小于目标数的最小整数//2
        System.out.println("Math.ceil(1.2):"+Math.ceil(1.2));
        //四舍五入//1
        System.out.println("Math.round(1.2)"+Math.round(1.2));
        //==============乘方、开方、指数运算==============
        //计算平方根
        System.out.println("Math.sqrt(4):"+Math.sqrt(4));
        //计算立方根
        System.out.println("Math.cbrt(8):"+Math.cbrt(8));
        //计算乘方
        System.out.println("Math.pow(3,2):"+Math.pow(3,2));
        //计算自然对数
        System.out.println("Math.log(12):"+Math.log(12));
        //计算底数为10的对数
        System.out.println("Math.log10(100):"+Math.log10(100));
        //==============符号相关的运算==============
        //计算绝对值
        System.out.println("Math.abs(-4,5):"+Math.abs(-4.5));
        //符号赋值，返回带有第二个浮点数号的第一个浮点参数
        System.out.println("Math.copySign(1.2,-1.0):"+Math.copySign(1.2,-1.0));
        //符号函数，如果参数为0，则返回0，如果参数大于0，则返回1.0，如果参数小于0，这返回-1.0
        System.out.println("Math.signum(2.3):"+Math.signum(2.3));
        //==============大小相关的运算==============
        //找出最大值
        System.out.println("Math.max(2.3,4.5):"+Math.max(2.3,4.5));
        //计算最小值
        System.out.println("Math.min(1.2,3.4):"+Math.min(1.2,3.4));
        //返回第一个参数和第二个参数之间与第一个参数相邻的浮点数
        System.out.println("Math.nextAfter(1.2,1.0):"+Math.nextAfter(1.2,1.0));
        //返回比目标数略大的浮点数
        System.out.println("Math.nextUp(1.2):"+Math.nextUp(1.2));
        //
        //返回一个伪随机数，该值大于等于0.0且小于1.0
        System.out.println("Math.random():"+Math.random());
    }
}
