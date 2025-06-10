package org.example.flatMapExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String sname;
    int sid;
    char grade;

     public Student(String sname, int sid, char grade) {
         this.sname = sname;
         this.sid = sid;
         this.grade = grade;
     }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sid=" + sid +
                ", grade=" + grade +
                '}';
    }


}
public class StudentBigCollections {
    public static void main(String[] args){

        List<Student> student1=new ArrayList<>();
        student1.add(new Student("Ramya",1,'A'));
        student1.add(new Student("Behara",2,'B'));
        student1.add(new Student("Raju",3,'C'));


        List<Student> student2=new ArrayList<>();
        student2.add(new Student("gadu",4,'D'));
        student2.add(new Student("sahithi",5,'A'));
        student2.add(new Student("vanaj",6,'C'));

       List<List<Student>>myStudents = Arrays.asList(student1,student2);
       List<Character> mystud= myStudents.stream()
               .flatMap(n->n.stream().map(sg->sg.grade))
               .collect(Collectors.toList());
        System.out.println(mystud.toString());

    }}

