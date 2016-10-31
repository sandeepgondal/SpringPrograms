package com.sandy.spring.di.beanconfig.allconfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:allConfigurations.xml")
public class JavaConfig {

    @Bean
    public Tyre getTyre() {
        return new Tyre();
    }
}
