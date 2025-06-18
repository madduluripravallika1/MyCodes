package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class joinPrefixSuffixDelimeter {
    public static void main(String[] args){
        List<String> myList= Arrays.asList("ramana","Raju","Sita","Lava","Kusa","valmikhi");
        List<String> myList1= Collections.singletonList(myList.stream()
                .map(n -> "[" + n + "]" + ",")
                .collect(Collectors.joining(",")));
        System.out.println(myList);
    }
}
