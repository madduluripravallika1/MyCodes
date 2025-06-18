package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class removeDuplicatesFollowsOrder {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(5, 3, 7, 5, 3, 9, 1, 7, 2);
        Set<Integer> sortTheNumbers=numbers.stream()
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(sortTheNumbers);
    }

}
