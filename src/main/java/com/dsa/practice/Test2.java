package com.dsa.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args){
        List<Integer> l1 = Arrays.asList(9,9,9,9,9,9,9);
        List<Integer> l2 = Arrays.asList(9,9,9,9);

        List<Integer> output = new LinkedList<>();

        int length = Math.max(l1.size(), l2.size());


        for(int i =0;i<length;i++) {
            int remainder=0;
            if (l1.get(i) + l2.get(i) < 10) {
                output.add(l1.get(i) + l2.get(i));
            }else{
                output.add((l1.get(i) + l2.get(i))%10);
                remainder++;
            }
        }

        System.out.println(output);

    }
}
