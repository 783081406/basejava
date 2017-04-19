package com.ccjjltx.io.nio2.watchservice;

import java.nio.file.*;

/**
 * Created by ccjjltx on 2017/4/19.
 *
 * @author ccj
 * @version 1.0
 */
public class WatchServiceTest {
    public static void main(String[] args) throws Exception {
        //获取文件系统的WatchService对象
        WatchService watchService = FileSystems.getDefault().newWatchService();
        //为C:盘根路径注册监听
        Paths.get("c:/").register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.ENTRY_DELETE);
        while (true) {
            //获取下一个文件变化事件
            WatchKey key = watchService.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println(event.context() + "文件发生了" + event.kind() + "事件!");
            }
            //重设WatchKey
            boolean valid = key.reset();
            //如果重设失败，退出监听
            if (!valid) {
                break;
            }
        }
    }
}
