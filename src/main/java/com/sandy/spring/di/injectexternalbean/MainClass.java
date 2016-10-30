package com.sandy.spring.di.injectexternalbean;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Hello Spring ... Injecting external bean.");

        ExternalBean externalBean = new ExternalBean(123, "External Bean");

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("externalBeanConfig.xml");
        registerExternalBean(externalBean, classPathXmlApplicationContext);

        ExternalBean externalBeanFromContainer = classPathXmlApplicationContext.getBean("externalBean", ExternalBean.class);
        System.out.println(externalBeanFromContainer);
    }

    private static void registerExternalBean(final ExternalBean externalBean, final ClassPathXmlApplicationContext classPathXmlApplicationContext) {
        ConfigurableListableBeanFactory beanFactory = classPathXmlApplicationContext.getBeanFactory();
        beanFactory.registerSingleton("externalBean", externalBean);
    }
}
