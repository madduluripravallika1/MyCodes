package org.example.myProjets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAllNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Raj", "Simran", "Karan", "Pooja");

        String myNmaes = names.stream()
                .collect(Collectors.joining(","));
        System.out.println(myNmaes);
    }
}
