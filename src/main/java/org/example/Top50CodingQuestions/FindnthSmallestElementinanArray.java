package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindnthSmallestElementinanArray {
    public static void main(String[] args) {
        List<Integer> myValues= Arrays.asList(10,20,30,95,47,85,14,36,89,47,91,45,36,72,02,4);
        int n=3;
        Optional<Integer> mine=myValues.stream()
                .sorted()
                .skip(n-1)
                .findFirst();
        System.out.println(mine.get());
    }
}
