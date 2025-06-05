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

        MyTime t2 = new MyTime(22, 50, 59);
        System.out.println(t2);

    }
}
