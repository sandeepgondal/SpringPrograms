package com.sandy.spring.di.conditionalbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring. Beans are created based on condition");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Bean1 bean1 = context.getBean(Bean1.class);
        bean1.print();
        Bean2 bean2 = context.getBean(Bean2.class);
        bean2.print();
    }

}
