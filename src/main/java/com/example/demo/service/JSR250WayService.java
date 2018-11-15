package com.example.demo.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method"); // 在构造函数执行完之后运行
    }

    public JSR250WayService(){
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destory(){
        System.out.println("jsr250-destory-method"); // 在Bean销毁之前执行
    }
}
