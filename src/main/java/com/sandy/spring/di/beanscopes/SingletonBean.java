package com.sandy.spring.di.beanscopes;

public class SingletonBean {

    private int id;
    private String name;

    public SingletonBean() {
        System.out.println("SingletonBean constructor called");
        this.id = 1000;
        this.name = "Singleton Bean";
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
        return "SingletonBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
