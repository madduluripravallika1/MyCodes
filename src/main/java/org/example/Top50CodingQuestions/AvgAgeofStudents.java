package org.example.Top50CodingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student123{
    private  int id;
    private String sname;
    private int age;

    public Student123(int id, String sname, int age) {
        this.id = id;
        this.sname = sname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student123{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                '}';
    }
}
public class AvgAgeofStudents {
    public static void main(String[] args) {
        List<Student123> student123=new ArrayList<>();
        student123.add(new Student123(1, "Raju", 18));
        student123.add(new Student123(2, "Priya", 20));
        student123.add(new Student123(3, "Amit", 22));
        student123.add(new Student123(4, "Sneha", 19));
        student123.add(new Student123(5, "Karan", 21));
        student123.add(new Student123(6, "Divya", 20));
        student123.add(new Student123(7, "Rahul", 23));
        student123.add(new Student123(8, "Anjali", 18));
        student123.add(new Student123(9, "Vikram", 22));
        student123.add(new Student123(10, "Neha", 19));

        Double myValues =student123.stream()
                .collect(Collectors.averagingDouble(Student123::getAge));

        System.out.println(myValues.toString());
    }
}
