package com.corejava.chapter6.lambdas.predicate;

import java.util.function.Predicate;

public class SimplePredicate {
    public static void main(String[] args) {
        Predicate<Integer> canVote = i -> (i >= 18);
        System.out.println(canVote.test(20));
        System.out.println(canVote.test(15));
        System.out.println(canVote.test(17));
        System.out.println(canVote.test(18));
        System.out.println();

        Predicate<Integer> teenager = i -> (i >= 13 && i <=19);
        System.out.println("Is 12 year old kid is teenager?: " + teenager.test(12));
        System.out.println("Is 13 year old kid is teenager?: " + teenager.test(13));
        System.out.println("Is 19 year old kid is teenager?: " + teenager.test(19));
        System.out.println("Is 20 year old kid is teenager?: " + teenager.test(20));
        System.out.println();

        Predicate<Integer> earlyAdulthood = i -> (i > 19);
        Predicate<Integer> midAdulthood = i -> (i > 39);
        Predicate<Integer> lateAdulthood = i -> (i > 65);
        System.out.println("Is 12 year old an adult?: " + earlyAdulthood.and(midAdulthood).and(lateAdulthood).test(12));
        System.out.println("Is 21 year old an adult?: " + earlyAdulthood.and(midAdulthood).and(lateAdulthood).test(21));

    }
}
