package com.sandy.spring.di.initializebeans;

public class InitializeBean {

    private int id;
    private String name;

    public InitializeBean() {
    }

    public InitializeBean(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    public static InitializeBean getInstance() {
        return new InitializeBean(900, "Initialized through factory method");
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
        return "PropertyInitializeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
