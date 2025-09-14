package com.streams.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        String sentence = "This is good company";

       String revSent =  Arrays.stream(sentence.split(" ")).map(n -> n.length()>5 ? new StringBuilder(n).reverse().toString():n)
                .collect(Collectors.joining(" "));
        System.out.println(revSent);
    }
}
