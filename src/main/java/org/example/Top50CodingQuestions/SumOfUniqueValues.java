package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SumOfUniqueValues {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,2,3,5,6,6,8,7,8);
       int  sumNumbers=numbers.stream()
                .distinct()
               //distinct returns Integer not int values, that's why we need to convert
               .mapToInt(Integer::intValue)
               .sum();
        System.out.println("Sum of Unique Values :"+sumNumbers);


    }
}
