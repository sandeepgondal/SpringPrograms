package com.sandy.spring.aop;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("stagePerformance")
public class StagePerformance implements Performance {

    public void perform() {
        System.out.println("***StagePerformance called");
    }

}
