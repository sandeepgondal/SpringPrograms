package com.sandy.spring.di.beanconfig.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Item {

    private int id;
    private String name;

    public Item() {
        this.id = 123;
        this.name = "Soap";
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
