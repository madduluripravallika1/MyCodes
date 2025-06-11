package org.example.PracticeProblemsregardingthejava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee{
     String name;
     int salary;

     public Employee(String name, int salary) {
         this.name = name;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getSalary() {
         return salary;
     }

     public void setSalary(int salary) {
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Employee{" +
                 "name='" + name + '\'' +
                 ", salary=" + salary +
                 '}';
     }
 }
public class maxsalaryfromalist {
    public static void main(String[] args){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("rama",65000));
        employees.add(new Employee("ramu",55000));
        employees.add(new Employee("ram",35000));
        employees.add(new Employee("raja",45000));

        System.out.println(employees);
        System.out.println("-------------------------");
        for (Object str:employees){
            System.out.println(str);
        }
//        Optional<Employee> maxEmployeesalary=employees.stream()
//                .max((list1,list2)->list1.getSalary().compareTo(list2.getSalary()));


        Optional<Employee> result = employees.stream().max(Comparator.comparingInt(Employee::getSalary));
        System.out.println(result.get());
        Optional<Employee> resultnow=employees.stream().min((Comparator.comparing(Employee::getSalary)));
        System.out.println(resultnow.get());
    }
}
