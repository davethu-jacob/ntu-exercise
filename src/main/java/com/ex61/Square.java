package com.ex61;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public void setWidth(double side) {
        super.length = side;
        super.width = side;
    }

    @Override
    public String toString() {
        return String.format("Square[%s]]", super.toString());
    }
}
