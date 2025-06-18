package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> myList1= Arrays.asList(30,45,9);
        List<Integer> myList2=Arrays.asList(50,47,98,68);
        List<Integer> myList3 = Stream.concat(myList2.stream(),myList1.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(myList3);
    }
}
