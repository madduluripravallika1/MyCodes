package org.example.practceProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyDuplicateList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Zara", "Olivia", "Liam", "Emma", "Zara", "Noah", "Ava", "Liam", "Sophia", "Mason"
        );
        List<String> myList=names.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(myList);

    }
}
