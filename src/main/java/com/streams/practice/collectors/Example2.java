package com.streams.practice.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        //Collect employees into a Map<id, name>.

        List<Employee> employee = Arrays.asList(new Employee(1,"pavan","9999999","Core Engineer",25000,25),
                new Employee(2,"kumar","098766","IT",40000,26),
                new Employee(3,"kumar","98765","Core Engineer",50000,28),
                new Employee(4,"pp","098765545678","IT",35000,31));

        Map<Integer, String> map = employee.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));

       // Group employees by department.

        Map<String,List<Employee>> e =  employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(e);

        //Count employees in each department.

        Map<String,Long> i = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(i);

        //Find average salary per department.
       Map<String,Double> d = employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(d);

        //Partition employees into above/below age 30.
       Map<Boolean,List<Employee>> l = employee.stream().collect(Collectors.partitioningBy(n -> n.getAge()>30));
        System.out.println(l.get(true));

        //Collect names into a comma-separated string.
       String a =  employee.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(a);

        //Create a map of employee name → salary.

        Map<String,Double> b = employee.stream().collect(Collectors.toMap(Employee::getName,Employee::getSalary));

    }
}
class Employee{
    public int id;
    public String name;
    public String phoneNumber;
    public String department;
    public double salary;
    public int age;

    public Employee(int id,String name,String phoneNumber,String department, double salary, int age){
        this.name = name;
        this.id = id;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.salary =  salary;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
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
    public String getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public String toString(){
        return "Name: "+getName() +" , Phone Number: "+getPhoneNumber() +" , ID: "+ getId() +".";
    }
}
