package com.sandy.spring.aop.introduction;

import org.springframework.stereotype.Component;

@Component
public class InkPrinter implements Printable {

    public void printIt() {
        System.out.println("inside printIt from InkPrinter");
    }

}
