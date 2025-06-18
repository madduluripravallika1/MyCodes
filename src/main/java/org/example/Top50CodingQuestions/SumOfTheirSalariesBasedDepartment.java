package org.example.Top50CodingQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;



class Employee{
    private String eName;
    private String department;
    private double salary;

      public Employee(String eName, String department, double salary) {
          this.eName = eName;
          this.department = department;
          this.salary = salary;
      }

      public String geteName() {
          return eName;
      }

      public void seteName(String eName) {
          this.eName = eName;
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
  }

public class SumOfTheirSalariesBasedDepartment {
    public static void main(String[] args) {
    List<Employee> myEmployee=new ArrayList<>();
        myEmployee.add(new Employee("Ram", "Teaching", 25000));
        myEmployee.add(new Employee("Sita", "Teaching", 30000));
        myEmployee.add(new Employee("John", "Admin", 40000));
        myEmployee.add(new Employee("Radha", "Admin", 35000));
        myEmployee.add(new Employee("Mohan", "HR", 45000));


        Map<String, Double> mydata=myEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(mydata);
    }


}
