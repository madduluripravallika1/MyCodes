package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoLists {
    public static void main(String[] args) {
        List<Integer> myList1= Arrays.asList(10,20,30,40);
        List<Integer> myList2=Arrays.asList(20,30,10,30,40);
        myList1.stream()
                .filter(myList2::contains)
                .distinct()
                .forEach(System.out::println);
    }
}
