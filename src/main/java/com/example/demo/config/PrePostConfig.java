package com.example.demo.config;

import com.example.demo.service.BeanWayService;
import com.example.demo.service.JSR250WayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.service")
public class PrePostConfig {

    // 手动指定init和destroy方法在初始化之后和销毁之前执行
    @Bean(initMethod="init",destroyMethod="destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
