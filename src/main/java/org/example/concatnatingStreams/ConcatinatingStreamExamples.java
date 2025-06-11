package org.example.concatnatingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatinatingStreamExamples {
    public static void main(String[] args) {
        List<String> animals= Arrays.asList("Tiger","Goat","Dog","Cat","Frog");
        List<String> birds=Arrays.asList("parrot","owl","sparrow");

        Stream a=animals.stream();
        Stream b=birds.stream();


        List<String> finallist= (List<String>) Stream.concat(a,b).collect(Collectors.toList());
        System.out.println(finallist);
        for (String items:finallist){
            System.out.println(items);
        }
    }
}
