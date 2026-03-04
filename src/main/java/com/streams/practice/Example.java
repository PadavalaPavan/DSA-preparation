package com.streams.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        String sentence = "This is good company";

       String revSent =  Arrays.stream(sentence.split(" ")).map(n -> n.length()>5 ? new StringBuilder(n).reverse().toString():n)
                .collect(Collectors.joining(" "));
        System.out.println(revSent);

        String name = "My name is Pavan !";

        String[] s = name.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i< s.length ; i++){
            StringBuilder sb1 = new StringBuilder(s[i]);
            sb.append(sb1.reverse()).append(" ");
        }
        System.out.println(sb);
    }
}
