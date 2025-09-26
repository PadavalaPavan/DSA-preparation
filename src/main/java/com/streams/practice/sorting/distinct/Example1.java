package com.streams.practice.sorting.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Example1 {
    public static void main(String[] args) {
        //Sort integers in ascending order.
        List<Integer> nums = Arrays.asList(1,2,3,4,9,0,1,23,94);
        List<Integer> sortedNums = nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNums);

        //Get distinct integers from a list.

       List<Integer> distinctNums =  nums.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNums);

        //Sort integers in descending order.

       List<Integer> descendingNums =  nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingNums);
    }
}
