package com.composition.computer;

public class RAM {
    private int capacityGB;

    public RAM(int capacityGB) {
        this.capacityGB = capacityGB;
    }

    @Override
    public String toString() {
        return String.format("%dGB", capacityGB);
    }
}
