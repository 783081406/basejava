/**
 * Created by ccjjltx on 2017/4/15.
 * RandomAccessFile是Java输入/输出流体系中功能最丰富的文件内容访问类
 * 提供了众多的方法来访问文件内容，既可以读取文件内容，也可以向文件输出数据
 * 支持“随机访问”的方式，程序可以直接跳转到文件的任意地方来读取数据。
 * 可以不从开始的地方开始输出，向已存在的文件后追加内容
 * 局限：只能读写文件，不能读写其他IO节点
 * RandomAccessFile对象包含了一个记录指针，既可以向前移动，也可以向后移动。包含了两个来操作文件记录指针：
 * long getFilePointer():返回文件记录指针的当前位置
 * void seek(long pos):将文件记录指针定位到pos位置
 * <p>
 * 创建RandomAccessFile对象时还需要指定一个mode参数，该参数指定RandomAccessFile的访问模式，该参数有4个值：
 * "r":以只读方式打开指定文件。如果试图对该RandomAccessFile执行写入方法，都将抛出IOException异常
 * "rw":以读、写方式打开指定文件。如果该文件尚不存在，则尝试创建该文件
 * "rws":以读、写方式打开指定文件。相当于"rw"模式，还要求对文件的内容或元数据的每个更新都同步写入到底层存储设备。
 * "rwd":以读、写方式打开指定文件。相当于"rw"模式，还要求对文件内容的每个更新都同步写入到底层存储设备。
 *
 * @author ccj
 * @version 1.0
 */
package com.ccjjltx.io.randomaccessfile;