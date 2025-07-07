package com.corejava.chapter6.interfaces.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestMember {
    public static void main(String[] args) {
        Member m1 = new Member("Davethu", 180);
        Member m2 = new Member("Esther", 165);
        System.out.println(m1);
        System.out.println(m2);

        System.out.println(m1.compareTo(m2));
        System.out.println(m2.compareTo(m1));

        List<Member> member = new ArrayList<>();
        member.add(new Member("Mikael", 182));
        member.add(new Member("Matti", 187));
        member.add(new Member("ada", 184));
        System.out.println(member);
        System.out.println();

        member.stream().forEach(m -> System.out.println(m));
        System.out.println();

        member.stream().sorted().forEach(m -> System.out.println(m));
        System.out.println();

        member.stream().forEach(m -> System.out.println(m));
        System.out.println();

        Collections.sort(member);
        member.stream().forEach(m -> System.out.println(m));
    }
}
