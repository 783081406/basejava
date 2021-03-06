package com.ccjjltx.reflect.rclass;

/**
 * Created by ccjjltx on 2017/3/19.
 *
 * @author ccj
 * @version 1.0
 */
public class TestClass {
    public static void main(String[] args) {
        try {
            //测试class.forName()
            Class<?> testTypeForName = Class.forName("com.ccjjltx.reflect.rclass.TestClassType");
            System.out.println("testForName------" + testTypeForName);
            //测试类名.class
            Class<?> testTypeClass = TestClassType.class;
            System.out.println("testTypeClass----" + testTypeClass);
            //测试object.getClass()
            TestClassType testGetClass = new TestClassType();
            System.out.println("testGetClass-----" + testGetClass.getClass());
            /*
            ------静态的参数初始化--------
            testForName------class com.ccjjltx.reflect.rclass.TestClassType
            testTypeClass----class com.ccjjltx.reflect.rclass.TestClassType
            ----非静态的参数初始化--------
            ---------无参构造函数---------
            testGetClass-----class com.ccjjltx.reflect.rclass.TestClassType
             */
            /*
            根据结果可以发现，三种生成的Class对象一样的。并且三种生成Class对象只打印一次“静态的参数初始化”。
        我们知道，静态的方法属性初始化，是在加载类的时候初始化。而非静态方法属性初始化，是new类实例对象的时候加载。
        因此，这段程序说明，三种方式生成Class对象，其实只有一个Class对象。在生成Class对象的时候，首先判断内存中是否已经加载。
        所以，生成Class对象的过程其实是如此的：
        当我们编写一个新的Java类时,JVM就会帮我们编译成class对象,存放在同名的.class文件中。在运行时，当需要生成这个类的对象，
        JVM就会检查此类是否已经装载内存中。若是没有装载，则把.class文件装入到内存中。若是装载，则根据class文件生成实例对象。
             */
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class TestClassType {
    //静态的参数初始化
    static {
        System.out.println("------静态的参数初始化--------");
    }

    //构造函数
    public TestClassType() {
        System.out.println("---------无参构造函数---------");
    }

    {
        System.out.println("----非静态的参数初始化--------");
    }
}
