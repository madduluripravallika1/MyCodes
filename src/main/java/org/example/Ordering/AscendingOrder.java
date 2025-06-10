package org.example.Ordering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {
    public static void main(String[] args) {
        List<Integer> myvalues= Arrays.asList(10,35,87,56,98,78,65,45,36,01,89,9);
        List<Integer> ascendingOrder= myvalues.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingOrder);

    }
}
