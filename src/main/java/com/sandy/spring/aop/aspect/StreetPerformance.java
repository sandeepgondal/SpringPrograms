package com.sandy.spring.aop.aspect;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("streetPerformance")
public class StreetPerformance implements Performance {

    public void perform() {
        System.out.println("***StreetPerformance called");
    }

}
