package org.example.Top50CodingQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) throws  Exception {
        List<Integer> myValues= Arrays.asList(10, 20, 30, 10, 40, 50, 20, 60, 70, 30);
        Map<Integer,Long> findingDuplicateElemnts = new HashMap<>();
        Map<Integer, Long> findingDuplicateElemnts1 = myValues.stream()
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .entrySet()
               .stream()
               .filter(str->str.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
               //.map(n->n.getKey()).collect(Collectors.toMap(n->n,));
                       //.collect(Collectors.toList());
        System.out.println(findingDuplicateElemnts1);

    }
}
