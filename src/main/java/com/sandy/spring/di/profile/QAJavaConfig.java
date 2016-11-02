package com.sandy.spring.di.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class QAJavaConfig {

    @Bean
    @Profile(value = "qa")
    public MyBean myBean() {
        return new QAMyBean();
    }

}
