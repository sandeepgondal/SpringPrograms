package com.sandy.spring.di.beanconfig.allconfigurations;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    private int cc;
    private String type;

    public Engine() {
        System.out.println("***Engine constructor called");
        this.cc = 1200;
        this.type = "Diesel";
    }

    public Engine(final int cc, final String type) {
        this.cc = cc;
        this.type = type;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(final int cc) {
        this.cc = cc;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cc=" + cc +
                ", type='" + type + '\'' +
                '}';
    }
}
