package com.inheritance;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}
