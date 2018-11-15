package com.example.demo;

import com.example.demo.config.combinatorial.DemoConfig;
import com.example.demo.service.BeanWayService;
import com.example.demo.service.combinatorial.DemoService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DemoApplication.class, args);
//        AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext(PrePostConfig.class);
//        BeanWayService beanWayService=configApplicationContext.getBean(BeanWayService.class);
//        JSR250WayService jsr250WayService=configApplicationContext.getBean(JSR250WayService.class);
//        configApplicationContext.close();

//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AwareConfig.class);
//        AwareService awareService=context.getBean(AwareService.class);
//        awareService.outputResult();
//        context.close();

//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
//        AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);
//        // 任务调用次数不能大于最大队列数，否则会报错
//        for(int i=0;i<20;i++){
//            asyncTaskService.executorAsyncTask(i);
//            asyncTaskService.executorAsyncTaskPlus(i);
//        }
//        context.close();

        // AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskScheduledConfig.class);

//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConditionConfig.class);
//        ListService listService=context.getBean(ListService.class);
//        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下，"+listService.showListCmd());
//        context.close();

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService=context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
