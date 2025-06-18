package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FIndtheWordHighestLength {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","banana","kiwi","cherry");
        String mywords=words.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList())
                .get(2);
        System.out.println(mywords);
    }
}
