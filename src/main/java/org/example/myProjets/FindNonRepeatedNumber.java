package org.example.myProjets;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindNonRepeatedNumber {
    public static void main(String[] args) {
        String input="javastream";
      Map<Character,Long> myCharacters = input.chars()
               .mapToObj(c->(char) c)
               .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

       myCharacters.entrySet()
               .stream()
               .filter(n->n.getValue()==1)
               .findFirst()
              .ifPresent(entry-> System.out.print(entry.getKey()));
    }
}
