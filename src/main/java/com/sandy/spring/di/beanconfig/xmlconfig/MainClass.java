package com.sandy.spring.di.beanconfig.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring ... XML Based configuration for DI");

        ApplicationContext context = new ClassPathXmlApplicationContext("XMLConfig1.xml", "XMLConfig2.xml");
        Employee employee = (Employee) context.getBean("employee");
        Department department = context.getBean("department", Department.class);
        System.out.println(employee);
        System.out.println(department);
    }

}
