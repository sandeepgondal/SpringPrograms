package com.sandy.spring.di.profile;

public class QAMyBean implements MyBean {

    public void print() {
        System.out.println("Printing from qa env");
    }

}
