package com.sandy.spring.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

    @Pointcut("execution(* com.sandy.spring.aop.Performance.perform())")
    public void performance() {

    }

    @Before("performance()")
    public void silencePhones() {
        System.out.println("---Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("---Please take your seats");
    }

    @AfterReturning("performance()")
    public void clap() {
        System.out.println("---CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void refund() {
        System.out.println("---Please refund");
    }

}
