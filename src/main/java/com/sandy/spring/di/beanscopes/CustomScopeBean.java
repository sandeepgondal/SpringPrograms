package com.sandy.spring.di.beanscopes;

public class CustomScopeBean {

    private int id;
    private String name;

    public CustomScopeBean() {
        System.out.println("CustomScopeBean constructor called");
        this.id = 5000;
        this.name = "Custom Scope Bean";
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
        return "CustomScopeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
