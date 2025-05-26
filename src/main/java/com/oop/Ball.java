/* The Ball class models a moving ball at (x,y) with displacement
 * per move-step of (xStep, yStep)
 * */
package com.oop;

public class Ball {
    private double x;
    private double y;
    private double xStep;
    private double yStep;

    public Ball(double x, double y, double xStep, double yStep) {
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getXStep() {
        return xStep;
    }

    public void setXStep(double xStep) {
        this.xStep = xStep;
    }

    public double getYStep() {
        return yStep;
    }

    public void setYStep(double yStep) {
        this.yStep = yStep;
    }

    public String toString() {
        return String.format("Ball@(%.1f,%.1f),Speed=(%.1f,%.1f)", x, y, xStep, yStep);
    }

    public double[] getXY() {
        double[] result = new double[2];
        result[0] = x;
        result[1] = y;
        return result;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXYStep() {
        double[] result = new double[2];
        result[0] = xStep;
        result[1] = yStep;
        return result;
    }

    public void setXYStep(double xStep, double yStep) {
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public Ball move() {
        x += xStep;
        y += yStep;
        return this;
    }
}
