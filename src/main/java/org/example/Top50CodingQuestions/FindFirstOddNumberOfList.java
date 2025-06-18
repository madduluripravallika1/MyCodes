package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstOddNumberOfList {
    public static void main(String[] args) {
        List<Integer> myvalues= Arrays.asList(4, 8, 10, 12, 15, 18, 21);
        Optional<Integer> oddNum=myvalues.stream()
                .distinct()
                .filter(n->n%2!=0)
                .findFirst();
        System.out.println(oddNum.get());


    }
}
