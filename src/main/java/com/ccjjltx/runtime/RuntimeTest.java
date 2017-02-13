package com.ccjjltx.runtime;

import java.io.IOException;

/**
 * Created by ccj on 2017/2/13.
 * @author ccj
 * @version 1.0-SHAPSHOT
 */
public class RuntimeTest {
    public static void main(String[] args){
        Runtime rt=Runtime.getRuntime();
        System.out.println("处理器数量:"+rt.availableProcessors());
        System.out.println("空闲内存数:"+rt.freeMemory());
        System.out.println("总内存:"+rt.totalMemory());
        System.out.println("可用最大内存数:"+rt.maxMemory());
        //////////////////////////
        long mem1,mem2;
        Integer someints[]=new Integer[1000];
        System.out.println("Total memory is:"+rt.totalMemory());
        mem1= rt.freeMemory();
        System.out.println("Initial free is:"+mem1);
        rt.gc();
        mem1=rt.freeMemory();
        System.out.println("Free memory after garbage collection:"+mem1);
        //allocate integers
        for(int i=0;i<1000;i++)
            someints[i]= i;
        mem2=rt.freeMemory();
        System.out.println("Free memory after allocation:"+mem2);
        System.out.println("Memory used by allocation:"+(mem1-mem2));
        //discard Integers
        for(int i=0;i<1000;i++)
            someints[i]=null;
        rt.gc();//request garbage collection
        mem2=rt.freeMemory();
        System.out.println("Free memory after collection discard integers :"+mem2);
        ///////////////////////////////////////////
        try {
            Process p = rt.exec("notepad.exe");
            Thread.sleep(5000);
            //休眠5秒后关闭记事本
            p.destroy();
        }catch (IOException e){
            System.out.println("异常：exec发生IOException");
        }catch(InterruptedException e){
            System.out.println("异常：线程中断");
        }
    }
}
