package org.example.practceProblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MyEmployee{
    private int id;
    private  String name;
    private double salary;

    public MyEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MyEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class SortEmployeeNames {
    public static void main(String[] args) {
        List<MyEmployee> myEmployeeList=new ArrayList<>();
        myEmployeeList.add(new MyEmployee(1, "Alice", 750));
        myEmployeeList.add(new MyEmployee(2, "Bob", 600));
        myEmployeeList.add(new MyEmployee(3, "Charlie", 750));
        myEmployeeList.add(new MyEmployee(4, "David", 820));
        myEmployeeList.add(new MyEmployee(5, "Eve", 600));
        myEmployeeList.add(new MyEmployee(6, "Frank", 950));
        myEmployeeList.add(new MyEmployee(7, "Grace", 820));
        myEmployeeList.add(new MyEmployee(8, "Hannah", 500));
        myEmployeeList.add(new MyEmployee(9, "Ivy", 750));
        myEmployeeList.add(new MyEmployee(10, "Jack", 600));


        Map<Double, List<MyEmployee>> myMAp = myEmployeeList.stream().collect(Collectors.groupingBy(MyEmployee::getSalary,
                        Collectors.collectingAndThen(
                                Collectors.toList(),list->list.stream().sorted(Comparator.comparing(MyEmployee::getName).reversed()).collect(Collectors.toList()))));
        System.out.println(myMAp.toString());
    }
}
