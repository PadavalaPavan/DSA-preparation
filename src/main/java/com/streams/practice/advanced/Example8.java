package com.streams.practice.advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        ////Write a java 8 program to print max salary of employee in each department max/min employee salary in given collection

        List<Employees> employeesList = Arrays.asList(new Employees(1,"pavan","core engineer",50000),
                new Employees(1,"pp","core engineer",700000),
                new Employees(1,"p","IT",580000),
                new Employees(1,"pavan1","core engineer",570000),
                new Employees(1,"pavan2","IT",590000),
                new Employees(1,"pavan3","core engineer",850000));

             Map<String,Employees> max =    employeesList.stream()
                         .collect(Collectors.toMap(Employees::getDepartment,e -> e, (e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2));
             max.forEach((dept, emp) -> System.out.println(dept +": max salary:  "+ emp.getSalary()));

        Map<String,Employees> min = employeesList.stream().collect(Collectors.toMap(Employees::getDepartment,e -> e, (e1,e2) -> e1.getSalary()<e2.getSalary()?e1:e2));
             min.forEach((dept,emp) -> System.out.println(dept + ": min salary: "+emp.getSalary()));


            Map<String,List<Employees>> emp = employeesList.stream().collect(Collectors.groupingBy(Employees::getDepartment));

        emp.forEach((dept,empl) -> {
            System.out.println(dept);
            empl.forEach(System.out::println);
        }
        );

    }
}

class Employees{
    private final int id;
    private final String name;
    private final String department;
    private final double salary;

    public Employees(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId(){
        return id;
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
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }

}
