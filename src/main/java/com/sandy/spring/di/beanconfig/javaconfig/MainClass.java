package com.sandy.spring.di.beanconfig.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring ... Java based configuration for DI");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Customer customer1 = (Customer) context.getBean("customer");
        Customer customer2 = (Customer) context.getBean("customer");
        System.out.println(customer1);
        System.out.println(customer2);
    }

}
