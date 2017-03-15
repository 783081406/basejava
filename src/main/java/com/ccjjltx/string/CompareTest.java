package com.ccjjltx.string;

/**
 * Created by ccjjltx on 2017/3/15.
 * @author ccj
 * @version 1.0
 */
public class CompareTest {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);//true
        System.out.println(s3.equals(s4));//true
        System.out.println(s3.equals(s1));//true
        System.out.println(s3.hashCode());//96354
        System.out.println(s3.hashCode());//96354
    }
}
