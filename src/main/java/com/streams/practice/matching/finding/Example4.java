package com.streams.practice.matching.finding;

import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        //Check if no student has failed.

        List<Student> students = Arrays.asList(new Student("pavan",1,45),
                new Student("kumar",2,20),
                new Student("nani",3,56));

       boolean flag = students.stream().anyMatch(n -> n.getMarks()<30);
        System.out.println(flag);

    }
}
class Student{
    String name;
    int id;
    double marks;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }

    Student(String name, int id, double marks){
        this.name = name;
        this.id = id;
        this.marks=marks;
    }
}
