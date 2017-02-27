package com.ccjjltx.bigdecimal;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by ccjjltx on 2017/2/27.
 * 测试工具类
 *
 * @author ccj
 * @version 1.0
 */
public class ArithTest {
    /**
     * 加法测试
     */
    @Test
    public void testAdd() {
        TestCase.assertEquals(2.0, Arith.add(1.0, 1.0));
    }

    /**
     * 减法测试
     */
    @Test
    public void testSub() {
        TestCase.assertEquals(0.0, Arith.add(1.0, 1.0));
    }

    /**
     * 乘法测试
     */
    @Test
    public void testMul() {
        TestCase.assertEquals(1.0, Arith.add(1.0, 1.0));
    }

    /**
     * 除法测试
     */
    @Test
    public void testDiv() {
        TestCase.assertEquals(1.0, Arith.div(1.0, 1.0));
        TestCase.assertEquals(1.0, Arith.div(1.0, 1.0, 1));
    }

    /**
     * 四舍五入测试
     */
    @Test
    public void testRound() {
        TestCase.assertEquals(1.4445, Arith.round(1.44446, 4));
    }

    /**
     * float类型转换测试
     */
    @Test
    public void testConvertsToFloat() {
        TestCase.assertEquals(1.22f, Arith.convertsToFloat(1.22));
    }

    /**
     * int类型转换
     */
    @Test
    public void testConvertsToInt() {
        TestCase.assertEquals(1, Arith.convertsToInt(1.22));
    }

    /**
     * long类型转换
     */
    @Test
    public void testConvertsLong() {
        TestCase.assertEquals(1L, Arith.convertsToLong(1.11));
    }

    /**
     * 比较两个数最大
     */
    @Test
    public void testReturnMax() {
        TestCase.assertEquals(3.0, Arith.returnMax(1.0, 3.0));
    }

    /**
     * 比较两个数最小
     */
    @Test
    public void testReturnMin() {
        TestCase.assertEquals(1.0, Arith.returnMin(1.0, 3.0));
    }

    /**
     * 比较两个数
     */
    @Test
    public void testCompareTo() {
        TestCase.assertEquals(0, Arith.compareTo(1.0, 1.0));
    }


}
