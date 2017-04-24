package com.ccjjltx.network.getpost;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Created by ccjjltx on 2017/4/24.
 *
 * @author ccj
 * @version 1.0
 */
public class GetPostTest {
    /**
     * 向指定URL发送GET方式的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，格式满足name1=value1&name2=value2的形式
     * @return URL代表远程资源的响应
     */
    public static String sendGet(String url, String param) {
        String result = "";
        String urlName = url + "?" + param;
        try {
            URL realUrl = new URL(urlName);
            //打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
            //建立实际的链接
            conn.connect();
            //获取所有相应头字段
            Map<String, List<String>> map = conn.getHeaderFields();
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            try (
                    //定义BufferedReader输入流来读取URL的响应
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                String line = null;
                while ((line = in.readLine()) != null) {
                    result += "\n" + line;
                }
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常!" + e);
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 向指定URL发送POST方式的请求
     *
     * @param url   发送请求的URL
     * @param param 请求参数，可是应该满足name1=value1&name2=value2的形式
     * @return URL代表远程资源的响应
     */
    public static String sendPost(String url, String param) {
        String result = "";
        try {
            URL realUrl = new URL(url);
            //打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            //设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36");
            //发送Post请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            try (
                    //获取URLConnection对象对应的输入流
                    PrintWriter out = new PrintWriter(conn.getOutputStream())) {
                //发送请求参数
                out.print(param);
                //flush输出流的缓冲
                out.flush();
            }
            try (
                    //定义BufferedReader输入流来读取URL的响应
                    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                String line;
                while ((line = in.readLine()) != null) {
                    result += "\n" + line;
                }
            }
        } catch (Exception e) {
            System.out.println("发送POST请求出现异常!" + e);
            e.printStackTrace();
        }
        return result;
    }

    //提供主方法，测试发送GET请求和POST请求
    public static void main(String args[]) {
        //发送GET请求
        String s = sendGet("http://localhost:8080/abc/a.jsp", null);
        System.out.println(s);
        //发送Post请求
        String s1 = GetPostTest.sendPost("http://localhost:8080/abc/login.jsp"
                , "name=crazyit.org&pass=leegang");
        System.out.println(s1);
    }
}
