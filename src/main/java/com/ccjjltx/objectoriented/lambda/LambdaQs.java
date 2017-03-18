package com.ccjjltx.objectoriented.lambda;

/**
 * Created by ccjjltx on 2017/3/18.
 *
 * @author ccj
 * @version 1.0
 */
public class LambdaQs {
    public static void main(String[] args) {
        LambdaQs l = new LambdaQs();
        ///
        l.testArrayCc((int[] target) -> {
            for (int a:target) {
                System.out.println("遍历结果:" + a);
            }
        });
        //只有一条语句可以省略花括号
        l.eat(() -> System.out.println("吃！"));
        //只有一个形参，可以省略圆括号
        l.drive(weather -> System.out.println("天气晴"));
        //代码只有一条语句，可以省略return
        l.test((a, b) -> a + b);
    }

    public void testArrayCc(ArrayCc c) {
        c.cc(new int[]{1, 2, 3, 4, 5});
    }

    public void eat(Eatable e) {
        e.taste();
    }

    public void drive(Flyable f) {
        f.fly("天气晴朗");
    }

    public void test(Addable add) {
        System.out.println(add.add(5, 3));
    }
}

interface ArrayCc {
    void cc(int[] target);
}

interface Eatable {
    void taste();
}

interface Flyable {
    void fly(String weather);
}

interface Addable {
    int add(int a, int b);
}