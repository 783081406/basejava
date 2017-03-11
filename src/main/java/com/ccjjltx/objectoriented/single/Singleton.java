package com.ccjjltx.objectoriented.single;

/**
 * Created by ccjjltx on 2017/3/11.
 *
 * @author ccj
 * @version 1.0
 */
public class Singleton {
    //使用一个类变量来缓存曾经创建的实例
    private static Singleton instance;

    //对构造器使用private，隐藏该构造器
    private Singleton() {
    }

    //提供一个静态方法，用于返回Singleton实例
    //该方法可以加入自定义控制，保证只能产生一个Singleton对象
    public static Singleton getInstance() {
        //如果instance为null，这表明还不曾创建Singleton对象
        //如果instance不为null，则表明已经创建了Singleton对象
        //将不会重新创建新的实例
        if (instance == null) {
            //创建一个Singleton对象，并将其缓存起来
            instance = new Singleton();
        }
        return instance;
    }
}
