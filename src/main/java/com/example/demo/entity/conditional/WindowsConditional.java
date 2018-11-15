package com.example.demo.entity.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * 条件注解
 */
public class WindowsConditional implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 匹配windows系统
        return conditionContext.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
