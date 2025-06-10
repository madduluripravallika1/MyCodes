package org.example.Ordering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsAscendingOrder {
    public static void main(String[] args) {
        List<String> myValues= Arrays.asList("banana","grape","avacado","mango","gulab jamun","orange","zebra","apple","bat","cat","dog","rat");
        List<String> ascstr=myValues.stream().sorted().collect(Collectors.toList());
        System.out.println(ascstr);
    }
}
