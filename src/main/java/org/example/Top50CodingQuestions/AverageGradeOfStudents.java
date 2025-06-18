package org.example.Top50CodingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    private String sname;
    private String cource;
    private double grade;

     public Student(String sname, String cource, double grade) {
         this.sname = sname;
         this.cource = cource;
         this.grade = grade;
     }

     public String getSname() {
         return sname;
     }

     public void setSname(String sname) {
         this.sname = sname;
     }

     public String getCource() {
         return cource;
     }

     public void setCource(String cource) {
         this.cource = cource;
     }

     public double getGrade() {
         return grade;
     }

     public void setGrade(double grade) {
         this.grade = grade;
     }
 }
public class AverageGradeOfStudents {
    public static void main(String[] args) {
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("Ram", "CSE", 80.3));
        myStudents.add(new Student("Sita", "ECE", 76.5));
        myStudents.add(new Student("John", "CSE", 92.0));
        myStudents.add(new Student("Radha", "EEE", 85.7));
        myStudents.add(new Student("Mohan", "ECE", 69.8));
        myStudents.add(new Student("Latha", "EEE", 88.2));

        Map<String,Double> myValues=myStudents.stream()
                .collect(Collectors.groupingBy(Student::getCource,Collectors.summingDouble(Student::getGrade)));
        System.out.println(myValues);
    }

    }

