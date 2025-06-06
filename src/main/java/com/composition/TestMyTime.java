package com.composition;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime t1 = new MyTime();
        System.out.println(t1);
        t1.setSecond(-1);
        t1.setSecond(60);
        t1.setSecond(50);
        System.out.println(t1);
        t1.setMinute(-1);
        t1.setMinute(60);
        t1.setMinute(45);
        System.out.println(t1);
        t1.setHour(-1);
        t1.setHour(24);
        t1.setHour(18);
        System.out.println(t1);

        MyTime t2 = new MyTime(22, 50, 59);
        System.out.println(t2);
        t2.setTime(23, 59, 59);
        System.out.println(t2);
        t2.setTime(24, 55, 55);
        System.out.println(t2);

        System.out.println(t2.nextSecond().nextSecond());
        System.out.println(t2.previousSecond().previousSecond().previousSecond());

        System.out.println(t2.previousMinute().previousMinute());
        System.out.println(t2.previousMinute().previousMinute().previousMinute().previousMinute());
        t2.setTime(0, 0, 0);
        System.out.println(t2.previousMinute().previousMinute());
        System.out.println(t2.nextMinute().nextMinute().previousMinute());

        System.out.println(t2.nextHour().nextHour().previousHour().previousHour());

    }
}
