package com.example.demo.service.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

    @Async
    public void executorAsyncTask(Integer i){
        System.out.println("============>正在异步执行任务一"+i+"当前线程为："+Thread.currentThread().getName());
    }

    @Async
    public void executorAsyncTaskPlus(Integer i){
        System.out.println("============>正在异步执行任务二"+i+"当前线程为："+Thread.currentThread().getName());
    }
}
