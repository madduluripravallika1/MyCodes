package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrenceEachWordGivenSentence {
    public static void main(String[] args) {
        String sentence="I love coding and I love learning";
        String[] words=sentence.split(" ");
        Map<String, Long> wordsCount= Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(wordsCount);
    }
}
