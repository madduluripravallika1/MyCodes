package org.example.Top50CodingQuestions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
    private  String category;
    private String name;
    private double price;

    public Product(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
public class TotalNumberOfPricesWithTotalprice {
    public static void main(String[] args) {
    List<Product> myProducts=new ArrayList<>();
        myProducts.add(new Product("Electronics", "Smartphone", 25000));
        myProducts.add(new Product("Electronics", "Laptop", 55000));
        myProducts.add(new Product("Electronics", "Headphones", 2000));
        myProducts.add(new Product("Groceries", "Rice", 1500));
        myProducts.add(new Product("Groceries", "Wheat", 1200));
        myProducts.add(new Product("Groceries", "Oil", 1800));
        myProducts.add(new Product("Books", "Java Programming", 500));
        myProducts.add(new Product("Books", "Spring Boot in Action", 800));
        myProducts.add(new Product("Books", "Data Structures", 600));


        Map<String, Double> mydate= myProducts.stream()
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.averagingDouble(Product::getPrice)));
        System.out.println(mydate);
    }
}
