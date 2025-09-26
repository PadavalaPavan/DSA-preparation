package com.streams.practice.matching.finding;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {

        //Check if all numbers are even.
        List<Integer> numbers = Arrays.asList(1,2,3,4,56,7,8,9,10,-20);
       List<Integer> even = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(even);

        //Check if any number is negative.
       boolean flag = numbers.stream().anyMatch(n -> n<0);
        System.out.println(flag);

        //Find the first element in a list.
        int i = numbers.stream().findFirst().get();
        System.out.println(i);

        //Find the last element in a list using streams.

       int j = numbers.stream().skip(numbers.size()-1).findFirst().orElse(0);
        System.out.println(j);

        //Find any element in a list using parallel stream.

       int k = numbers.parallelStream().findAny().orElse(0);
        System.out.println(k);

        //Find if a list contains a specific element

       boolean p = numbers.stream().anyMatch(n -> n==8);
    }
}
