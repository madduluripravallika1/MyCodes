package org.example.MyCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullValuesFromTheList {
    public static void main(String[] args) {
        List<String> myValues= Arrays.asList("Liam","Ram",null,"kajol","ravan","pranav",null);
        List<String> names=myValues.stream()
                .filter(n->n!=null)
                .collect(Collectors.toList());
        System.out.println(names);

    }
}
