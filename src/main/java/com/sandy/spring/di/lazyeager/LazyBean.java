package com.sandy.spring.di.lazyeager;

public class LazyBean {

    private int id;
    private String name;

    public LazyBean() {
        System.out.println("Default constructor of LazyBean called");
        this.id = 1122;
        this.name = "Lazy Bean name";
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
        return "LazyBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
