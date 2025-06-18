package org.example.Top50CodingQuestions;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static  void main(String[] args){
        String myValue="swiss";
        Optional<Character> values=myValue.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(str->str.getValue()==1)
                .map(n->n.getKey())
                .findFirst();
        System.out.println(values.get());

    }
}
