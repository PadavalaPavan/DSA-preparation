package com.streams.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Company {
    public static void main(String[] args) {

        List<Employee1> emps = Arrays.asList(new Employee1("pavan",25000,"core"),
                                              new Employee1("rajii",35000,"IT"),
                new Employee1("bhanu",45000,"IT"));

      Map<String,List<Employee1>> map=  emps.stream().collect(Collectors.groupingBy(Employee1::getDepartment));
    Map<String,Optional<Employee1>> e = emps.stream()
              .collect(Collectors.groupingBy(Employee1::getDepartment,
                      Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary))));
        e.forEach((k,v) -> System.out.println(k +" = "+ v.get()));
    }
}

class Employee1{
  String name;
  double salary;
  String department;

  Employee1(String name, double salary, String department){
      this.name = name;
      this.salary = salary;
      this.department = department;
  }

  public String getName(){
      return name;
  }
  public double getSalary(){
      return salary;
  }
  public String getDepartment(){
      return department;
  }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary + ", department="+department+
                '}';
    }
}
