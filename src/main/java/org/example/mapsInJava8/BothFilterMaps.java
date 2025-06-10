package org.example.mapsInJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    public int id;
    public String name;
    public double salary;

     public Employee(int id, String name, double salary) {
         this.id = id;
         this.name = name;
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "id=" + id +
                 ", name='" + name + '\'' +
                 ", salary=" + salary +
                 '}';
     }
 }
public class BothFilterMaps {
    public static void main(String[] args){
        List<Employee> myData=new ArrayList<>();
        myData.add(new Employee(10,"ram",90000));
        myData.add((new Employee(20,"krishna",23000)));
        myData.add((new Employee(30,"pavani",29000)));
        myData.add((new Employee(40,"Teja",8000)));
        myData.add((new Employee(50,"Macha",27000)));
        myData.add((new Employee(60,"Masti",28000)));


        List<Double> coma=myData.stream()
                .filter(str->str.salary>20000)
                .map(p->p.salary)
                .collect(Collectors.toList());
        System.out.println(coma);
    }
}
