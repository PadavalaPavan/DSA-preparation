package com.streams.practice.mapping.filtering;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
      //4. Convert all strings in a list to uppercase.
        List<String> names = Arrays.asList("small","large","pavan","kumar");
      List<String> uppercase =  names.stream().map(String::toUpperCase).collect(Collectors.toList());

      //lower case
        List<String> lower = Arrays.asList("PAVAN","KUMAR","STREAMS");
      List<String> lowerCase =   names.stream().map(String::toLowerCase).collect(Collectors.toList());

        System.out.println("lower to upper" + uppercase);
        System.out.println("upper to lower" +lowerCase);

    }
}
