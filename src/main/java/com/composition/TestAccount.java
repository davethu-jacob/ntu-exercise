package com.composition;

public class TestAccount {
    public static void main(String[] args) {
        BankCustomer c1 = new BankCustomer(1, "Davethu D Jacob", 'm');
        System.out.println(c1);
        BankCustomer c2 = new BankCustomer(2, "Esther", 'f');
        System.out.println(c2);

        Account a1 = new Account(88, c1);
        System.out.println(a1);
        Account a2 = new Account(99, c2, 99999.95);
        System.out.println(a2);

        System.out.println("Customer ID: " + c1.getId());
        System.out.println("Customer name: " + c1.getName());
        System.out.println("Customer gender: " + c1.getGender());

        a1.setBalance(100000);
        System.out.println(a1);
        System.out.println("Account ID: " + a1.getId());
        System.out.println("Customer detail: " + a1.getCustomer());
        System.out.println("Customer name: " + a1.getCustomerName());
        System.out.printf("Balance: $%,.2f%n", a1.getBalance());
        a1.deposit(55.99);
        System.out.println(a1);
        a1.withdraw(1000.88);
        System.out.println(a1);
        a1.withdraw(1000).deposit(100).deposit(500);
        System.out.println(a1);
    }
}
