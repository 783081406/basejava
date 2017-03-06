/**
 * Created by ccjjltx on 2017/3/6.
 * 功能函数，可以作为分配的目标和lambda表达式或方法的参考
 * default<V> Function<T,V> andThen(Function<? super R,? extends V> after)
 * 返回一个先执行当前函数对象apply方法再执行after函数对象apply方法的函数对象
 * R  apply(T t)  将Function对象应用到输入的参数上，然后返回计算结果
 * default<V> Function <V,R> compose(Function<? super V,? extends T> before)
 * 返回一个先执行before函数对象apply方法再执行当前函数对象apply方法的函数对象
 * static<T> Function<T,T> identity()     返回一个执行了apply()方法之后只会返回输入参数对象
 * 直接子类有一个:UnaryOperator<T>
 * static<T> UnaryOperator<T> identity()
 * 要求输入和输出的参数类型是一致的
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.function;