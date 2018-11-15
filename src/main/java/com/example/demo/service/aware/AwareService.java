package com.example.demo.service.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * spring感知测试service
 *
 * @author HuangLe
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware { // 实现两个接口，获得Bean名称和资源加载的服务
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String beanName) {  // 重写方法
        this.beanName=beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {  // 重写方法
        this.loader=resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);
        Resource resource=loader.getResource("classpath:/static/aware/test.txt");
        try{
            System.out.println("ResourceLoader加载的文件内容为："+ IOUtils.toString(resource.getInputStream()));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
