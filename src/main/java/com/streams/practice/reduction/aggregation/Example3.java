package com.streams.practice.reduction.aggregation;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Example3 {
    public static void main(String[] args) {
        //Find total salary of all employees.
        List<Employee> emp1 = Arrays.asList(new Employee("pavan",1,25000),
                new Employee("kumar",2,34000),
                new Employee("padavala",3,50000));

       double sum = emp1.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(sum);

        //Find maximum salary among employees.
      double max =  emp1.stream().mapToDouble(Employee::getSalary).max().orElse(Integer.MIN_VALUE);
        System.out.println(max);

        //Find second highest salary using streams.
        Optional<Double> second = emp1.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(second);
    }
}
class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name,int id,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
}
