package org.example.PracticeProblemsregardingthejava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Getlistofuniqueelements {
    public static void main(String[] args) {
      List<Integer> values= Arrays.asList(1, 2, 3, 2, 4, 3);
        List<Integer> finalResult=new ArrayList<>();
        values.stream().distinct().forEach(System.out::println);
    }
}
