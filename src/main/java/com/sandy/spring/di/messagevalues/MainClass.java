package com.sandy.spring.di.messagevalues;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring. Getting localized messages from properties file");

        ApplicationContext context = new ClassPathXmlApplicationContext("messageValuesConfig.xml");
        String userName = context.getMessage("user.name", new Object[] {"Vithal"}, Locale.US);
        System.out.println("User name: " + userName);
    }

}
