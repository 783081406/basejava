package com.ccjjltx.function;

import java.util.function.Function;

/**
 * Created by ccjjltx on 2017/3/6.
 *
 * @author ccj
 * @version 1.0
 */
public class FuntionTest {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 10;
        modifyTheValue(number2, ele -> ele + number1);//30
        System.out.println(number2);//10
        number2 = 15;
        modifyTheValue(number2, val -> val * 10);//150
        System.out.println(number2);//15
    }

    private static void modifyTheValue(int valueToBeOperated, Function<Integer, Integer> function) {
        int newValue = function.apply(valueToBeOperated);
        System.out.println(newValue);
    }
}
