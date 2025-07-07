package com.corejava.chapter6.interfaces.comparable;

public class Member implements Comparable<Member> {
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Member member) {
        /* Option 1
        if (this.height == member.getHeight()) {
            return 0;
        } else if (this.height > member.getHeight()) {
            return 1;
        } else {
            return -1;
        }
         */

        // Option 2
        return this.height - member.getHeight();
    }
}

