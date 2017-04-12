/**
 * Created by ccjjltx on 2017/4/12.
 * Class、Constructor、Field、Method、Package都继承了AnnotatedElement接口，只有当定义Annotation使用了@Retention（RetentionPolicy.RUNTIME)修饰
 * 该Annotation才会在运行时可见，JVM才会装载*.class文件时读取保存在class文件中的Annotation
 * <p>
 * Annotation方法：
 * <T extends Annotation> T	getAnnotation(Class<T> annotationClass):返回该程序元素上存在的、指定类型的注解，如果该类型的注解不存在，则返回null
 * Annotation[]	getAnnotations():返回该程序元素上存在的所有注解
 * default <T extends Annotation> T[] getAnnotationsByType(Class<T> annotationClass)：与getAnnotation()方法基本相似。但由于java8
 * 增加了重复注解功能，因此需要使用该方法获取修饰程序元素、指定类型的多个Annotation。
 * default <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass)：j8新增的方法，该方法尝试获取直接修饰该程序元素、指定类型的Annotation。
 * 如果该类型的注解不存在，则返回null.
 * Annotation[]	getDeclaredAnnotations()：返回直接修饰该程序元素的所有Annotation.
 * default <T extends Annotation> T[] getDeclaredAnnotationsByType(Class<T> annotationClass):与getDeclaredAnnotations()方法基本相似。但是j8
 * 新增了重复注解功能，因此需要使用该方法获取直接修饰该程序元素、制定类型的多个Annotation.
 * default boolean isAnnotationPresent(Class<? extends Annotation> annotationClass):判断该程序元素上是否存在指定类型的注解，如果存在则返回true，否则返回false
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.annotation.annotatedelement;