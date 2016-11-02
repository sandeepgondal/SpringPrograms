package com.sandy.spring.di.profile;

public class DevMyBean implements MyBean {

    public void print() {
        System.out.println("Printing from development env");
    }
}
