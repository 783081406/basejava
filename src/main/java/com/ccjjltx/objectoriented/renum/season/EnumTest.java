package com.ccjjltx.objectoriented.renum.season;

/**
 * Created by ccjjltx on 2017/3/21.
 *
 * @author ccj
 * @version 1.0
 */
public class EnumTest {
    private void judge(SeasonEnum s) {
        //switch语句里的表达式可以使枚举值
        switch (s) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case FALL:
                System.out.println("秋天");
                break;
            default:
                System.out.println("冬天");
                break;
        }
    }

    public static void main(String[] args) {
        //枚举类默认有一个values()方法，返回该枚举类的所有实例
        for (SeasonEnum s : SeasonEnum.values()) {
            System.out.println(s);
        }
        //使用枚举实例时，可通过EnumClass.variable形式来访问
        new EnumTest().judge(SeasonEnum.SPRING);
        System.out.println(SeasonEnum.SPRING.name());//SPRING
        System.out.println(SeasonEnum.SPRING.toString());//SPRING
        /*
        SPRING
        SUMMER
        FALL
        WINTER
        春天
         */
    }
}
