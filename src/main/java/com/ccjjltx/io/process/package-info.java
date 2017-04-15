/**
 * Created by ccjjltx on 2017/4/15.
 * Process对象由该Java程序启动的子进程。
 * Process类提供了三个方法用于让程序和其子进程进行通信。
 * InputStream getErrorStream():获取子进程的错误流
 * InputStream getInputStream():获取子进程的输入流
 * OutputStream getOutputStream():获取子进程的输出流
 * <p>
 * 此处的输入流、输出流非常容易混淆，如果试图让子进程读取程序中的数据，那么应该用输出流。要站在Java程序的角度来看问题，子进程读取
 * Java程序的数据，就是让Java程序吧数据输出到子程序中（就像把数据输出到文件中一样，只是现在由子进程节点代替了文件节点），所以
 * 应该使用输出流
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.process;