package com.streams.practice.basics;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        // 3. Create a stream from an array of strings.

        List<String> arraysOfStrings = Arrays.asList("streams","examples","java8");
       Stream<String> streamArray =  arraysOfStrings.stream();
       streamArray.forEach(System.out::println);
    }
}
