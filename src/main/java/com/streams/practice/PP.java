package com.streams.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PP {

    public static void main(String[] args) {

        Calculator sum = (a,b) -> a+b;
        System.out.println(sum.add(1,2));

        List<Employee> emp = Arrays.asList(new Employee("pavan","core",40000)
                ,new Employee("kumar","IT",25000),
                new Employee("pp","IT",45000));

        List<String> names = Arrays.asList("pavan","kumar","padavala","bhanu","rajendra");
         names.stream().max(Comparator.comparingInt(String::length));
         Map<String,DoubleSummaryStatistics> stats =   emp.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summarizingDouble(Employee::getSalary)));
        double emp1 = emp.stream().mapToDouble(Employee::getSalary).max().orElse(0);
        emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());

        System.out.println(emp1);

          Map<String,List<Employee>> list = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));

         Map<Integer,List<String>> name = names.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(list);
        System.out.println(name);

        String s = "pavan kumar";

       Map<String,Long> count = Arrays.stream(s.split("")).filter(e -> !Objects.equals(e, " "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(count);

        List<Integer> l = Arrays.asList(1,2,3,4,2,3,4,5);

       List<Integer> ll = l.stream().distinct().collect(Collectors.toList());
    }
}

class Employee{
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

@FunctionalInterface
interface Calculator{
    int add(int a, int b);
}
