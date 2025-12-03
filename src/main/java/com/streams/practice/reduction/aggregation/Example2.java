package com.streams.practice.reduction.aggregation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        //Find the longest string in a list.

        List<String> names = Arrays.asList("pavan","kumar","padavala","streams");
       String maxLength = names.stream().max(Comparator.comparingInt(String::length)).orElse("");
      String minLength = names.stream().min(Comparator.comparingInt(String::length)).orElse("");
        System.out.println(maxLength);
        //System.out.println(minLength);

        //Concatenate all strings into a single string.

       String fullString =  names.stream().collect(Collectors.joining(" "));
        System.out.println(fullString);
    }
}
