package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortDecimalsReverseOrder {
    public static void main(String[] args){
        List<Double> myvalues= Arrays.asList(10.5,4.89,0.64,6.87,9.74,2.98,5.87);
        List<Double> values=myvalues.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(values);
    }
}
