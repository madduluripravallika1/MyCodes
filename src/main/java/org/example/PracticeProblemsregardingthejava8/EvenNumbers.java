package org.example.PracticeProblemsregardingthejava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args){
        List<Integer> numbers= Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(numbers);
        List<Integer> myvalues=numbers.stream()
                .filter(str->str%2==0)
                .collect(Collectors.toList());
        System.out.println(myvalues);
    }
}
