package com.example.demo.beans;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Car {
    private Engine engine;
    private Wheel wheel;
    private Transmission transmission;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car(Engine engine, Wheel wheel, Transmission transmission) {
        this.engine = engine;
        this.wheel = wheel;
        this.transmission = transmission;
    }
}
