package com.sandy.spring.aop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring AOP");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Performance performance = (Performance) context.getBean("streetPerformance");
        performance.perform();
    }

}
