package com.streams.practice.basics;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        //1. Create a stream from a list of integers.

        List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7);
       Stream<Integer> list1 =  list.stream();
       Stream<Integer> list2 = list.parallelStream();

        System.out.println(list1);
        System.out.println(list2);

    }
}
