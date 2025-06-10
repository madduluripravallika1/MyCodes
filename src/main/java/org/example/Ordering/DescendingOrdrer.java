package org.example.Ordering;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrdrer {
    public static void main(String[] args) {
        List<Integer> myvalues= Arrays.asList(10,35,87,56,98,78,65,45,36,01,89,9);
        List<Integer> reverseOrder=myvalues.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseOrder);
    }
}
