package com.sandy.spring.di.callbackmethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring. Demoing callback methods");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("callbackMethods.xml");
        context.registerShutdownHook();

        System.out.println("\n\n\n\n\n\n\n");
        System.out.println(context.getBean("initDestroyCallbackBean"));
        System.out.println(context.getBean("postConstructPreDestroy"));
        System.out.println(context.getBean("initializeDisposableBean"));
    }

}
