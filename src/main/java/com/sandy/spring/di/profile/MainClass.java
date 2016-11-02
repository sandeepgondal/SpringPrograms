package com.sandy.spring.di.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("hello Spring. Demoing spring profiles.");

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DevJavaConfig.class,
                                                                                                        QAJavaConfig.class,
                                                                                                        ProdJavaConfig.class);

        // Set system property with -Dspring.profiles.default=prod
        MyBean myBean = applicationContext.getBean("myBean", MyBean.class);
        myBean.print();
    }

}
