package com.ccjjltx.objectoriented.nestedclasses.anonymous;

/**
 * Created by ccjjltx on 2017/3/18.
 *
 * @author ccj
 * @version 1.0
 */
public class AnonymousInner {
    public void test(Device d) {
        System.out.println("购买了一个" + d.getName() + ",花掉了" + d.getPrice());
    }

    public static void main(String[] args) {
        AnonymousInner ai = new AnonymousInner();
        //调用有参数的构造器创建Device匿名实现类的对象
        ai.test(new Device() {
            @Override
            public double getPrice() {
                return 67.8;
            }
        });
        //调用无参构造器创建Device匿名实现类的对象
        Device d = new Device() {
            //初始化块
            {
                System.out.println("匿名内部类的初始化块");
            }

            @Override
            public double getPrice() {
                return 56.2;
            }

            @Override
            public String getName() {
                return "键盘";
            }
        };
        ai.test(d);
        /*
        购买了一个null,花掉了67.8
        匿名内部类的初始化块
        购买了一个键盘,花掉了56.2
         */
    }
}
