package com.streams.practice.sorting.distinct;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Example3 {
    public static void main(String[] args) {

        //Sort employees by salary
        List<Employee> employeeList = Arrays.asList(new Employee("pavan","Engineering",560000.00,26),
                new Employee("pandu","Engineering",600000.00,28),
                new Employee("ranjith","RPA",800000.00,30),
                new Employee("prudhvi","IT",900000.00,28));

       List<Employee> sortedBySalary = employeeList.stream()
               .sorted(Comparator.comparingDouble(Employee::getSalary))
               .collect(Collectors.toList());
        System.out.println(sortedBySalary);

        //Sort employees by name and then by age.
        List<Employee> sortedBySalary1 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).thenComparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedBySalary1);
    }
}

class Employee{
    private final String name;
    private final String department;
    private final double salary;
    private final int age;

    public Employee(String name, String department, double salary,int age){
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
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
    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary='" + salary + "', age='" + age + "'}";
    }

}