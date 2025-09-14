package com.dsa.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class KMostElement {
    public static void main(String[] args){
        String[] names = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(getKMostElem(names,2));

    }
    public static List<String> getKMostElem(String[] names, int k){
        return  stream(names).collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream()
                .sorted((a,b)->b.getValue().compareTo(a.getValue())).limit(k).map(Map.Entry::getKey).collect(Collectors.toList());

    }
}
