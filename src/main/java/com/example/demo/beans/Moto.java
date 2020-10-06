package com.example.demo.beans;

import java.util.ArrayList;

public class Moto {
    private Engine engine;
    private Wheel wheel;

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

    public Moto(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }
}
