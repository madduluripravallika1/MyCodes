package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIndAllTheNumbersStartingwith1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(123, 456, 17, 198, 234, 145, 16, 890, 112, 321);
        List<Integer> myList=numbers.stream()
                .filter(s->String.valueOf(s).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(myList);

    }
}
