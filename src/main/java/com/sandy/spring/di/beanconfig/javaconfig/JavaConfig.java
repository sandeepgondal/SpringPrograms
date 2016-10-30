package com.sandy.spring.di.beanconfig.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean (name = "customer")
    @Scope (scopeName = "prototype")
    public Customer getCustomer() {
        System.out.println("---Creating Customer");
        return new Customer();
    }

    @Bean (name =  "item")
    public Item getItem() {
        System.out.println("---Creating Item");
        return new Item();
    }

}
