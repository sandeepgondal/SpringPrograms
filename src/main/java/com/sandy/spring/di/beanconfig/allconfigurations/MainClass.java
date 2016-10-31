package com.sandy.spring.di.beanconfig.allconfigurations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring. This is mix of all configurations for a bean.");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("allConfigurations.xml");
        System.out.println(classPathXmlApplicationContext.getBean(Car.class));
    }

}
