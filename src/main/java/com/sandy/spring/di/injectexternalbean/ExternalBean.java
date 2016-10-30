package com.sandy.spring.di.injectexternalbean;

public class ExternalBean {

    private int id;
    private String name;

    public ExternalBean() {
    }

    public ExternalBean(final int id, final String name) {
        this.id = id;
        this.name = name;
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
        return "ExternalBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
