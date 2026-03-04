package com.streams.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        // Reverse string without using reverse()
        String name = "pavan";
        StringBuilder rev = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
            rev.append(name.charAt(i));
        }
        System.out.println(rev);

//▸ Palindrome check
        System.out.println(name.contentEquals(rev));

//▸ First non-repeated character
       LinkedHashMap<String,Long> c = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
            Optional<String> cc =    c.entrySet().stream().filter(n -> n.getValue() == 1).map(Map.Entry::getKey).findFirst();
        System.out.println(cc.get());


//▸ First repeated character
        String s = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(n -> n.getValue() > 1).map(Map.Entry::getKey).findFirst().orElse("");
        System.out.println(s);

//▸ Character frequency
        Map<String, Long> map = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

//▸ Anagram check

        String n1 = "pavan";
        String n2 = "apanv";

        boolean isAnagram = Arrays.equals(n1.chars().toArray(), n2.chars().toArray());
//▸ Remove duplicates

        List<Integer> list = Arrays.asList(1, 2, 4, 3, 2, 1);
        List<Integer> l1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(l1);

//▸ Longest substring without repeating characters

        String sub = "pwwkew";

        HashMap<Character, Integer> l = new HashMap<>();
//▸ Only digits check

        String s1 = "pavan16";
        boolean flag = false;
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                flag = true;
            }
        }
        System.out.println(flag);

//▸ Capitalize each word
        String sen = "my name is pavan";

        String[] stringArray = sen.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String str : stringArray) {
            sb.append(str.substring(0, 1).toUpperCase()).append(str.substring(1)).append(" ");
        }

        System.out.println(sb.toString().trim());


//    Second largest number

        List<Integer> largest = Arrays.asList(1, 4, 5, 6, 2, 9, 5,2,5,6);
          int i = largest.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(i);
      int min1 =   largest.stream().sorted().findFirst().orElse(0);
        System.out.println("min: "+min1);
        int max1 = largest.stream().max(Comparator.naturalOrder()).orElse(Integer.MIN_VALUE);
        System.out.println("min: "+max1);
//▸ Missing number (1..n)

        List<Integer> num = Arrays.asList(1,2,4,5,6);

        HashSet<Integer> set = new HashSet<>(num);

        for(int ii =1; ii<=num.size();ii++){
            if(!set.contains(ii)){
                System.out.println(ii);
            }
        }

       int sum = num.stream().reduce(0,Integer::sum);

//▸ Find duplicates

     List<Integer> dups =   largest.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

//▸ Sort without sort()
//▸ Pairs with given sum
//▸ Move zeros to end

        int[] z = {1,0,4,0,5,0};
        int count =0;
        for(int x =0; x<z.length;x++){

            if(z[x]!=0){
                z[count] = z[x];
                count++;
            }
        }
        for(int y =count ; y< z.length;y++){
            z[y]=0;
        }
        System.out.println(Arrays.toString(Arrays.stream(z).toArray()));
//▸ Min & max in one loop
        int max = z[0];
        int min = z[0];
        for(int ii =1; ii<z.length;ii++){
            if(max<z[ii]){
                   max = z[ii];
            }
            if(min>z[ii])
                min = z[ii];
            }

//        Iterating HashMap

        Map<String,Integer> hm = new HashMap<>();
        hm.put("A", 3);
        hm.put("B", 1);
        hm.put("C", 2);

        hm.forEach((k,v) -> System.out.println(k +" -> "+v));

//▸ Sort by keys

        Map<String,Integer> h = new TreeMap<>(hm);
        h.forEach((k,v) -> System.out.println(k +" ->"+v));
        Map<String,Integer> h1 = new TreeMap<>(Comparator.reverseOrder());

//▸ Sort by values

        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
//▸ Custom object sorting
//▸ Comparable vs Comparator
//▸ Null key in HashMap
//▸ Hash collisions
//▸ HashMap internals (Java 8)
//▸ Fail-fast vs fail-safe
//▸ ConcurrentHashMap performance
        }
//▸ Rotated & sorted array
//▸ Intersection of arrays
//▸ Kth largest element

    List<Map<String,String>> list = new ArrayList<>();



}

