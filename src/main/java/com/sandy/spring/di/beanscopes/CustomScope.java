package com.sandy.spring.di.beanscopes;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class CustomScope implements Scope {

    public Object get(final String s, final ObjectFactory<?> objectFactory) {
        System.out.println("Scope get called: " + s);
        Object object = objectFactory.getObject();
        return object;
    }

    public Object remove(final String s) {
        System.out.println("Scope remove called: " + s);
        return null;
    }

    public void registerDestructionCallback(final String s, final Runnable runnable) {

    }

    public Object resolveContextualObject(final String s) {
        return null;
    }

    public String getConversationId() {
        return null;
    }
}
