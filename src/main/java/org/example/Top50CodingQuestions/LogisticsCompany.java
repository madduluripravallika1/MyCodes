package org.example.Top50CodingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Delivery{
    private  String city;
    private String driverName;
    private double distane;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getDistane() {
        return distane;
    }

    public void setDistane(double distane) {
        this.distane = distane;
    }

    public Delivery(String city, String driverName, double distane) {
        this.city = city;
        this.driverName = driverName;
        this.distane = distane;
    }



}
public class LogisticsCompany {
    public static void main(String[] args) {
        List<Delivery> myDeliveries=new ArrayList<>();
        myDeliveries.add(new Delivery("Ongole", "Raju", 300.5));
        myDeliveries.add(new Delivery("Guntur", "Sita", 450.0));
        myDeliveries.add(new Delivery("Ongole", "Ravi", 275.2));
        myDeliveries.add(new Delivery("Hyderabad", "John", 600.0));
        myDeliveries.add(new Delivery("Guntur", "Radha", 320.4));
        myDeliveries.add(new Delivery("Hyderabad", "Mohan", 150.3));
        myDeliveries.add(new Delivery("Chennai", "Latha", 500.7));
        myDeliveries.add(new Delivery("Chennai", "Kiran", 420.0));
        myDeliveries.add(new Delivery("Ongole", "Sneha", 310.9));
        myDeliveries.add(new Delivery("Guntur", "Arjun", 510.6));

        Map<String,Double> my=myDeliveries.stream()
                .collect(Collectors.groupingBy(Delivery::getCity,Collectors.summingDouble(Delivery::getDistane)));
        System.out.println(my);
    }
}
