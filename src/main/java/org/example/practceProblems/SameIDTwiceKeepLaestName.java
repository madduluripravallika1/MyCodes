package org.example.practceProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student{
    private int id;
    private  String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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
}
public class SameIDTwiceKeepLaestName {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Alice"),
                new Student(2, "Bob"),
                new Student(3, "Charlie"),
                new Student(2, "Bobby"),
                new Student(4, "David"),
                new Student(3, "Charles"),
                new Student(5, "Eve"),
                new Student(1, "Alicia")
        );
       /* Map<Integer,String> myMaps=students.stream()
                .collect(Collectors.groupingBy(Student::getId),Collectors.collectingAndThen())*/
    }
}
