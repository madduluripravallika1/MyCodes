package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LongestStringList {
    public static  void  main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "cherry", "blueberry", "kiwi", "pineapple", "grape", "mango");
        Optional<String> myStrings =  words.stream()
                .max(Comparator.comparing(String::length));
        System.out.println(myStrings.get());
    }
}
