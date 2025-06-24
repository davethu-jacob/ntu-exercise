package com.ntu.moreexerciseonoop.ex71;

import java.util.Date;

public class TestVisit {
    public static void main(String[] args) {
        var customer = new Customer("Davethu");
        System.out.println(customer);
        customer.setMemberType("Premium");
        customer.setMember(true);
        System.out.println(customer);

        var visit = new Visit("Davethu", new Date());
        System.out.println(visit);

    }


}
