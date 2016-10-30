package com.sandy.spring.di.propertyvalues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring. Initializing config values from property file");

        ApplicationContext context = new ClassPathXmlApplicationContext("propertyValuesConfig.xml");
        System.out.println(context.getBean("databaseBean"));
    }

}
