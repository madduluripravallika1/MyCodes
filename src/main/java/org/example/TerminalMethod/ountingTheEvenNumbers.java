package org.example.TerminalMethod;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ountingTheEvenNumbers {
    public static void main(String[] args) {
        List<Integer> evening= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        long evenNumbers=evening.stream()
                .filter(n->n%2==0)
                .count();
        System.out.println(evenNumbers);


        Optional<Integer> myMinimum=evening.stream()
                .min((val1,val2)->  val1.compareTo(val2));
        System.out.println(myMinimum.get());

        Optional<Integer> maximumvalue=evening.stream()
                .max((val1,val2)->val1.compareTo(val2));
        System.out.println(maximumvalue.get());



    }

}
