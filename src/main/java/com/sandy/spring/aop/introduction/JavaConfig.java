package com.sandy.spring.aop.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class JavaConfig {

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

    @Bean
    public InkPrinter inkPrinter() {
        return new InkPrinter();
    }

    @Bean
    public Introductor introductor() {
        return new Introductor();
    }

}
