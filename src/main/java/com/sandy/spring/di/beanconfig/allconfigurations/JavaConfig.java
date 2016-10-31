package com.sandy.spring.di.beanconfig.allconfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Tyre getTyre() {
        return new Tyre();
    }
}
