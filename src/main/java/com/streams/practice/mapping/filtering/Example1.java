package com.streams.practice.mapping.filtering;

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {

        // 1. Filter even numbers from a list of integers.
        Stream<Integer> values = Stream.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenValues =  values.filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(evenValues);
    }
}
