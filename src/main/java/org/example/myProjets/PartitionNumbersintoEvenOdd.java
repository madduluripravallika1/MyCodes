package org.example.myProjets;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNumbersintoEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Map<Boolean,List<Integer>> myMapings = numbers.stream()
                .collect(Collectors.partitioningBy(n->n%2==0))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(n->n.getKey(),n->n.getValue()));
        System.out.println(myMapings);

    }
}
