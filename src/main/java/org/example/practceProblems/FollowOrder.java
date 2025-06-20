
package org.example.practceProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FollowOrder {
    public static void main(String[] args) {
        List<Integer> myList= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<String,List<Integer>> myMap = myList.stream()
                .collect(Collectors.partitioningBy(n->n%2==0))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(entry->entry.getKey() ? "even":"odd",Map.Entry::getValue));
        System.out.println(myMap.toString());
    }
}

