package com.streams.practice.mapping.filtering;

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        // 2. Filter names starting with letter "A".
        Stream<String> names = Stream.of("pavan","Apple","Arjun","ashok","kumar");

        List<String> namesWithA = names.filter(n -> n.startsWith("A")).collect(Collectors.toList());

        //ignore case
        List<String> namesWitha = names.filter(n -> n.toLowerCase().startsWith("a")).collect(Collectors.toList());
        System.out.println(namesWithA);
        System.out.println(namesWitha);
    }
}
