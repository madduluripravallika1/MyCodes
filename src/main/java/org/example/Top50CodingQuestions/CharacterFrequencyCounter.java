package org.example.Top50CodingQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String myString="Hello world";
        Map<Character,Long> mine=myString.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(mine);
    }
}
