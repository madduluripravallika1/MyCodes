package org.example.mapsInJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintTheLengthOfAList {
    public static void main(String[] args){
        List<String> myCodes= Arrays.asList("bus","car","tracketr","cycle","bike","auto");
        List<Integer> Myvalues=myCodes.stream()
                .map(str->str.length())
                .collect(Collectors.toList());
        System.out.println(Myvalues);
    }
}
