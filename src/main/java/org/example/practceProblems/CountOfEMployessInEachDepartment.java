/*
package org.example.practceProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee{
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class CountOfEMployessInEachDepartment {
    public static void main(String[] args){
        List<Employee> myEmployee=new ArrayList<>();
        myEmployee.add(new Employee(1, "Alice Johnson", "HR", 65000));
        myEmployee.add(new Employee(2, "Bob Smith", "Engineering", 82000));
        myEmployee.add(new Employee(3, "Carol Williams", "Marketing", 59000));
        myEmployee.add(new Employee(4, "David Brown", "Engineering", 91000));
        myEmployee.add(new Employee(5, "Emma Davis", "HR", 68000));
        myEmployee.add(new Employee(6, "Frank Miller", "Finance", 75000));
        myEmployee.add(new Employee(7, "Grace Wilson", "Marketing", 62000));
        myEmployee.add(new Employee(8, "Henry Moore", "Finance", 78000));


        Map<Employee, Long> myWholeEmps=  new HashMap<>();
        myEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
                .entrySet()
                .stream()
                .forEach(System.out::println);
    }
}
*/
