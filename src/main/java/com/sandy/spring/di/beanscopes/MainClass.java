package com.sandy.spring.di.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Welcome Spring. Demoing bean scopes");

        ApplicationContext context = new ClassPathXmlApplicationContext("beanscopes.xml");

        // Constructor of Singleton bean is called once for any number of bean references.
        System.out.println(context.getBean("singletonBean", SingletonBean.class));
        System.out.println(context.getBean("singletonBean", SingletonBean.class));

        // Constructor of Prototype beans called every time bean request is made. New bean is created.
        System.out.println(context.getBean("prototypeBean", PrototypeBean.class));
        System.out.println(context.getBean("prototypeBean", PrototypeBean.class));
    }
}
