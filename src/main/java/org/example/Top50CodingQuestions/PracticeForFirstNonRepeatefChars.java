package org.example.Top50CodingQuestions;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticeForFirstNonRepeatefChars {
    public static void main(String[] args){
        String myValues="swicss";
        Optional<Character> mychars=myValues.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(n->n, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n->n.getValue()==1)
                .map(n->n.getKey())
                .findFirst();
        System.out.println(mychars.get());
    }
}
