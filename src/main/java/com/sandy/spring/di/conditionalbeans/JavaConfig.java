package com.sandy.spring.di.conditionalbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Bean1 bean1() {
        return new Bean1();
    }

    @Bean
    @Conditional(MyCondition.class)
    public Bean2 bean2() {
        return new Bean2();
    }

}
