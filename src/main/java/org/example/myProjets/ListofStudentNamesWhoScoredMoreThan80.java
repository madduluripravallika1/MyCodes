package org.example.myProjets;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class ListofStudentNamesWhoScoredMoreThan80 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Raj", 95),
                new Student("Ravi", 70),
                new Student("Simran", 88),
                new Student("Divya", 60)
        );

        List<String> myStrings = students.stream()
                .filter(s->s.getMarks()>80)
                .map(Student::getName)
                        .collect(Collectors.toList());
        System.out.println(myStrings);
    }
}
