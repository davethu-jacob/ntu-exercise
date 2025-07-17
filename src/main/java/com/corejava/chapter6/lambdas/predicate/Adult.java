package com.corejava.chapter6.lambdas.predicate;

import java.util.List;
import java.util.function.Predicate;

class NotLessThan18<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        Integer ADULT = 18;
        return integer >= ADULT;
    }
}
public class Adult {
    public static void main(String[] args) {
        List<Integer> ages = List.of(17, 18, 19, 28, 18, 28, 46, 7, 8, 9, 21, 12);
        NotLessThan18<Integer> isAdult = new NotLessThan18<>();
        ages.stream().filter(isAdult).forEach(System.out::println);
    }
}
