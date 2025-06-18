package org.example.Top50CodingQuestions;

import java.util.Arrays;
import java.util.List;

public class LastElementOfAnArray {
    public static void main(String[] args){
      int numbers[] = {10,20,30,4,50,60,70,80,90};
      Arrays.stream(numbers).skip(numbers.length-1).findFirst().ifPresent(System.out::println);

    }
}
