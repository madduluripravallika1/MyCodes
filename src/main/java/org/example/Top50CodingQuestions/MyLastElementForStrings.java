package org.example.Top50CodingQuestions;

import java.util.Arrays;

public class MyLastElementForStrings {
    public static void main(String[] args){
        String myList[]={"apple","Banana","charllie","Rajma","carrot","kajju"};
        Arrays.stream(myList).skip(myList.length-1).findFirst().ifPresent(System.out::println);
    }
}
