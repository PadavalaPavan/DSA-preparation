package com.streams.practice.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args){


        List<Product> products = Arrays.asList(new Product(1,"pen",10),
                new Product(2,"book",50),
                new Product(3,"phone",25000));

        //Group products by category and count.
        Map<String,Long> pp = products.stream().collect(Collectors.groupingBy(Product::getProductName,Collectors.counting()));
        System.out.println(pp);

        //Collect product prices into a TreeSet.

       TreeSet<Double> d = products.stream().map(Product::getPrice).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(d);
    }
}

class Product{

    int id;
    String productName;
    double price;

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    Product(int id, String productName, double price){
        this.id = id;
        this.productName = productName;
        this.price = price;
    }


}
