/**
 * A Test Driver for the Account class.
 * */
package com.oop;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("A101", "Davethu", 88);
        System.out.println(a1);

        Account a2 = new Account("A102", "Esther");
        System.out.println(a2);

        System.out.println("The account number is: " + a2.getId());
        System.out.println("Name: " + a2.getName());
        System.out.printf("The account balance is: $%.2f%n", a2.getBalance());

        a1.credit(100);
        System.out.println(a1);

        a1.debit(50);
        System.out.println(a1);

        a1.debit(500);
        System.out.println(a1);

        a2.credit(40);
        System.out.println(a2);
        a2.transferTo(1.0, a1);
        System.out.println(a1);
        System.out.println(a2);

    }
}
