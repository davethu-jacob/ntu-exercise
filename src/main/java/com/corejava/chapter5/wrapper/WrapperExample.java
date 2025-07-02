package com.corejava.chapter5.wrapper;

import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(3);
        list.add(33);
        list.add(333);
        list.add(3333);
        System.out.println(list);

        var friends = new ArrayList<String>();
        friends.add("Davethu");
        friends.add("Esther");
        System.out.println(friends);
    }
}
