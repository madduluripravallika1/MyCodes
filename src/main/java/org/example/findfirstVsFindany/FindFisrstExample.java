package org.example.findfirstVsFindany;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFisrstExample {
    public static void main(String[] args) {
        List<Integer> mine= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
    /*    Optional<Integer> value=mine.stream()
                .findFirst();
        System.out.println(value.get());*/



        Optional<Integer> myValue=mine.stream()
                .findAny();
        System.out.println(myValue.get());
    }
}
