package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxSummaryStatisctics {
    public static void main(String[] args) {
        List<Integer> myvalues= Arrays.asList(10,20,30,40,50,60,70,80,90,999,1080,657,1479,3257,74);
            Optional<Integer> myMaxValues=myvalues.stream()
                    .max(Comparator.comparing(Integer::intValue));
        System.out.println(myMaxValues.get());
    }
}
