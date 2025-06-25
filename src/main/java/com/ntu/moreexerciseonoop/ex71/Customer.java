package com.ntu.moreexerciseonoop.ex71;

public class Customer {
    private String name;
    private boolean member=false;
    private String memberType="NA";

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return String.format("Customer[name=%s,member=%b,member type=%s)", name, member, memberType);
    }
}
