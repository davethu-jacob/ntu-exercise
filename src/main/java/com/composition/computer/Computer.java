package com.composition.computer;

public class Computer {
    private Processor processor;
    private RAM ram;
    private HardDrive hardDrive;

    public Computer(Processor processor, RAM ram, HardDrive hardDrive) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
    }

    @Override
    public String toString() {
        return String.format("Computer Specifications[%s,RAM=%s,Hard Drive=%s",processor, ram, hardDrive);
    }
}
