package com.ccjjltx.annotation.annotatedelement.repeatable;

/**
 * Created by ccjjltx on 2017/4/12.
 *
 * @author ccj
 * @version 1.0
 */
@FkTag(age = 5)
@FkTag(name = "ccj2", age = 23)
public class FkTagTest {
    public static void main(String[] args) {
        Class<FkTagTest> clazz = FkTagTest.class;
       /* 使用Java 8新增的getDeclaredAnnotationsByType()方法获取
            修饰FkTagTest类的多个@FkTag注解 */
        FkTag[] tags = clazz.getDeclaredAnnotationsByType(FkTag.class);
        // 遍历修饰FkTagTest类的多个@FkTag注解
        for (FkTag tag : tags) {
            System.out.println(tag.name() + "-->" + tag.age());
        }
         /* 使用传统的getDeclaredAnnotation()方法获取
            修饰FkTagTest类的@FkTags注解 */
        FkTags container = clazz.getDeclaredAnnotation(FkTags.class);
        System.out.println(container);
        /*
        ccj-->5
        ccj2-->23
        @com.ccjjltx.annotation.annotatedelement.repeatable.FkTags(value=[@com.ccjjltx.annotation.annotatedelement
        .repeatable.FkTag(name=ccj, age=5), @com.ccjjltx.annotation.annotatedelement.repeatable.FkTag(name=ccj2, age=23)])
         */
    }
}
