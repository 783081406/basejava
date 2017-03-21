package com.ccjjltx.objectoriented.renum.gender;

/**
 * Created by ccjjltx on 2017/3/21.
 * Gender1的做法依然不好，枚举类通常应该设置成不可变类，也就是说，他的成员变量值不应该允许改变
 * 如果将所有的成员变量使用final修饰符来修饰，所以必须在构造器里为这些成员变量制定初始值（或者在定义成员变量时指定默认值，或者
 * 在初始化块中指定初始化值，但是这两种情况不常见）
 * 应该为枚举类显示定义参数的构造器
 *
 * @author ccj
 * @version 1.0
 */
public enum Gender2 {
    //此处的枚举类必须调用对应的构造器来创建
    MALE("男"), FEMALE("女");
    //上面的语句相当于下面的语句
//    public static final Gener2 MALE=new Gender2("男");
//    public static final Gener2 FEMALE=new Gender2("女");
    private final String name;

    private Gender2(String name) {
        this.name = name;
    }

    public String getNmae() {
        return this.name;
    }
}
