package com.example.demo.config.conditional;

import com.example.demo.entity.conditional.LinuxConditional;
import com.example.demo.entity.conditional.WindowsConditional;
import com.example.demo.service.conditional.LinuxListService;
import com.example.demo.service.conditional.ListService;
import com.example.demo.service.conditional.WindowListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsConditional.class) // 符合windows环境条件实体化WindowsListService
    public ListService windowsListService(){
        return new WindowListService();
    }

    @Bean
    @Conditional(LinuxConditional.class) //  // 符合linux环境条件实体化LinuxListService
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
