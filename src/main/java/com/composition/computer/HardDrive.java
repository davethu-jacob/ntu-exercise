package com.composition.computer;

public class HardDrive {
    private final int capacityTB;

    public HardDrive(int capacityTB) {
        this.capacityTB = capacityTB;
    }

    @Override
    public String toString() {
        return String.format("=%dTB]", capacityTB);
    }
}
