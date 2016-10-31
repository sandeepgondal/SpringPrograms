package com.sandy.spring.di.beanconfig.allconfigurations;

public class Car {

    private Engine engine;
    private Tyre tyre;

    public Car() {
        System.out.println("***Car constructor called");
    }

    public Car(final Engine engine, final Tyre tyre) {
        System.out.println("***Car parametrised constructor called");
        this.engine = engine;
        this.tyre = tyre;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(final Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(final Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", tyre=" + tyre +
                '}';
    }
}
