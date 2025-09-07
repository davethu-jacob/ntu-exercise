package com.headfirst.ch12;

import java.util.List;

public class MixForLoops {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        System.out.println(nums);
        String output = "";

        for (int i = 1; i < nums.size(); i++)
            output += nums.get(i) + " ";
        System.out.println(output);

        output = "";
        for (Integer num : nums)
            output += nums + " ";
        System.out.println(output);

        output = "";
        for (int i = 0; i < nums.size(); i++)
            output += nums.get(i) + " ";
        System.out.println(output);

    }
}
