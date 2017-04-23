package com.ccjjltx.network.url.download;

/**
 * Created by ccjjltx on 2017/4/23.
 *
 * @author ccj
 * @version 1.0
 */
public class MultiThreadDown {
    public static void main(String[] args) throws Exception {
        // 初始化DownUtil对象
        DownUtil downUtil = new DownUtil("http://119.29.181.235/picture.jpg"
                , "picture.jpg", 2);
        // 开始下载
        downUtil.download();
        new Thread(() -> {
            while (downUtil.getCompleteRate() < 1) {
                // 每隔0.1秒查询一次任务的完成进度，
                // GUI程序中可根据该进度来绘制进度条
                System.out.println("已完成：" + downUtil.getCompleteRate());
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                }
            }
        }).start();
    }
}

