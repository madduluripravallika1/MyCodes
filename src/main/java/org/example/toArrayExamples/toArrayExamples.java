package org.example.toArrayExamples;

import java.util.Arrays;
import java.util.List;

public class toArrayExamples {
    public static void main(String[] args) {
        List<String> myValues= Arrays.asList("A","B","C","D","1","2","3","4");
        Object arr[]=myValues.stream().toArray();
        System.out.println(arr.length);
         for(Object arring:arr){
             System.out.println(arring);
         }
    }
}
