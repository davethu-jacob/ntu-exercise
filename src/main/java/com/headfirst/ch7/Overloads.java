package com.headfirst.ch7;

class Overloads {
    String uniqueID;

    int addNumber(int a, int b) {
        return a + b;
    }

    double addNumber(double a, double b) {
        return a + b;
    }

    void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    void setUniqueID(int ssNumber) {
        String numString = "" + ssNumber;
        setUniqueID(numString);
    }

    public static void main(String[] args) {
        Overloads ol = new Overloads();
        System.out.println(ol.addNumber(1, 2));
        System.out.println(ol.addNumber(1, 2));
        System.out.println(ol.addNumber(1.0, 2.0));
        System.out.println(ol.addNumber(1.05, 2.18));
    }
}
