package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CountOFNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40,50,60,70,80,90);
        long my=numbers.stream()
                .mapToInt(Integer::intValue)
                .count();
        System.out.println(my);
    }
}
