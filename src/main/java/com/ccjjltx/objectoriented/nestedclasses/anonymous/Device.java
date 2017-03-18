package com.ccjjltx.objectoriented.nestedclasses.anonymous;

/**
 * Created by ccjjltx on 2017/3/18.
 *
 * @author ccj
 * @version 1.0
 */
public abstract class Device {
    private String name;

    public Device() {
    }

    public Device(String name) {
    }

    public abstract double getPrice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
