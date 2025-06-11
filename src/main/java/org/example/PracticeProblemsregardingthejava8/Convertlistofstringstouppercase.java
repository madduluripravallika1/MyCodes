package org.example.PracticeProblemsregardingthejava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convertlistofstringstouppercase {
    public static void main(String[] args){
        List<String> myvalues= Arrays.asList("john", "emma", "alex");
        List<String> result=myvalues.stream()
                .map(str->str.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
