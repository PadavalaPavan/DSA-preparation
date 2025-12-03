package com.streams.practice.reduction.aggregation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        //Find sum of integers in a list.
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        int sum = nums.stream().mapToInt(Integer::intValue).sum();

        //Find average of integers in a list.
        OptionalDouble avg = nums.stream().mapToDouble(Integer::intValue).average();
        avg.ifPresent(System.out::println);
        //System.out.println(avg);

        //Find maximum element in a list.
        int max = nums.stream().mapToInt(Integer::intValue).max().orElse(0);

        //Find minimum element in a list.

        int min = nums.stream().mapToInt(Integer::intValue).min().orElse(0);

        //Count total elements in a stream.

        long count = nums.stream().count();

        //Find the product of all integers in a list.

       int prod = nums.stream().reduce(1,(a,b) -> a*b);
        System.out.println(prod);

    }
}
