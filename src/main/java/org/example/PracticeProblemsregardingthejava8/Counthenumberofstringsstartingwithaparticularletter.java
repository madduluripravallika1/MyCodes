package org.example.PracticeProblemsregardingthejava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Counthenumberofstringsstartingwithaparticularletter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "David");
        List<String> results=new ArrayList<>();
        names.stream()
                .filter(str->str.startsWith("A"))
                .forEach(System.out::println);
    }
}
