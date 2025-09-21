package com.corejava.chapter7.exercise2;

public class ExceptionHandling {
    public static void main(String[] args) {

        int myInt1 = Integer.parseInt("123");
        System.out.println(myInt1);

        /**
         * java.lang.Object
         *      java.lang.Throwable
         *          java.lang.Exception
         *              java.lang.RuntimeException
         *                  java.lang.IllegalArgumentException
         *                      java.lang.NumberFormatException
         */
        try {
            getInt();
            System.out.println("After parsing the int");
        }
        catch (NumberFormatException nfe) {
            System.out.println("You cannot make an int out of it!");
        }
        finally {
            System.out.println("In the finally block");
        }
        System.out.println("End here");

    }

    private static void getInt() {
        int myInt2 = Integer.parseInt("pants");
    }
}


