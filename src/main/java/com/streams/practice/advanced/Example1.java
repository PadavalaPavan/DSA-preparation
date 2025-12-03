package com.streams.practice.advanced;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        //Remove duplicates from a list using distinct().
        List<Integer> list = Arrays.asList(1,2,3,4,54,44,4,4,4,5,6,6,4);

        //Parallelize sum of large array using parallelStream().

        int i = list.parallelStream().mapToInt(Integer::intValue).sum();

       List<Integer> dis = list.stream().distinct().collect(Collectors.toList());

       //Find top 3 highest numbers in a list.

      List<Integer> top3 =  list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

      //Find k-th largest number using streams.

       int i2 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);

       // Find duplicate elements in a list using streams.

       List<Integer> dups = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .filter(n -> n.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());

       //Reverse a list using streams.

      List<Integer> list1 =  IntStream.range(0,list.size()).mapToObj(ii -> list.get(list.size()-ii-1)).collect(Collectors.toList());

      String name = "padavala kumar";

      //Map<String,Long> chars = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<Character,Long> chars = name.chars().mapToObj(c -> (char)c).filter(n -> n!=' ').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(chars);

        //Merge two lists into one using streams.

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,8);
        List<Integer> l2 = Arrays.asList(5,6,7,8);

        List<Integer> ll = Stream.concat(l1.stream(),l2.stream()).collect(Collectors.toList());

        //Find common elements between two lists using streams.

        Set<Integer> set = new HashSet<>(l2);

        List<Integer> common = l1.stream().filter(set::contains).collect(Collectors.toList());

        //Flatten a Map<Integer, List<String>> into a single list of values.

        Map<Integer, List<String>> single = new HashMap<>();
        single.put(1,Arrays.asList("pavan","kumar"));

     List<Object> ss =    single.values().stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(ss);

    }
}
