package com.streams.practice.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {

        //Write a java program to find sum of even numbers and sum of odd numbers in a given list using java 8 streams.

        List<Integer> list = Arrays.asList(1,2,3,4,5);

      Map<Boolean,Integer> l =  list.stream()
              .collect(Collectors.partitioningBy(n -> n%2==0,Collectors.summingInt(Integer::intValue)));

        System.out.println("even numbers sum: " + l.get(true));
        System.out.println("odd numbers sum: " + l.get(false));


        //Write a Java 8 method to find the sum of all elements in a List of integers.

     int sum = list.stream().mapToInt(Integer::intValue).sum();
      System.out.println(sum);


        /*I need to compare if two arrays are same, but the order does not matter, just compare the elements in arr1 to elements in arr2
        a. arr1 = [3, 2, 5, 7]
        b. arr2 = [2, 3, 5, 7]*/

        int[] arr1 = {3,2,5,7};
        int[] arr2 = {2,4,5,7};

        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        System.out.println(set1.equals(set2));


        //Write a program to convert first half of the String in lower case and second half in upper case

        String name = "pavan";
        System.out.println(name.length()/2);

        StringBuffer sb = new StringBuffer();

        String s = sb.append(name.substring( 0, name.length()/2).toLowerCase()).append(name.substring(name.length()/2).toUpperCase()).toString();
        System.out.println(s);

    }
}
