package com.javabrains;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i); // prints 0 to 4
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i); // prints 0 to 4 and 6 to 9. Skips 5
        }
    }
}
