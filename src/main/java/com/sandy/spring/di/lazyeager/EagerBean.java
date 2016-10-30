package com.sandy.spring.di.lazyeager;

public class EagerBean {

    private int id;
    private String name;

    public EagerBean() {
        System.out.println("Default constructor of EagerBean called");
        this.id = 3344;
        this.name = "Eager Bean name";
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
        return "EagerBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
