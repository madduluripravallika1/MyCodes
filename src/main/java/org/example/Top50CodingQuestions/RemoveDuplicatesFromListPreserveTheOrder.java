package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListPreserveTheOrder {
    public static void main(String[] args) {
        List<String> myList= Arrays.asList("Apple","Banana","apple","Oragne","Banana");
        List<String> removeTheDuplicates=myList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(removeTheDuplicates);
    }
}
