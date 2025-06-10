package com.inheritance;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[]  getXY() {
        float[] coordinate = new float[2];
        coordinate[0] = x;
        coordinate[1] = y;
        return coordinate;
    }

    @Override
    public String toString() {
        return String.format ("(%.2f,%.2f)", x, y);
    }
}
