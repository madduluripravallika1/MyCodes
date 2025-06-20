package org.example.myProjets;

import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
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
public class SumofSalaries {
public static void main(String[] args){
    List<Employee> employees = List.of(
            new Employee("Amit", 45000),
            new Employee("Neha", 60000),
            new Employee("Kiran", 75000),
            new Employee("Sonia", 30000)
    );
    Double sumOfSlaries = employees.stream()
            .filter(n->n.getSalary()>50000)
            .collect(Collectors.summingDouble(Employee::getSalary));
    System.out.println(sumOfSlaries);
}
}
