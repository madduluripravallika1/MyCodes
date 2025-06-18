package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;

public class SumOFAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40,50,60,70,80,90);
        int myvalues=numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(myvalues);
    }
}
