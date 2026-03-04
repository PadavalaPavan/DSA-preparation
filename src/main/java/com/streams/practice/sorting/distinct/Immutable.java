package com.streams.practice.sorting.distinct;

import java.util.ArrayList;
import java.util.List;


//1. Make the class final
//So no one can extend and modify behavior.

public final class Immutable {

   // 2. Make all fields private and final
    // So they cannot be modified directly.

    private final String name;
    
    //5. Return defensive copies for mutable objects
    //If your class has mutable objects like List, Date, etc., return a copy.
    
    private final List<String> courses;

    //3. Initialize fields only via constructor

    public Immutable(String name, List<String> courses){
        this.name = name;
        this.courses = new ArrayList<>(courses);
    }

   // 4. No setters
    
    public String getName(){
        return name;
    }

    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ece");
        Immutable im = new Immutable("pavan",list);
        im.getCourses().add("cse");

        System.out.println(im.getCourses());

    }
}

//bill pugh pattern

 class Singleton {
//     private final static Singleton instance = new Singleton();
//    private Singleton() {
//    }
//
//    public Singleton getInstance(){
//
//            return instance;
//
//    }

     private static  Singleton Instance;

     private Singleton(){}

     private static Singleton getInstance(){
         if(Instance == null){
             return new Singleton();
         }else
             return Instance;
     }

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstanc() {
        return SingletonHelper.INSTANCE;
    }
}





