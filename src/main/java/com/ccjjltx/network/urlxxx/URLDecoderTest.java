package com.ccjjltx.network.urlxxx;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by ccjjltx on 2017/4/23.
 *
 * @author ccj
 * @version 1.0
 */
public class URLDecoderTest {
    public static void main(String[] args) throws Exception {
        //转换成普通字符串
        String keyWord = URLDecoder.decode("%E7%BC%96%E7%A8%8B", "utf-8");
        System.out.println(keyWord);
        //将普通字符串转换成application/x-www-form-urlencoded字符串
        String urlStr = URLEncoder.encode("编程", "utf-8");
        System.out.println(urlStr);
        /*
        编程
        %E7%BC%96%E7%A8%8B
         */
    }
}
