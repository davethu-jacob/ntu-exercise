package com.composition.computer;

public class Processor {
    private String model;
    private double clockSpeed;

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    @Override
    public String toString() {
        return String.format("processor=%s,clock speed=%.2f", model, clockSpeed);
    }
}
