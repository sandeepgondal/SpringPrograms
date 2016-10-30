package com.sandy.spring.di.callbackmethods;

public class InitDestroyCallbackBean {

    private int id;
    private String name;

    public InitDestroyCallbackBean() {
        this.id = 1234;
        this.name = "InitDestroyCallbackBean";
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

    public void myInit() {
        System.out.println("***My init method called - InitDestroyCallbackBean");
    }

    public void myDestroy() {
        System.out.println("***My destroy method called - InitDestroyCallbackBean");
    }

    @Override
    public String toString() {
        return "InitDestroyCallbackBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
