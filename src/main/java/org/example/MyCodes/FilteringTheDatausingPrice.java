package org.example.MyCodes;


import java.util.ArrayList;
import java.util.List;

class Product{
    public  int id;
    public String name;
    public double price;

     public Product(int id, String name, double price) {
         this.id = id;
         this.name = name;
         this.price = price;
     }
 }


public class FilteringTheDatausingPrice {
    public static void main(String[] args) {
        List<Product> myProduct=new ArrayList<>();
        myProduct.add(new Product(101,"Hp",23000));
        myProduct.add(new Product(101,"vivo",23000));
        myProduct.add(new Product(101,"MI",23000));
        myProduct.add(new Product(101,"samsung",23000));
        myProduct.add(new Product(101,"roopa",23000));
        myProduct.add(new Product(101,"",23000));


    }
}
