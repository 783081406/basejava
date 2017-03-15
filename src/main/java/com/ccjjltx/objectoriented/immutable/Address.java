package com.ccjjltx.objectoriented.immutable;

/**
 * Created by ccjjltx on 2017/3/15.
 *
 * @author ccj
 * @versio 1.0
 */
public class Address {
    private final String detail;
    private final String postCode;

    //在构造器初始化两个实例变量
    public Address() {
        this.detail = "";
        this.postCode = "";
    }

    public Address(String detail, String postCode) {
        this.detail = detail;
        this.postCode = postCode;
    }

    //仅为两个实例变量提供getter方法
    public String getDetail() {
        return detail;
    }

    public String getPostCode() {
        return postCode;
    }

    //重写equals()方法，判断两个对象是否相等
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj != null && obj.getClass() == Address.class) {
            Address address = (Address) obj;
            return (this.getDetail().equals(address.getDetail())) && (this.getPostCode().equals(address.getPostCode()));
        }
        return false;
    }

    //equals方法返回相等时候，hashCode()也要相等
    @Override
    public int hashCode() {
        return detail.hashCode() + postCode.hashCode() * 31;
    }
}
