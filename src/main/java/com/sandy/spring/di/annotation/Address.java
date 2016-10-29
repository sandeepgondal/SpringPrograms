package com.sandy.spring.di.annotation;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String city;
    private String state;
    private int pin;

    public Address() {
        this.city = "Pune";
        this.state = "Maharashtra";
        this.pin = 411058;
    }

    public Address(final String city, final String state, final int pin) {
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(final int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}
