/**
 * A Test Driver for the Account class.
 * */
package com.oop;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(5566);
        System.out.println(a1);

        Account a2 = new Account(1234, 99.90);
        System.out.println(a2);

        System.out.println("The account number is: " + a2.getNumber());
        System.out.printf("The account balance is: $%.2f%n", a2.getBalance());

        a1.credit(11.1);
        System.out.println(a1);

        a1.debit(5.5);
        System.out.println(a1);

        a1.debit(500);
        System.out.println(a1);

        a2.transferTo(1.0, a1);
        System.out.println(a1);
        System.out.println(a2);

    }
}
