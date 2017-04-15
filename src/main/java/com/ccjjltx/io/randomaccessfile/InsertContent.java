package com.ccjjltx.io.randomaccessfile;

import java.io.*;

/**
 * Created by ccjjltx on 2017/4/15.
 * RandomAccessFile依然不能向文件和指定位置插入内容，如果直接将文件记录指针移动到中间某位置后开始输出，如果需要向指定位置
 * 插入内容，程序需要先把插入点后面的内容读入缓冲区，等把需要插入的数据写入文件后，再将缓冲区的内容追加到文件后面
 *
 * @author ccj
 * @version 1.0
 */
public class InsertContent {
    public static void insert(String fileName, long pos, String insertContent) throws IOException {
        File tmp = File.createTempFile("tmp", null);
        tmp.deleteOnExit();
        try (
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
                //使用临时文件来保存输入点后的数据
                FileOutputStream fileOutputStream = new FileOutputStream(tmp);
                FileInputStream fileInputStream = new FileInputStream(tmp)) {
            randomAccessFile.seek(pos);
            //插入点后面的临时文件中保存
            byte[] bbuf = new byte[64];
            //用于保存实际读取的字节数
            int hasRead = 0;
            while ((hasRead = randomAccessFile.read(bbuf)) > 0) {
                fileOutputStream.write(bbuf, 0, hasRead);
            }
            //下面代码用于插入的内容
            randomAccessFile.seek(pos);
            randomAccessFile.write(insertContent.getBytes());
            //追加临时文件的内容
            while ((hasRead = fileInputStream.read(bbuf)) > 0) {
                randomAccessFile.write(bbuf, 0, hasRead);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        insert("src/main/java/com/ccjjltx/io/randomaccessfile/out.txt", 46, "插入的内容\r\n");
    }
    /*
    字节流，所以如果刚刚好在一个汉字的编码中间切开，这个汉字将会乱码
     */
}
