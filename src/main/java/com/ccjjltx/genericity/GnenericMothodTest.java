package com.ccjjltx.genericity;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ccjjltx on 2017/3/16.
 * 使用泛型方法，但是没使用泛型，（Java5提供的泛型方法（Generic Method))
 * @author ccj
 * @version 1.0
 */
public class GnenericMothodTest {

    //声明一个泛型方法，该泛型方法中带一个T类型形参
    static <T> void fromArrayToCollection(T[] a,Collection<T> s){
        for(T o:a){
            s.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] oa=new Object[100];
        Collection<Object> co=new ArrayList<>();
        fromArrayToCollection(oa,co);
        ///////////////////////////////
        String[] sa=new String[100];
        Collection<String> cs=new ArrayList<>();
        fromArrayToCollection(sa,cs);

    }
}
