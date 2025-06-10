package org.example.mapsInJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyBy3 {
    public static void main(String[] args){
        List<Integer> myIntegers= Arrays.asList(10,20,30,40,50,60,70,80,90,100);
        List<Integer>  multipliedList=new ArrayList<>();
        myIntegers.stream()
                .map(str->str*3)
                .forEach(st->System.out.println(st));
//                .forEach(System.out::println);

    }
}
