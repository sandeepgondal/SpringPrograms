package com.sandy.spring.di.profile;

public class ProdMyBean implements MyBean {

    public void print() {
        System.out.println("Printing from prod env");
    }

}
