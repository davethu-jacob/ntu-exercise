package com.composition;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] result = new int[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    public double distance(int x, int y) {
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    public double distance(MyPoint another) {
        double xDiff = another.getX() - this.x;
        double yDiff = another.getY() - this.y;
        System.out.printf("xDiff=%.2f,yDiff=%.2f%n", xDiff, yDiff);
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
