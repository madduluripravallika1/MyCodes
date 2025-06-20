package org.example.myProjets;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student12{
    private String name;
    private  String grade;

    public Student12(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student12{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
public class GroupStudentsbyGrade {
    public static void main(String[] args) {
        List<Student12> students = Arrays.asList(
                new Student12("A", "A"),
                new Student12("B", "B"),
                new Student12("C", "A"),
                new Student12("D", "C")
        );
        Map<String, List<Student12>> myGroupingGraede = students.stream()
                .collect(Collectors.groupingBy(Student12::getGrade));
        System.out.println(myGroupingGraede.toString());


    }
}
