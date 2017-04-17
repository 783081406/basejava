/**
 * Created by ccjjltx on 2017/4/17.
 * 使用较多的是ByteBuffer和CharBuffer,其中Buffer子类则使用较少。其中ByteBuffer类还有一个子类：MappedByteBuffer，它用于表示Channel
 * 将批判文件的部分或全部内容映射到内存中后得到的结果，通常MappedByteBuffer对象由Channel的map()方法返回
 * <p>
 * Buffer有三个重要的概念，容量(capacity)、界限(limit)和位置(position):
 * 容量(capacity):缓冲区的容量（capacity）表示该Buffer的最大数据容量，即最多可以存储多少数据。缓冲区的容量不能为负值，创建后不能改变
 * 界限(limit):第一个不应该被读出或者写入的缓冲区位置所应。也就是说，位于limit后的数据即不可被读，也不可被写。
 * 位置(position):用于指明下一个可以被读出的或者写入的缓冲区位置索引(类似与IO流中记录指针）。当使用Buffer从Channel中读取数据时，position的值
 * 恰好等于已经读到了多少数据。当刚刚新建一个Buffer对象时，其position为0；如果从Channel中读取了2个数据到该Buffer中，则position为2，
 * 指向Buffer中第三个（第一个位置的索引为0）位置
 * 可选标记（mark，类似于传统IO流中的mark）
 * 0<=mark<=position<=limit<=capacity
 * <p>
 * 过程：
 * 装数据：
 * 开始时Buffer的position为0，limit为capacity，程序可通过put()方法向Buffer中放入一些数据(或者从Channel中获取一些数据),每放入一些数据，
 * Buffer的position相应地先后移动一些位置
 * <p>
 * 装数据之后：
 * 调用Buffer的flip()方法，该方法将limit设置为position所在位置，并且将position设为0，这就使得Buffer的读写指针又移动到了开始位置
 * 也就是说，Buffer调用flip()方法之后，Buffer为输出数据做好了准备
 * <p>
 * 输出数据结束之后：
 * Buffer调用clear()方法，clear()方法不是清空Buffer的数据，它仅仅将position置为0，这样再次向Buffer中装入数据做好了准备。
 * <p>
 * 其他常用方法：
 * int capacity():返回Buffer的capacity大小
 * boolean hasRemaining():判断当前位置(position)和界限(limit)之间是否还有元素可供处理
 * int limit():返回Buffer的界限(limit)的位置
 * Buffer limit(int newLt):重新设置界限(limit)的值，并返回一个具有新的limit的缓冲区对象
 * Buffer mark():设置Buffer的mark位置，它只能在0和位置(position)之间做mark
 * int position():返回Buffer中的position值
 * Buffer position(int newPs):设置Buffer的position，并返回position被修改后的Buffer对象
 * int remaining():返回当前位置和界限(limit)之间的元素个数
 * Buffer reset():将位置(position)转到mark所在的位置
 * Buffer rewind():将位置(position)设置成0，取消设置的mark
 * <p>
 * Buffer的所有子类还提供了两个重要的方法:put()和get()方法，用于先Buffer中放入数据和从Buffer中取出数据。当使用put()和get()方法放入、取出
 * 数据时，Buffer既支持对单个数据的访问，也支持对批量数据的访问(以数组作为参数)
 * 分相对和绝对数据：
 * 相对(Relative):从Buffer的当前position处开始读取或写入数据，然后将位置(position)的值按照处理元素的个数增加
 * 绝对(Absolute):直接根据索引想Buffer中读取或写入数据，使用绝对方式访问Buffer里的数据时，并不会影响位置(position)的值
 * <p>
 * 普通Buffer:创建成本低，不适用于短生存期、一次用完就丢弃的Buffer.
 * ByteBuffer.allocateDirect():创建成本高，读取效率更高，只适用于长生存期的Buffer.
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.nio;