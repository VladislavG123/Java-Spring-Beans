package com.example.demo.beans;

public class Boat {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Boat(Engine engine) {
        this.engine = engine;
    }
}
