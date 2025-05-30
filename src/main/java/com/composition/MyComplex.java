package com.composition;

public class MyComplex {
    private double real = 0.0;
    private double imaginary = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void setValue(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }

    public boolean isReal() {
        return (real == 0);
    }

    public boolean isImaginary() {
        return (imaginary == 0);
    }

    public boolean equals(double real, double imaginary) {
        return (this.real == real && this.imaginary == imaginary);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imaginary == another.imaginary);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginary, 2));
    }

    public double argument() {
        return Math.atan2(this.imaginary, this.real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imaginary += right.imaginary;
        return this;
    }
}
