package com.ccjjltx.io.nio;

import java.nio.CharBuffer;

/**
 * Created by ccjjltx on 2017/4/17.
 *
 * @author ccj
 * @version 1.0
 */
public class BufferTest {
    public static void main(String[] args) {
        //创建Buffer
        CharBuffer charBuffer = CharBuffer.allocate(8);
        System.out.println("capacity:" + charBuffer.capacity());
        System.out.println("limit:" + charBuffer.limit());
        System.out.println("position:" + charBuffer.position());
        //放入元素
        charBuffer.put('a');
        charBuffer.put('b');
        charBuffer.put('c');
        System.out.println("加入三个元素后,position=" + charBuffer.position());
        //调用flip()方法，做输出准备
        charBuffer.flip();
        System.out.println("执行flip()后,limit=" + charBuffer.limit());
        System.out.println("position=" + charBuffer.position());
        //取出第一个元素
        System.out.println("第一个元素(position=0):" + charBuffer.get());
        System.out.println("取出第一个元素后,position=" + charBuffer.position());
        //调用clear()方法，做再次输入准备
        charBuffer.clear();
        System.out.println("执行clear()后，limit=" + charBuffer.limit());
        System.out.println("执行clear()后，position=" + charBuffer.position());
        //因为采用的是根据索引来取值的方式，所以该方法不会影响Buffer的position
        System.out.println("执行clear()后，缓冲区内容并没有被清除:第三个元素为:" + charBuffer.get(2));
        System.out.println("执行绝对读取后，position=" + charBuffer.position());
        /*
        capacity:8
        limit:8
        position:0
        加入三个元素后,position=3
        执行flip()后,limit=3
        position=0
        第一个元素(position=0):a
        取出第一个元素后,position=1
        执行clear()后，limit=8
        执行clear()后，position=0
        执行clear()后，缓冲区内容并没有被清除:第三个元素为:c
        执行绝对读取后，position=0
         */
    }
}
