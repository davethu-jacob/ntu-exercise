package com.corejava.chapter7;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(printNumber());
    }

    private static int printNumber() {
        try {
            return 3;
        }
        catch (Exception e) {
            return 4;
        }
        finally {
            return 5;
        }
    }
}
