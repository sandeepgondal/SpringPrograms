package com.sandy.spring.di.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DevJavaConfig {

    @Bean
    @Profile(value = "dev")
    public MyBean myBean() {
        return new DevMyBean();
    }

}
