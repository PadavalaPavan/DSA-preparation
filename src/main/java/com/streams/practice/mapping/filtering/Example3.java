package com.streams.practice.mapping.filtering;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args){
        //3. Filter numbers greater than 50 from a list.

        List<Integer> list = Arrays.asList(1,4,89,40,50,70,90);

        List<Integer> greaterList = list.stream().filter(n -> n>50).collect(Collectors.toList());
        System.out.println(greaterList);

    }
}
