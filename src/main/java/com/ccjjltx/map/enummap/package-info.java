/**
 * Created by ccjjltx on 2017/4/8.
 * 是一个与枚举类一起使用的Map实现，EnumMap中的所有key都必须是单个枚举类的枚举值。创建EnumMap时必须显式或阴式指出它对应的枚举值
 * 特点：
 * EnumMap在内部以数组形式保存，所以这种思想形式非常紧凑、高效
 * EnumMap根据key的自然顺序（即枚举值在枚举类中的定义顺序）来维护key-value对的顺序，当程序通过keySet()、entrySet()、value()等
 * 方法遍历EnumMap时可以看到这种顺序
 * EnumMap不允许使用null作为key，但允许使用null作为value。如果试图使用null作为key时将抛出NullPointerException异常。如果只是查询是否
 * 包含未null的key，或只是删除值为null的key，都不会抛出异常
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.map.enummap;