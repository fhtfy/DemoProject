package com.example.demo.entity.CombinatorialAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 自定义组合注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration // 组合Configuration元注解
@ComponentScan // 组合ComponentScan元注解
public @interface CustomConfiguration {

    String[] value() default{}; // 覆盖Value参数
}
