package com.sandy.spring.aop.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring. Demoing introduction...");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Calculator calculator = context.getBean(Calculator.class);
        calculator.calculate();
        System.out.println(calculator);
        ((Printable) calculator).printIt();
    }

}

