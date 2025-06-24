package com.ntu.interfacetutorial.ex71;

public class TestVisit {
    public static void main(String[] args) {
        var customer = new Customer("Davethu");
        System.out.println(customer);
        customer.setMemberType("Premium");
        customer.setMember(true);
        System.out.println(customer);

        //TODO
//        var visit = new Visit("Davethu", 24-6-2025);

    }


}
