package com.streams.practice.sorting.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
public class Example2 {
    public static void main(String[] args) {
        //Sort strings alphabetically.

        List<String> names = Arrays.asList("pavan","pandu","kumar","apple","banana");

       List<String> sortedNames =  names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);

        //Sort strings by length.

        List<String> lenByNames = names.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(lenByNames);
    }
}
