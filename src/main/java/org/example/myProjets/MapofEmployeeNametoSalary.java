package org.example.myProjets;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee12{
    String name;
    double salary;

    public Employee12(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class MapofEmployeeNametoSalary {
    public static void main(String[] args) {
        List<Employee12> employees = Arrays.asList(
                new Employee12("Amit", 45000),
                new Employee12("Neha", 60000),
                new Employee12("Kiran", 75000)
        );
        Map<String, Double> myEmployee = employees.stream()
                .collect(Collectors.toMap(Employee12::getName,Employee12::getSalary));
        System.out.println(myEmployee);

    }
}
