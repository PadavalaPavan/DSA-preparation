package com.streams.practice.matching.finding;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        //Check if none of the names start with "Z".
        List<String> names = Arrays.asList("pavan","kumar","nani","zebra");
       boolean flag = names.stream().anyMatch(n -> n.charAt(0)=='z');
        System.out.println(flag);

        //Check if all strings have length > 3.

       boolean flag1 = names.stream().allMatch(n -> n.length()>3);


    }
}
