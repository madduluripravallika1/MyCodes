package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinSummaryStatistics {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40,50,60,70,80,90);
        Optional<Integer> myMinimumValue=numbers.stream()
                .min(Comparator.comparing(Integer::intValue));
        System.out.println(myMinimumValue.get());





    }
}
