package com.sandy.spring.di.beanconfig.allconfigurations;

public class Tyre {

    private String type;;
    private int size;

    public Tyre() {
        System.out.println("** Tyre constructor called");
        this.type = "Radial";
        this.size = 16;
    }

    public Tyre(final String type, final int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
