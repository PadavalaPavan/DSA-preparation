package com.streams.practice.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {

        //We have a list of integers. Find out all the numbers starting with 1 using stream function

        List<Integer> list = Arrays.asList(11, 18, 20, 24, 85, 66, 13);

        //method1

       List<Integer> list1 = list.stream().map(String::valueOf).collect(Collectors.toList())
                .stream().filter(m -> m.charAt(0)=='1').map(Integer::valueOf).collect(Collectors.toList());

       //method2
        List<Integer> list2 = list.stream().filter(n -> String.valueOf(n).startsWith("1")).collect(Collectors.toList());
        System.out.println(list1);

        //method3
      List<Integer> list3 =  list.stream().filter( n -> {
            while(n>=10){
              n=  n/10;
            }
                    return n == 1;
                }
        ).collect(Collectors.toList());
    }
}
