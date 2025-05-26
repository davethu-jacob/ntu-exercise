package com.oop;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(1, 2, 3);
        System.out.println("The time is: " + t1);

        Time t2 = new Time();
        System.out.println("The default time is: " + t2);

        t2.setHour(4);
        System.out.println("The hour is: " + t2.getHour());
        t2.setMinute(5);
        System.out.println("The minute is: " + t2.getMinute());
        t2.setSecond(6);
        System.out.println("The second is: " + t2.getSecond());
        t2.setTime(58, 59, 23);
        System.out.println("The current time is: " + t2);

        System.out.println("The next second is: " + t2.nextSecond());
        System.out.println("The subsequent second is: " + t2.nextSecond().nextSecond());
    }
}
