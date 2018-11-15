package com.example.demo.config.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.example.demo.service.scheduled")
@EnableScheduling
public class TaskScheduledConfig {

}
