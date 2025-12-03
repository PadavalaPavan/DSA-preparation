package com.streams.practice.basics;

public class Example {
    public static void main(String[] args) {

    }
}

 interface Exam{
    abstract void m1();
   default void m2(){

    }

    static void m3(){

    }
}

abstract class E{
    abstract void m1();

    void m2(){

    }
}
