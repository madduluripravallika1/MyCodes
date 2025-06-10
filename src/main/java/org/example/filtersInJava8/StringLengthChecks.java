package org.example.filtersInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthChecks {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Liam", "Ava", "Alexand", "Ethan", "Charlotte", "Mia", "Sebastian"
        );
        List<String> mylengths=names.stream()
                .filter(str->str.length()>6&&str.length()<8)
                .collect(Collectors.toList());
        System.out.println(mylengths);
    }
}
