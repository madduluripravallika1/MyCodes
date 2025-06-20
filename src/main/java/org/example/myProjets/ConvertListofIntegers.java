package org.example.myProjets;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertListofIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> myString =  numbers.stream()
                .mapToInt(n->n)
                .mapToObj(n->"Number"+n)
                .collect(Collectors.toList());
        System.out.println(myString);
    }

}
