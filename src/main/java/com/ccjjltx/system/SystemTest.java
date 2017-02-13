package com.ccjjltx.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by ccj on 2017/2/13.
 *
 * @author ccj
 * @version 1.0-SHAPSHOT
 */
public class SystemTest {
    public static void main(String[] args) {
        //获取系统所有的环境变量
        Map<String, String> env = System.getenv();
        for (String name : env.keySet()) {
            System.out.println(name + "--->" + env.get(name));
        }
        //获取指定环境变量的值
        System.out.println("JAVA_HOME" + "--->" + System.getenv("JAVA_HOME"));

        //////////////////////////////////////////////////////////////////////////////
        //获取所有系统属性
        Properties props = System.getProperties();
        //将所有的系统属性保存到props.txt文件中
        try {
            props.store(new FileOutputStream(new File("src\\main\\java\\com\\ccjjltx\\system\\props.txt")), "System Properties");
        } catch (FileNotFoundException f) {
            System.out.println("异常:文件没有发现");
        } catch (IOException e) {
            System.out.println("异常:io异常");
        }
        //输出特定的系统属性
        System.out.println(System.getProperty("os.name"));

        /////////////////////////////////////////////////////////
        /*
        identityHashCode(Object x)方法，该方法返回指定对象的精确hashCode值，也就是根据该对象的地址计算得到的hashCode值。
        当某个类的hashCode()方法被重写后，该类实例的hashCode()方法就不能唯一地标识该对象；
        但通过identityHashCode()方法返回的hashCode值，仍然是根据该对象的地址计算方法得到的hashCode值。
        所以，如果两个对象的identityHashCode值相同，则两个对象绝对是同一对象
         */
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        //String重写了hashCode()方法-改为根据字符串序列计算hashCode值
        //因为s1和s2的字符串序列相同，所以他们的hashCode()方法返回值相同
        System.out.println("s1和s2的hashCode比较" + s1.hashCode() + "----" + s2.hashCode());
        //s1和s2是不同字符串对象，所以它们的identityHashCode值不同
        System.out.println("s1和s2通过identityHashCode()返回的hashCode比较" + System.identityHashCode(s1) + "-----" + System.identityHashCode(s2));
        String s3 = "Java";
        String s4 = "Java";
        //s3和s4是相同的字符串对象，所以他们的identityHashCode值相同
        System.out.println("s3和s4通过identityHashCode()返回的hashCode比较" + System.identityHashCode(s3) + "------" + System.identityHashCode(s4));

        /////////////////////////////////////////////
        //数组拷贝，也就是将一个数组中的内容复制到另一个数组中的指定位置，由于该方法是native所以性能比起使用循环高效
        int a[] = {1, 2, 3, 4};
        int b[] = new int[5];
        //将数组a中，从下标1开始复制到数组b,从下标3开始共复制两个
        //也就是a[1]复制b[3],a[2]复制b[4]
        System.arraycopy(a, 1, b, 3, 2);
        System.out.println("array b:" + b.toString());

        ////////////////////////////////////////////////
        //该方法表达格式为当前时间和GMT时间(格林威治时间)1970-1-1 0：0：0
        //该方法经常用来测试不同算法程序的执行效率高低，也用于后期线程控制的精确延时实现
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - start));
    }
}
