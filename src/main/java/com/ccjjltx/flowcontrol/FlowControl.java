package com.ccjjltx.flowcontrol;

/**
 * Created by ccjjltx on 2017/3/3.
 *
 * @author ccj
 * @version 1.0
 */
public class FlowControl {
    public static void main(String[] args) {
        //break;
        testBreak();
        //自定义标签
        testCustom();
        //continue
        testContinue();
    }

    /**
     * break;
     * 强制终止循环，break用于完全结束一个循环，跳出循环体
     */
    private static void testBreak() {
        //简单的for循环
        for (int i = 0; i < 10; i++) {
            System.out.println("i的值是" + i);
            if (i == 3) {
                //执行该语句时结束循环
                break;
            }
        }
    }

    /**
     * 自定义标签
     * java中的标签就是一个紧跟着英文冒号（：）的标识符。与其他语言不通，java中的标签只有放在循环语句之前才有作用
     */
    private static void testCustom() {
        //外层循环，outer作为标识符
        //可以自定义如aaa:
        /*
        i的值为:0  j的值为:0
        i的值为:0  j的值为:1
         */
        outer:
        for (int i = 0; i < 10; i++) {
            //内层循环
            for (int j = 0; j < 3; j++) {
                System.out.println("i的值为:" + i + "  j的值为:" + j);
                if (j == 1) {
                    //跳出outer标签标识的循环
                    break outer;
                }
            }
        }
    }

    /**
     * continue;
     * 忽略本次循环，接着开始下一次循环，并不会种植循环
     */
    private static void testContinue() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i的值是" + i);
            if (i == 1) {
                //忽略本次循环的剩下语句
                continue;
            }
            System.out.println("continue后的输出语句");
        }
    }

}
