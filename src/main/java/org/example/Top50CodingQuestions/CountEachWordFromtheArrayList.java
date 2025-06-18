package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachWordFromtheArrayList {
    public static  void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> myLists = words.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(entry->entry.getKey(),entry->entry.getValue()));
        System.out.println(myLists);
    }
}
