package com.example.demo.config;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.example.demo.entity")
@PropertySource("classpath:static/test.properties")
public class EIConfig {

    @Value("HelloWorld")
    private String normal; // 注入普通字符串

    @Value("#{systemProperties['os.name']}")
    private String osName; // 注入操作系统信息

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber; // 注入表达式结果

    @Value("#{valueEntity.title}")
    private String title; // 注入其他bean属性

    @Value("classpath:static/test.txt")
    private Resource file; // 注入文件资源

    @Value("http://www.baidu.com")
    private String testUrl; // 注入网址资源

    @Autowired
    private Environment environment; // 注入配置文件

    public void outPutResource(){
        try{
            System.out.println(normal+"=="+osName+"=="+randomNumber+"=="+title+"=="+ IOUtils.toString(file.getInputStream()));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
