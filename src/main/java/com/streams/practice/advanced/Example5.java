package com.streams.practice.advanced;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {

        /*We have a list of employees, in which we have id, name, age, gender and salary.
        a. How many male and female employees are there in the organization.
                b. Take out average salary based on employee gender.*/

        List<Employee> employees = Arrays.asList( new Employee(1,"pavan",26,'M',35600.00),
                new Employee(1,"kumar",25,'M',45600.00),
                new Employee(1,"rajii",26,'F',55600.00),
                new Employee(1,"bhanu",26,'F',25600.00),
                new Employee(1,"nani",26,'M',90600.00)
        ) ;

        Map<Character,Long> count = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        Map<Character,Double> avg = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(count);

    }
}

class Employee {
    private final int id;
    private final String name;
    private final int age;
    private final char gender;
    private final double salary;

    public char getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public Employee(int id, String name, int age, char gender, double salary) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.salary = salary;
        this.id = id;
    }
}
