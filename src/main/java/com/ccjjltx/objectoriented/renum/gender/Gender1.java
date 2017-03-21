package com.ccjjltx.objectoriented.renum.gender;


/**
 * Created by ccjjltx on 2017/3/21.
 *
 * @author ccj
 * @version 1.0
 */
public enum Gender1 {
    MALE, FEMALE;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        switch (this) {
            case MALE:
                if (name.equals("男")) {
                    this.name = name;
                } else {
                    System.out.println("参数化错误");
                    return;
                }
                break;
            default:
                if (name.equals("女")) {
                    this.name = name;
                } else {
                    System.out.println("参数化错误");
                    return;
                }
                break;
        }
    }
}
