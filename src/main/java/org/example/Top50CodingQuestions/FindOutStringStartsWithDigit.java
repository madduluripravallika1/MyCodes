package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;

public class FindOutStringStartsWithDigit {
    public static void main(String[] args){
        List<String> myvalues= Arrays.asList("1Applie","ramazan","quersies","5Bananas","6Tamota");
        myvalues.stream()
                .filter(n->!n.isEmpty() && Character.isDigit(n.charAt(0)))
                .forEach(System.out::println);

    }
}
