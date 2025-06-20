package org.example.myProjets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }



}
public class AveragePriceofProductsinInventory {
    public static void main(String[] args){
        List<Product> products = List.of(
                new Product("Laptop", 80000),
                new Product("Phone", 40000),
                new Product("Tablet", 30000)
        );

        Double myAvgProducts = products.stream()
                .collect(Collectors.averagingDouble(Product::getPrice));
        System.out.println(myAvgProducts);
    }
}
