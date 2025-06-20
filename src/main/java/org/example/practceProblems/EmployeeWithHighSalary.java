//package org.example.practceProblems;
//
//import org.example.practceProblems.Employee;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Employee456{
//     private int id;
//    private String name;
//    private double salary;
//
//    public Employee456(int id, String name, double salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public  double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//}
//public class EmployeeWithHighSalary {
//    public static void main(String[] args){
//        List<Employee456> myEmployee=new ArrayList<>();
//        myEmployee.add(new Employee456(10,"Raja",410));
//        myEmployee.add(new Employee456(11, "Priya", 520));
//        myEmployee.add(new Employee456(12, "Kiran", 480));
//        myEmployee.add(new Employee456(13, "Sneha", 610));
//        myEmployee.add(new Employee456(14, "Vikram", 450));
//        myEmployee.add(new Employee456(15, "Anjali", 570));
//
//
//            myEmployee.stream()
//                    .max()
//
//
//
//    }
//}
