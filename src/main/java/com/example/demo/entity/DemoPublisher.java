package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;

    // 发布消息
    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this,msg));
    }
}
