package com.headfirst.ch9;

class Duck {
    private String color;
    private int size;

    // No-arg Constructor
    public Duck() {
        System.out.println("Quack");
    }

    public Duck(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

public class UseADuck {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.setColor("White");
        System.out.println("The color of the duck is: " + d.getColor());
        d.setSize(35);
        System.out.println("The size of the duck is: " + d.getSize());

        Duck d1 = new Duck(65);
        System.out.println("The size of the duck is: " + d1.getSize());

    }
}
