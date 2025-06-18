package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AverageOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40,50,60,70,80,90);
        OptionalDouble myValues=numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(myValues);
    }
}
