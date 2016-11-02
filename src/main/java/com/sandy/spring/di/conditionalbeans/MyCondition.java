package com.sandy.spring.di.conditionalbeans;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {

    public boolean matches(final ConditionContext conditionContext, final AnnotatedTypeMetadata annotatedTypeMetadata) {
        // Hardcoded value false is returned
        return false;
    }

}
