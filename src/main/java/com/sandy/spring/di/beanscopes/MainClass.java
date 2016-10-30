package com.sandy.spring.di.beanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Welcome Spring. Demoing bean scopes");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscopes.xml");

        // Constructor of Singleton bean is called once for any number of bean references.
        System.out.println("\n\n\n\n\n\n\nSingleton scope");
        System.out.println(context.getBean("singletonBean", SingletonBean.class));
        System.out.println(context.getBean("singletonBean", SingletonBean.class));

        // Constructor of Prototype beans called every time bean request is made. New bean is created.
        System.out.println("\n\n\n\n\n\n\nPrototype scope");
        System.out.println(context.getBean("prototypeBean", PrototypeBean.class));
        System.out.println(context.getBean("prototypeBean", PrototypeBean.class));

        // Custom scope
        System.out.println("\n\n\n\n\n\n\nCustom scope");
        context.getBeanFactory().registerScope("custom", new CustomScope());
        System.out.println(context.getBean("customScope", CustomScopeBean.class));
        System.out.println("Is equal : " + (context.getBean("customScope", CustomScopeBean.class) == context.getBean("customScope", CustomScopeBean.class)));
    }
}
