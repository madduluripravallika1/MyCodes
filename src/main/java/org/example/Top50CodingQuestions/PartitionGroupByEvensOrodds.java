package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionGroupByEvensOrodds {
    public static void main(String[] args) {
        List<Integer> myValues= Arrays.asList(10,2,45,68,34,15,19,17,52,26,41,56,54,75,59);
        Map<Boolean, List<Integer>> partitionedByEvenOdd=myValues.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("odd Numbers: " + partitionedByEvenOdd.get(true));
        System.out.println("Even Numbers: " + partitionedByEvenOdd.get(true));
    }
}
