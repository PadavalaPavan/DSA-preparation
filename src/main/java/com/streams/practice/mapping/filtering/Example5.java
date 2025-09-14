package com.streams.practice.mapping.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
       // Convert all integers in a list to their squares.

        List<Integer> list = Arrays.asList(2,3,4,56,7,8);
      List<Integer>  squareList =  list.stream().map(n -> n*n).collect(Collectors.toList());

      //Convert a list of integers into a list of binary strings

        List<String> binary = list.stream().map(Integer::toBinaryString).collect(Collectors.toList());
        System.out.println(binary);

        //Convert list of prices in USD to INR using multiplication

        double usd = 88.91;

        List<Double> usdPrice = list.stream().map(p -> p*usd).collect(Collectors.toList());

      //Extract first character from each string in a list.

        List<String> names = Arrays.asList("streams","examples","java","practice");
       List<Character> firstChar =  names.stream().map(n -> n.charAt(0)).collect(Collectors.toList());

        // Filter null values from a list.

        List<String> names1 = Arrays.asList("streams","examples",null,"java","practice",null);
      List<String> n =  names1.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(n);

        //Find length of each string in a list.

        List<Integer> length = names.stream().map(String::length).collect(Collectors.toList());

        //Convert list of strings into a list of their hashCodes.

        List<Integer> hashcode = names.stream().map(String::hashCode).collect(Collectors.toList());

        System.out.println(hashcode);

        //Add prefix "Mr." to each name in a list.

        List<String> mr = names.stream().map(m -> "Mr. "+m).collect(Collectors.toList());
        System.out.println(mr);

        //Convert a list of sentences into a list of individual words using flatMap

        List<String> sentences = Arrays.asList(
                "Java is fun",
                "Streams are powerful",
                "Practice makes perfect"
        );

       List<String> aa = sentences.stream().flatMap(na -> Arrays.stream(na.split(" "))).collect(Collectors.toList());
        System.out.println(aa);

    }
}
