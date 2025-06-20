package org.example.problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args){
        String input="javastream";
        Map<Character, Long> myChars = input.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        myChars.entrySet()
               .stream()
               .filter(n->n.getValue()==1)
               .map(Map.Entry::getKey)
               .findFirst()
               .orElse(null);





    }
}
