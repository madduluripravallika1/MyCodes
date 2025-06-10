package org.example.reducingValue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<String> myValues= Arrays.asList("A","B","C","D","1","2","3","4");
        Optional<String> valing=myValues.stream()
                .reduce((value,combinedValue)->value+combinedValue);
        System.out.println(valing.get());
    }
}
