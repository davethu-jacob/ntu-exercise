package com.composition;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex myComplex = new MyComplex();
        System.out.println(myComplex);
        System.out.println("isReal == 0: " + myComplex.isReal());
        System.out.println("isImaginary == 0: " + myComplex.isImaginary());

        myComplex.setReal(4.50);
        System.out.println(myComplex);
        System.out.println(myComplex.getReal());
        myComplex.setImaginary(4.05);
        System.out.println(myComplex);
        System.out.println(myComplex.getImaginary());
        System.out.println("isReal == 0: " + myComplex.isReal());
        System.out.println("isImaginary == 0: " + myComplex.isImaginary());

        System.out.println("Is the complex number equal to given complex number? : " + myComplex.equals(4.50, 4.05));
        System.out.println("Is the complex number equal to given complex number? : " + myComplex.equals(4.05, 4.50));

        MyComplex myComplex1 = new MyComplex(1.23, 2.50);
        System.out.println("Is the complex number equal to given object? : " + myComplex.equals(myComplex1));
        myComplex1.setReal(4.50);
        myComplex1.setImaginary(4.05);
        System.out.println("Is the complex number equal to given object? : " + myComplex.equals(myComplex1));

        System.out.println("Magnitude (x+yi); " + myComplex.magnitude());

        System.out.println("Argument (x+yi): " + myComplex.argument());

        System.out.println("(a + bi) + (c + di) = (a + c) + (b + d)i: " + myComplex.add(myComplex1));


    }
}
