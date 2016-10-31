package com.sandy.spring.di.beanconfig.allconfigurations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring. This is mix of all configurations for a bean.");
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println(annotationConfigApplicationContext.getBean(Car.class));
    }

}
