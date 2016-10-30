package com.sandy.spring.di.callbackmethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PostConstructPreDestroy {

    private int id;
    private String name;

    public PostConstructPreDestroy() {
        this.id = 5678;
        this.name = "PostConstructPreDestroy";
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

    @PostConstruct
    public void myInit() {
        System.out.println("***My init method called - PostConstructPreDestroy");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("***My destroy method called - PostConstructPreDestroy");
    }

    @Override
    public String toString() {
        return "PostConstructPreDestroy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
