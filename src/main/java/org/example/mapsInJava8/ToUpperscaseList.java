package org.example.mapsInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperscaseList {
    public static void main(String[] args){
        List<String> myStrings= Arrays.asList("bus","car","tracketr","cycle","bike","auto");
        List<String> aftering=myStrings.stream()
                .map(str->str.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(aftering);
    }
}
