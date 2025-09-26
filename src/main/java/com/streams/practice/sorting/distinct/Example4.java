package com.streams.practice.sorting.distinct;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        //Get distinct characters from a string list.
        String name = "pavan kumar";
    List<String> i =   Arrays.stream(name.split(""))
                .filter(ch -> !Objects.equals(ch, " ")).
        collect(Collectors.groupingBy(n->n,Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(i);
    }
}
