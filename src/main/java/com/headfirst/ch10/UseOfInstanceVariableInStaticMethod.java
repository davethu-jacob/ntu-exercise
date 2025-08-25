package com.headfirst.ch10;

public class UseOfInstanceVariableInStaticMethod {
    private int size;
    static int playerCount;
    public static final double VAL;
    public static final double X_VALUE = Math.random();

    static {
        VAL = Math.random();
    }

    public static void main(String[] args) {

        UseOfInstanceVariableInStaticMethod u = new UseOfInstanceVariableInStaticMethod();
        System.out.println(u.size);
        /* The static method cannot reference a non-static variable (instance variable
        System.out.println(size);
         */

        System.out.println(u.getSize());

        /* The static method cannot reference a non-static method
        System.out.println(getSize);

         */
        System.out.println(playerCount);
        playerCount++;
        System.out.println(playerCount);
        System.out.println(VAL);
        System.out.println(X_VALUE);

    }

    public int getSize() {
        return size;
    }
}
