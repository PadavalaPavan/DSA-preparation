package com.streams.practice.mapping.filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee("pavan",1378),
                new Employee("pandu",1381),
                new Employee("poorna",1382));

        List<String> names = emp.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);
    }
}

class Employee{
    String name;
    int empId;

    Employee(String name, int empId){
        this.name = name;
        this.empId= empId;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
