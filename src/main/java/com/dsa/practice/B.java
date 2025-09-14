package com.dsa.practice;

import java.util.HashSet;

public class B {

    public static void main(String[] args) {
        System.out.println( containsDuplicate(new int[]{1, 2, 3, 1}));
    }
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return true;

    }
}
