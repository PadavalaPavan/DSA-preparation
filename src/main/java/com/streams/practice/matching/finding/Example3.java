package com.streams.practice.matching.finding;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        //Check if any employee has salary > 1L.

        List<Employee> emp = Arrays.asList(new Employee("pavan",560000),
                                           new Employee("kumar",10000));
        boolean flag = emp.stream().anyMatch(n -> n.getSalary()>100000);
        System.out.println(flag);
    }
}

class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
}
