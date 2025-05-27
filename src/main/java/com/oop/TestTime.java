package com.oop;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(1, 2, 3);
        System.out.println("The time is: " + t1);

        t1.setHour(4);
        System.out.println("The hour is: " + t1.getHour());
        t1.setMinute(5);
        System.out.println("The minute is: " + t1.getMinute());
        t1.setSecond(6);
        System.out.println("The second is: " + t1.getSecond());
        t1.setTime(58, 59, 23);
        System.out.println("The current time is: " + t1);

        System.out.println("The next second is: " + t1.nextSecond());
        System.out.println("The next second is: " + t1.nextSecond().nextSecond());


    }
}
