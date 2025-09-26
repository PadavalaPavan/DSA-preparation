package com.streams.practice.sorting.distinct;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        //Sort a list of products by price in descending order.
        List<Product> products = Arrays.asList(new Product("books",10),
                new Product("pencil",5),
                new Product("pen",10),
                new Product("cover",30));

        List<Product> sortedByRate = products.stream().sorted(Comparator.comparingDouble(Product::getRate).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedByRate);

    }
}
class Product{
    String productName;
    double rate;
    public Product(String productName, double rate){
        this.productName = productName;
        this.rate = rate;
    }
    public String getProductName(){
        return productName;
    }
    public double getRate(){
        return rate;
    }

    @Override
    public String toString(){
        return "product { Product Name: '"+productName +"', rate: '"+ rate+"'}";
    }
}
