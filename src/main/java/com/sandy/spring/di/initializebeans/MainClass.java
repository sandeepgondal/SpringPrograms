package com.sandy.spring.di.initializebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring, following are different ways of initialising beans.");

        ApplicationContext context = new ClassPathXmlApplicationContext("initializeBeans.xml");

        // Bean initialized with property
        System.out.println(context.getBean("propertyInitializeBean", InitializeBean.class));

        // Bean initialized with p-namespaces
        System.out.println(context.getBean("propertyInitializeBeanWithNamespaces", InitializeBean.class));

        // Bean initialized with constructor
        System.out.println(context.getBean("constructorInitializeBean", InitializeBean.class));

        // Bean initialized with c-namespaces
        System.out.println(context.getBean("constructorInitializeBeanWithNamespaces", InitializeBean.class));

        // Bean initialized with factory method
        System.out.println(context.getBean("factoryMethodInitializeBean", InitializeBean.class));

    }

}
