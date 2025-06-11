package org.example.parellelStreamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    public java.lang.System System;
    String sname;
    int id;
    int score;

    public Student(String sname, int id, int score) {
        this.sname = sname;
        this.id = id;
        this.score = score;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", id=" + id +
                ", score=" + score +
                '}';
    }
}
public class FilterwithParllelStreams {
    public static void main(String[] args) {
        List<Student> myStudents=new ArrayList<>();
        myStudents.add(new Student("Ramu",01,90));
        myStudents.add(new Student("Rama",02,80));
        myStudents.add(new Student("Raju",03,50));
        myStudents.add(new Student("Ramya",04,99));
        myStudents.add(new Student("charu",05,97));
        myStudents.add(new Student("latha",06,40));
        myStudents.add(new Student("hyma",07,25));
        myStudents.add(new Student("hima",8,94));
        myStudents.add(new Student("ganga",9,69));
        myStudents.add(new Student("paru",10,74));
        myStudents.add(new Student("vindhya",11,76));
        myStudents.add(new Student("sandhya",12,25));
        myStudents.add(new Student("uday",13,99));
        System.out.println(myStudents.toString());
        //using sequential process--->Strema();
        List<Student> result =new ArrayList<>();
        myStudents.stream()
                .filter(str->str.getScore()>80)
                .limit(3)
                .forEach(stu->stu.System.out.println(stu.getSname()+" "+stu.getScore()));


        List<Student> result2 =new ArrayList<>();
        myStudents.parallelStream()
                .filter(str->str.getScore()>80)
                .limit(3)
                .forEach(stu->stu.System.out.println(stu.getSname()+" "+stu.getScore()));


        List<Student> result3 =new ArrayList<>();
        myStudents.stream()
                .parallel()
                .filter(str->str.getScore()>80)
                .limit(3)
                .forEach(stu->stu.System.out.println(stu.getSname()+" "+stu.getScore()));


    }
}
