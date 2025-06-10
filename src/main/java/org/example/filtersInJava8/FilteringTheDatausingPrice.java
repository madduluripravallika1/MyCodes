package org.example.filtersInJava8;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    public  int id;
    public String name;
    public double price;

     public Product(int id, String name, double price) {
         this.id = id;
         this.name = name;
         this.price = price;
     }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


public class FilteringTheDatausingPrice {
    public static void main(String[] args) {
        List<Product> myProduct=new ArrayList<>();
        myProduct.add(new Product(101,"Hp",23000));
        myProduct.add(new Product(102,"vivo",28000));
        myProduct.add(new Product(103,"MI",32000));
        myProduct.add(new Product(104,"samsung",50000));
        myProduct.add(new Product(105,"roopa",96000));
        myProduct.add(new Product(106,"horlics",29000));

        List<Product> myValues=myProduct.stream()
                .filter(str->str.price>25000)
                .collect(Collectors.toList());
        System.out.println(myValues.toString());

    }
}
