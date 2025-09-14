package com.streams.practice.basics;

import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        // 3. create a empty stream
        Stream<String> emptyStream = Stream.empty();

        // 4. Create a stream using Stream.of() with mixed types

        Stream<Object> mixedTypes = Stream.of(1,2,"pavan",true);

        // 5. Create a stream using Stream.iterate() to generate first 10 even numbers

        Stream<Integer> iterator = Stream.iterate(0,n -> n+2).limit(10);

        // 6. Create a stream using Stream.generate() to generate 5 random numbers

        Stream<Double> random = Stream.generate(Math::random).limit(5);

        // 7. Convert a primitive array int[] into an IntStream
        int[] nums = {1,2,3,4,5,6};
        IntStream integer = Arrays.stream(nums);

        //8. Convert a List<String> into a Stream<String>
        List<String> list = Arrays.asList("pavan","streams","examples");
        Stream<String> streamList = list.stream();

        // 9. Convert a stream into a List

        List<Integer> list1 = Stream.of(1,2,3,4,5).collect(Collectors.toList());

        // 10. Convert a stream into a set

        Set<String> set = Stream.of("streams","examples","practice").collect(Collectors.toSet());

    }
}
