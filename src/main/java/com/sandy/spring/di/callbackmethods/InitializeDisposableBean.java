package com.sandy.spring.di.callbackmethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitializeDisposableBean implements InitializingBean, DisposableBean {

    private int id;
    private String name;

    public InitializeDisposableBean() {
        this.id = 5678;
        this.name = "InitializeDisposableBean";
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("***My init method called - InitializeDisposableBean");
    }

    public void destroy() throws Exception {
        System.out.println("***My destroy method called - InitializeDisposableBean");
    }

    @Override
    public String toString() {
        return "InitializeDisposableBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
