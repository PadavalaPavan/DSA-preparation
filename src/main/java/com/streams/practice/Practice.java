package com.streams.practice;

public class Practice {

    public static void main(String[] args) {
        Lambda l = (a,b) -> a+b;
        System.out.println( l.sum1(1,2));
    }

}

@FunctionalInterface
interface Lambda{
     int sum1(int a, int b);

    default void m1(){
        System.out.println("k");
    }
}
