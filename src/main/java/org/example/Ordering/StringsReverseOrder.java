package org.example.Ordering;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringsReverseOrder {
    public static void main(String[] args) {
        List<String> myvalues= Arrays.asList("banana","grape","avacado","mango","gulab jamun","orange","zebra","apple","bat","cat","dog","rat");
         List<String> desc=myvalues.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(desc);
    }
}
