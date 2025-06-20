/*
package org.example.practceProblems;

import java.util.Arrays;
import java.util.List;

public class FilterNamesStratWithA {
    public static void main(String[] args){
        List<String> myString= Arrays.asList(   "Alice",
                "bob",
                "AMANDA",
                "Albert",
                "Brian",
                "ALICE",
                "charlie",
                "Andrew",
                "Annie",
                "adam");
        myString.stream()
                .distinct()
                .filter(m->m.toUpperCase(myString))
                .filter(n->n.startsWith("A"))
                .forEach(System.out::println);
    }
}
*/
