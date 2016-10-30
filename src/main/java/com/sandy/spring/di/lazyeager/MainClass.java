package com.sandy.spring.di.lazyeager;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Welcome Spring. Demonstrating lazy and eager bean initializing");

        ApplicationContext context = new ClassPathXmlApplicationContext("lazyEager.xml");
        System.out.println(context.getBean("lazyBean"));
        System.out.println(context.getBean("eagerBean"));
    }

}
