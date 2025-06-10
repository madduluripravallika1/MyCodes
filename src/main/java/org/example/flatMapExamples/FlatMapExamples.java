package org.example.flatMapExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExamples {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(10,20);
        List<Integer> list2=Arrays.asList(30,40);
        List<Integer> list3=Arrays.asList(50,60);

        List<List<Integer>> myValues=Arrays.asList(list1,list2,list3);

        List<Integer> myList=myValues.stream()
                .flatMap(m->m.stream().map(n->n+10))
                .collect(Collectors.toList());
        System.out.println(myList);
    }
}
