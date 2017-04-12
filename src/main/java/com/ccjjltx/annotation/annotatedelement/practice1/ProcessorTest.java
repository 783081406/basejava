package com.ccjjltx.annotation.annotatedelement.practice1;

import java.lang.reflect.Method;

/**
 * Created by ccjjltx on 2017/4/12.
 * 注解处理工具
 *
 * @author ccj
 * @version 1.0
 */
public class ProcessorTest {
    public static void process(String clazz) throws ClassNotFoundException {
        int passed = 0;
        int failed = 0;
        //遍历clazz的所有方法
        for (Method m : Class.forName(clazz).getMethods()) {
            if (m.isAnnotationPresent(Testable.class)) {
                try {
                    m.invoke(null);
                    passed++;
                } catch (Exception ex) {
                    System.out.println("方法" + m.getName() + ",运行失败，异常:" + ex.getCause());
                    failed++;
                }
            }
        }
        //统计测试结果
        System.out.println("共运行了:" + (passed + failed) + "个方法，其中:\n" + "失败了:" + failed + "个,\n成功了:" + passed + "个;");
    }
}
