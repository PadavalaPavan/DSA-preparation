package com.streams.practice.advanced;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {

        //How to find duplicate elements in a given integers list in java using Streams function.

        List<Integer> list = Arrays.asList(1,3,4,5,5,6,4,1);


        Map<Integer,Long> ll = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
             List<Integer> l =   ll.entrySet().stream().filter(n -> n.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(l);

        Set<Integer> dups = new HashSet<>();

           list.stream().filter(n -> !dups.add(n)).collect(Collectors.toSet());

       // Write a java 8 program to find the words starting with vowels

        List<String> names = Arrays.asList("pavan","apple","elephant","unique","all");

       List<String> vowels =  names.stream().filter(Example6::isVowel).collect(Collectors.toList());
        System.out.println(vowels)  ;
    }

    public static boolean isVowel(String name){
        return "aeiou".contains(String.valueOf(name.charAt(0)));
    }
}
