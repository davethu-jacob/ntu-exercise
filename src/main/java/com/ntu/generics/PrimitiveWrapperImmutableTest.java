package com.ntu.generics;

public class PrimitiveWrapperImmutableTest {
    public static void main(String[] args) {
        Integer iObj = 123;  // Autobox
        System.out.println(Integer.toHexString(System.identityHashCode(iObj)));
        System.out.println(iObj.hashCode());

        Integer myInteger = 2048;
        System.out.println(Integer.toHexString(System.identityHashCode(myInteger)));
        int hashCodeValue = myInteger.hashCode();
        System.out.println(hashCodeValue);

        iObj += 1;
        System.out.println(iObj);
        System.out.println(Integer.toHexString(System.identityHashCode(iObj)));

        String string1 = "Hello";
        System.out.println(string1);
        System.out.println("hashcode(): " + string1.hashCode());
        System.out.println("identifyHashCode(): " + Integer.toHexString(System.identityHashCode(string1)));

        string1 += " World!";
        System.out.println(string1);
        System.out.println("hashcode(): " + string1.hashCode());
        System.out.println("identifyHashCode(): " + Integer.toHexString(System.identityHashCode(string1)));

    }
}
