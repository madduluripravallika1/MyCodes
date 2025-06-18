package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinTwoStreams {
    public static void main(String[] args) {
        List<Integer> myList1=Arrays.asList(12,2);
        List<Integer> myList2= Arrays.asList(88,7,34,98);

        List<Integer> myList3 = Stream.concat(myList2.stream(),myList1.stream())
                .collect(Collectors.toList());
        System.out.println(myList3);
    }
}
