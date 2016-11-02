package com.sandy.spring.aop.introduction;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public void calculate() {
        System.out.println("Inside calculate...");
    }

}
