package com.streams.practice.primitive.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {

        //Convert List<Integer> into IntStream and sum.

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int i = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(i);

        //Find average of an IntStream.

        OptionalDouble d = list.stream().mapToDouble(Integer::doubleValue).average();

        //Convert String into IntStream of characters.

        String name = "pavan";

        name.chars().forEach(System.out::println);
        name.chars().mapToObj(c -> (char) c).forEach(System.out::println);

        //Generate first 10 squares using IntStream.range().

        IntStream.range(0, 10).map(n -> n * n).forEach(System.out::println);

        //Generate numbers from 1 to 100 and filter primes.

        IntStream.range(1, 100).filter(Example1::isPrime).forEach(System.out::println);

        //Convert long[] to LongStream and find max.

        long[] l = {1,2,3,45,5,66};

       long ll = Arrays.stream(l).max().orElse(0);

       // Convert double[] to DoubleStream and average.

        double[] dd = {5.5,6.6,7.6,8.2};
       double d1 = Arrays.stream(dd).average().orElse(0.0);

       //Generate random numbers using DoubleStream.

        DoubleStream r = new Random().doubles();
        System.out.println(r);

        //Convert IntStream to List<Integer>.
         int[] ii = {1,2,3,4};
        List<Integer> l1 = Arrays.stream(ii).boxed().collect(Collectors.toList());

        //Convert Stream of characters to String.

        Stream<Character> characterStream = Stream.of('a', 'b');

      String s =  characterStream.map(String::valueOf).collect(Collectors.joining());




    }

    public static boolean isPrime(int i) {
        if (i < 2) return false;
        if (i == 2) return true;
        if (i % 2 == 0) return false;
        for (int j = 3; j <= Math.sqrt(i); j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}
