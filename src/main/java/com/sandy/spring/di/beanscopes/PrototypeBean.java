package com.sandy.spring.di.beanscopes;

public class PrototypeBean {

    private int id;
    private String name;

    public PrototypeBean() {
        System.out.println("PrototypeBean constructor called");
        this.id = 2000;
        this.name = "Prototype Bean";
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
        return "PrototypeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
