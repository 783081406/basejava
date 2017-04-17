/**
 * Created by ccjjltx on 2017/4/17.
 * 可以直接将指定文件的部分或全部直接映射成Buffer
 * 不能直接访问Channel中的数据,包括读取写入都不行,Channel只能与Buffer进行交互
 * <p>
 * 常用的：
 * 支持线程之间通信的管道Channel：Pipe.SinkChannel,Pipe.SourceChannel
 * 支持TCP网络通信的Channel：ServerSocketChannel，SocketChannel
 * 支持UDP网络通信的Channel：DatagramChannel
 * 支持文件：FileChannel
 * <p>
 * Channel都不能通过构造器来直接创建，而是通过传统节点InputStream,OutputStream的getChannel()方法来返回对应的Channel,不同节点流获得的Channel不一样
 * 例如FileInputStream、FileOutputStream的getChannel()返回的是FileChannel
 * PipedInputStream和PipedOutputStream的getChannel()返回的是Pipe.SinkChannel、Pipe.SourceChannel
 * <p>
 * 常用三个方法：
 * MappedByteBuffer map(FileChannel.MapMode mode,long position,long size):第一个参数执行映射时的模式，分别有只读，读写等模式
 * 第二个、第三个参数用于控制将Channel的那些数据映射成ByteBuffer
 * read():
 * write():
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.nio.channel;