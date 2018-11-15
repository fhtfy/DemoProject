package com.example.demo.service.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计划任务service
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateForamt=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次"+dateForamt.format(new Date()));
    }

    @Scheduled(cron="0 28 11 ? * *") // 每天十一点二十八分执行 ,cron属性为UNIX和类UNIX系统下的定时任务，windows环境下GG
    public void fixTimeExecutor(){
        System.out.println("在指定时间"+dateForamt.format(new Date())+"执行");
    }
}
