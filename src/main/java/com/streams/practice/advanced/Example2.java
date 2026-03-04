package com.streams.practice.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        //Convert list of strings into a map with string → occurrence count.
        List<String> list = Arrays.asList("pavan","name","kumar","kumar","name");

       Map<String,Long> ll =  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ll);

        //Reverse a list using streams.

        //Parallelize sum of large array using parallelStream().
    }
}
