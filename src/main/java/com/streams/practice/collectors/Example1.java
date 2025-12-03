package com.streams.practice.collectors;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        //Collect integers into a List.
      List<Integer> list =  Stream.of(1,2,3,4,5).collect(Collectors.toList());
        List<Integer> l1 = IntStream.range(0,10).boxed().collect(Collectors.toList());
        int[] i = new int[]{1,2,3,4,5};
      List<Integer> l3 =  Arrays.stream(i).boxed().collect(Collectors.toList());


      //Collect integers into a Set.

       Set<Integer> set = Stream.of(1,2,3,4).collect(Collectors.toSet());
      Set<Integer> s1 = IntStream.range(0,10).boxed().collect(Collectors.toSet());
        Set<Integer> s2 =  Arrays.stream(i).boxed().collect(Collectors.toSet());
    }
}
