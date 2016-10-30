package com.sandy.spring.di.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring ... Annotation based configuration for DI");

        ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationConfig.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

}
