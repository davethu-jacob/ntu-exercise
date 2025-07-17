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

        Predicate<Integer> earlyAdulthood = i -> (i > 19 && i < 40);
//        Predicate<Integer> midAdulthood = i -> (i > 39);
//        Predicate<Integer> lateAdulthood = i -> (i > 65);
//        System.out.println("Is 12 year old an adult?: " + earlyAdulthood.and(midAdulthood).and(lateAdulthood).test(12));
//        System.out.println("Is 21 year old an adult?: " + earlyAdulthood.and(midAdulthood).and(lateAdulthood).test(21));
        System.out.println("Is 12 year old an adult?: " + earlyAdulthood.test(12));
        System.out.println("Is 21 year old an adult?: " + earlyAdulthood.test(21));
        System.out.println();

        Predicate<Integer> adultYet = i -> (i > 19);
        Predicate<Integer> adultStill = i -> (i <= 65);
        System.out.println("Is 18 year old an adult?: " + adultYet.and(adultStill).test(18));
        System.out.println("Is 35 year old an adult?: " + adultYet.and(adultStill).test(35));
        System.out.println("Is 70 year old an adult?: " + adultYet.and(adultStill).test(70));
        System.out.println();

        Predicate<String> containsA = s -> s.contains("crayon");
        Predicate<String> containsB = s -> s.contains("my");
        System.out.println("This text contains the word 'crayon': " + containsA.or(containsB).test("Here is my crayon"));
        System.out.println("This text contains the word 'crayon': " + containsA.and(containsB).test("Here is my crayon"));
        System.out.println("This text contains the word 'pencil': " + containsA.or(containsB).test("Here is my pencil"));
        System.out.println("This text contains the word 'crayon': " + containsA.or(containsB).test("Here is John's crayon"));
        System.out.println("This text contains the word 'crayon': " + containsA.or(containsB).test("Here is John's pencil"));



    }
}
