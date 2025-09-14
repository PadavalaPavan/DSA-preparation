package com.dsa.practice;
import java.util.*;
import java.util.stream.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        System.out.println(l1);
       list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);



      HashMap<Integer,Integer> i = list.stream().collect(Collectors.toMap(n -> n,m -> 1,Integer::sum,HashMap::new));
             //  i.entrySet().forEach(System.out::println) ;
              List<Integer> l2 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
              List<Integer> l3 = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
              List<Integer> l4 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("l2 = " + l2);
        System.out.println("l3 = "+l3);
        System.out.println("l4 = " +l4);
               list.stream().collect(Collectors.groupingBy(n -> n,Collectors.counting())).entrySet().forEach(System.out::println);

              int ii= list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(ii);
              Collections.reverse(list);
       // System.out.println(list);
              String firstName ="pavan kumar";
         String m =     Arrays.stream(firstName.split(" ")).map(n-> new StringBuffer(n).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(m);

        StringBuffer sb = new StringBuffer();

        for(String ss : firstName.split(" ")) {
            sb.append(ss.substring(0, 1).toUpperCase()).append(ss.substring(1).toLowerCase()).append(" ");

        }

        System.out.println(sb);

        List<String> names = Arrays.asList("pavan","kumar","padavala","pandu","abhi");
     Map<Character,List<String>> hh =  names.stream().collect(Collectors.groupingBy(n -> n.charAt(0)));

        //names.stream().collect(Collectors.groupingBy(String::length)).entrySet().forEach(System.out::println);

       names.stream().collect(Collectors.partitioningBy(n -> n.length()>5)).entrySet().forEach(System.out::println);
        Map<Boolean, Long> na =names.stream().collect(Collectors.partitioningBy(n -> n.length()>5,Collectors.counting()));

        System.out.println(na);

        List<Person> person = Arrays.asList( new Person("pavan",25,5.6),
                                             new Person("kumar",26,6),
                new Person("padavala",27,6.5)
        );

       Optional<Person> highsal = person.stream().max(Comparator.comparing(Person::getSalary));
        highsal.ifPresent(n -> System.out.println(n.getSalary()));
        person.stream().filter(n -> n.getName().length()>5).collect(Collectors.toList()).forEach( System.out::println);
        //System.out.println(highlen);
        String characters ="pogremming";
        Map<Object, Long> count = Arrays.stream(characters.split("")).collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(count);

        }
    }

    class Person{
    String name;
    int age;
    double salary;
    public Person(String name,int age,double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary() {
        return salary;
    }
}






