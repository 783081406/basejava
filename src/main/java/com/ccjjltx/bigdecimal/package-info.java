/**
 * Created by ccjjltx on 2017/2/26.
 * java的double类型会发生精度丢失，尤其在算数运算时，更容易发生这种情况
 * BigDecimal提供了大量用于创建BigDecimal对象，包括把所有的基本类型变量转换成一个BigDecimal对象，
 * 也包括利用数字字符串、数字字符数组来创建BigDecimal对象
 * 查看api可以发现BigDecimal(double val)构造器的详细说明时，可以看到不推荐使用该构造器
 * 主要是因为使用该构造器时有一定的不可预知性。当程序使用new BigDecimal(0.1)来创建一个BigDecimal对象时，他的值并不是0.1
 * 他实际上等于一个近似0.1的数。这是因为0.1无法准确地表示double浮点数，所以传入BigDecimal(String val)构造器的值不会正好等于0.1（虽说表面上等于这个值）
 * 如果是使用BigDecimal(String val)构造器的结果是可预知的--写入new BigDecimal("0.1")将创建一个BigDecimal，
 * 他正好等于预期的0.1，因此通常建议优先使用基于String的构造器
 * 如果必须使用double浮点数作为BigDecimal构造器的参数时候，不要直接将该double浮点数作为构造器参数创建BigDecimal对象，
 * 而是应该通过BigDecimal.valueOf(double value)静态方法来创建BigDecimal对象
 * 该类还提供add(),subtract(),multiply(),divide(),pow()等方法对精确浮点数进行常规运算
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.bigdecimal;