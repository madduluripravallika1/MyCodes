package org.example.Top50CodingQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.stream.Collectors;

class Employee123{
    private int id;
    private String name;
    public  Employee123(int id,String name){
        this.id=id;
        this.name=name;
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

    @Override
    public String toString() {
        return "Employee123{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SortByMultipleFields {
    public static void main(String[] args){
        List<Employee123> myEmployees=new ArrayList<>();
        myEmployees.add(new Employee123(105, "Karan"));
        myEmployees.add(new Employee123(101, "Raju"));
        myEmployees.add(new Employee123(104, "Sneha"));
        myEmployees.add(new Employee123(102, "Priya"));
        myEmployees.add(new Employee123(103, "Amit"));

        List<Employee123> myEmployees123 =new ArrayList<>();
        myEmployees123=myEmployees.stream()
                .sorted(Comparator.comparing(Employee123::getId).thenComparing(Employee123::getName))
                .collect(Collectors.toList());
        System.out.println(myEmployees123.toString());

    }
}
