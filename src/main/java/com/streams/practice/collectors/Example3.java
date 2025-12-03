package com.streams.practice.collectors;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;

public class Example3 {
    public static void main(String[] args) {
        //Collect words into a Map<word, length>.
        List<String> names = Arrays.asList("pavan","kumar","padavala");

        Map<String,Integer> map = names.stream().collect(Collectors.toMap(n -> n,String::length));
    }
}
