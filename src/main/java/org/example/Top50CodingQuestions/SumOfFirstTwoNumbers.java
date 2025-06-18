package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;

public class SumOfFirstTwoNumbers {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,40,50);
       int sumValues= numbers.stream()
                .limit(2)
               .mapToInt(Integer::intValue)
               .sum();
        System.out.println(sumValues);

    }
}
