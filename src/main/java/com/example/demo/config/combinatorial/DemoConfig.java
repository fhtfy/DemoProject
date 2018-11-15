package com.example.demo.config.combinatorial;

import com.example.demo.entity.CombinatorialAnnotation.CustomConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@CustomConfiguration("com.example.demo.service")
@Configuration
@ComponentScan("com.example.demo.service.combinatorial")
public class DemoConfig {

}
