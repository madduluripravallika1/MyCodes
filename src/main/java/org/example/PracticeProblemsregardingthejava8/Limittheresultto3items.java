package org.example.PracticeProblemsregardingthejava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Limittheresultto3items {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Delhi", "Mumbai", "Chennai", "Kolkata", "Bangalore");
        List<String> finalcities=new ArrayList<>();
        cities.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
